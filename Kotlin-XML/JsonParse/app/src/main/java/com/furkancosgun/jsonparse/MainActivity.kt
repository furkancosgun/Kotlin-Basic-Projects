package com.furkancosgun.jsonparse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    val TAG = "XFC"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jsonData = "{\n" +
                "    \"comments\": \n" +
                "    [\n" +
                "  {\n" +
                "    \"postId\": 1,\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"id labore ex et quam laborum\",\n" +
                "    \"email\": \"Eliseo@gardner.biz\",\n" +
                "    \"body\": \"laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"postId\": 1,\n" +
                "    \"id\": 2,\n" +
                "    \"name\": \"quo vero reiciendis velit similique earum\",\n" +
                "    \"email\": \"Jayne_Kuhic@sydney.com\",\n" +
                "    \"body\": \"est natus enim nihil est dolore omnis voluptatem numquam\\net omnis occaecati quod ullam at\\nvoluptatem error expedita pariatur\\nnihil sint nostrum voluptatem reiciendis et\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"postId\": 1,\n" +
                "    \"id\": 3,\n" +
                "    \"name\": \"odio adipisci rerum aut animi\",\n" +
                "    \"email\": \"Nikita@garfield.biz\",\n" +
                "    \"body\": \"quia molestiae reprehenderit quasi aspernatur\\naut expedita occaecati aliquam eveniet laudantium\\nomnis quibusdam delectus saepe quia accusamus maiores nam est\\ncum et ducimus et vero voluptates excepturi deleniti ratione\"\n" +
                "  }\n" +
                "  ]\n" +
                "}"

        try {
            val jsonObject = JSONObject(jsonData)//Json format??na cevrilir

            //Bir json arrayi alcag??mz???? soyleriz key alan?? comments olan
            val jsonPlaceHolderArrayData = jsonObject.getJSONArray("comments")


            //For dongusu kurarak ald??g??m??z listenin i??erigini yazd??r??rz
            for (i in 0 until jsonPlaceHolderArrayData.length()){
                val convertedJsonObject = jsonPlaceHolderArrayData.getJSONObject(i)
                Log.d(TAG, "JSON OBJECT:"+convertedJsonObject)
                Log.d(TAG, "OBJECT ID :"+convertedJsonObject.getInt("id"))
                Log.d(TAG, "OBJECT POST ID :"+convertedJsonObject.getString("postId"))
                Log.d(TAG, "OBJECT NAME :"+convertedJsonObject.getString("name"))
                Log.d(TAG, "OBJECT EMA??L :"+convertedJsonObject.getString("email"))
                Log.d(TAG, "OBJECT BODY :"+convertedJsonObject.getString("body"))
            }

        }catch (e: JSONException){
            Log.e(TAG, "JSON-ERROR:${e.localizedMessage}")
        }
    }
}