package com.github.jnh5y;

import java.util.List;

public class MyJavaClass {
    public static void function(Object[] input) {
        System.out.println("Called function(Object[]) with " + input.length + " inputs.");
        for (int i = 0; i < input.length; i++) {
            System.out.println("  Object " + i + ":" + input[i]);
        }
    }

//     public static void function(Object... input) {
//         System.out.println("Called function(Object ...) with " + input.length + " inputs.");
//         if( input.length == 0 && input[0] instanceof List){
//             function((List<Object>) input[0]);
//             return;
//         }
//         for (int i = 0; i < input.length; i++) {
//             System.out.println("  Object " + i + ":" + input[i]);
//         }
//     }

    // NB: This function is used.
    public static void function(List<Object> input) {
        System.out.println("Called function(List) with " + input.size() + " inputs.");
        for (int i = 0; i < input.size(); i++) {
            System.out.println("  Object " + i + ":" + input.get(i));
        }
    }

    public static void function(Integer[] input) {
        System.out.println("Called function(Integer[]) with " + input.length + " inputs.");
        for (int i = 0; i < input.length; i++) {
            System.out.println("  Object " + i + ":" + input[i]);
        }
    }

//     public static void function(Integer... input) {
//         System.out.println("Called function(Integer...) with " + input.length + " inputs.");
//         for (int i = 0; i < input.length; i++) {
//             System.out.println("  Object " + i + ":" + input[i]);
//         }
//     }


}
