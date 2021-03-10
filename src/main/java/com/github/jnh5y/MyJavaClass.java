package com.github.jnh5y;

public class MyJavaClass {
    public static void arrayFunction(Object[] input) {
        System.out.println("Called arrayFunction with " + input.length + " inputs.");
        for (int i = 0; i < input.length; i++) {
            System.out.println("  Object " + i + ":" + input[i]);
        }
    }

    public static void varargsFunction(Object... input) {
        System.out.println("Called varargsFunction with " + input.length + " inputs.");
        for (int i = 0; i < input.length; i++) {
            System.out.println("  Object " + i + ":" + input[i]);
        }
    }

    public static void arrayFunctionInteger(Integer[] input) {
        System.out.println("Called arrayFunctionInteger with " + input.length + " inputs.");
        for (int i = 0; i < input.length; i++) {
            System.out.println("  Object " + i + ":" + input[i]);
        }
    }

    public static void varargsFunctionInteger(Integer... input) {
        System.out.println("Called varargsFunctionInteger with " + input.length + " inputs.");
        for (int i = 0; i < input.length; i++) {
            System.out.println("  Object " + i + ":" + input[i]);
        }
    }


}