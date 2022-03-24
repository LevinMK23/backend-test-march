package com.geekbrains.serialize;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.geekbrains.spoonaccular.model.RecipesSearchResponseItem;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class JacksonJavaSerialExample {

    public static void main(String[] args) throws IOException {

        byte[] bytes = new FileInputStream("item.json").readAllBytes();
        String json = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(json);

        ObjectMapper mapper = new ObjectMapper();

        RecipesSearchResponseItem item = mapper.readValue(json, RecipesSearchResponseItem.class);
        System.out.println(item);

    }
}
