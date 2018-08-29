/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.productdummy;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * Here I tried to Parse JSON object to JSON Array it is not working.
 * Used JSONObject , JSONParser, JSONArray.
 * 
 */
public class JsonToJava {

    String inline;

    public static void main(String[] args) {
        JsonToJava obj = new JsonToJava();
        obj.run();
    }

    private void run() {

        try {
            URL url = new URL("http://cat-store-api.frostdigital.se/api");//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            conn.connect();
            int responsecode = conn.getResponseCode();
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : " + conn.getResponseCode());
            } else {
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    inline += sc.nextLine();
                }
                System.out.println("\nJSON data in string format");
                System.out.println(inline);
                sc.close();
            }

            //JSONParser reads the data from string object and break each data into key value pairs
            JSONParser parse = new JSONParser();
            //Type caste the parsed json data in json object
            JSONObject jobj = (JSONObject) parse.parse(inline);
            //Store the JSON object in JSON array as objects 
            JSONArray jsonArray = (JSONArray) jobj.get("products");
            //Get data for Results array
            for (int i = 0; i < jsonArray.size(); i++) {
                //Store the JSON objects in an array
                //Get the index of the JSON object and print the values as per the index
                JSONObject jsonobj_1 = (JSONObject) jsonArray.get(i);
                System.out.println("\nImageUrl: " + jsonobj_1.get("imageurl"));
                System.out.println("\nName: " + jsonobj_1.get("name"));
                //Store the data as String objects

            }
            conn.disconnect();

        } catch (Exception e) {
            System.out.println("Exception in NetClientGet:- " + e);

        }

    }

}
