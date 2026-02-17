package com.example;

public class Main {
    static void main() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
