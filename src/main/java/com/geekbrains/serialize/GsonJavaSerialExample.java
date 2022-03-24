package com.geekbrains.serialize;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.geekbrains.spoonaccular.model.RecipesSearchResponseItem;
import com.google.gson.Gson;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GsonJavaSerialExample {

    public static void main(String[] args) throws IOException {

        byte[] bytes = new FileInputStream("item.json").readAllBytes();
        String json = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(json);

        Gson gson = new Gson();

        RecipesSearchResponseItem item = gson.fromJson(json, RecipesSearchResponseItem.class);
        System.out.println(item);

    }
}
