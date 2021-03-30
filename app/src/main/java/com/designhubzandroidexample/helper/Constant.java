package com.designhubzandroidexample.helper;

import com.designhubz.androidsdk.helper.Product;
import com.google.gson.Gson;

public class Constant {
    public static Product mProduct;
    public static String getJsonString(Product product){
        Gson gson = new Gson();
        return gson.toJson(product);
    }
}
