package com.lab6.dataTransfer;

public class Utils {
    public static void printResponseMessages(Response resp){
        for(String msg: resp.messages){
            System.out.println(msg);
        }
    }
}
