package com.company;

public class Main {

    public static void print(int idx, Object obj) {
        System.out.println(String.format("[%d]: %s", idx, obj.toString()));
    }

    public static void demoOperation() {
        print(1, 3 + 6);
        print(2, 3 - 6);
        print(3, 3 * 6);
        print(4, 3 / 6);
        print(5, 3 % 6);
        print(6, 3 >> 6);
        print(7, 3 << 6);
        print(8, 3 & 6);
        print(9, 3 | 6);
        print(10, 3 ^ 6);
        print(11, 3 == 6);
        print(12, 3 != 6);
        print(13, 3 >>> 6);
    }

    public static void demoString(){
        String str = "hello world";
        print(1, str.indexOf('x'));
        print(2, str.charAt(1));
        print(3, str.codePointAt(1));
        print(4, str.compareToIgnoreCase("Hello world"));
        print(5, str.compareTo("hello xorld"));
        print(6, str.compareTo("hello vorld"));
    }
    public static void main(String[] args) {
        // write your code here
        // System.out.println("hello idea");
//        print(1, "test");
//        print(2, '3');
//        print(3, 4);
//        demoOperation();
        demoString();
    }
}
