package com.pentlander.nullaway;

public class Main {
    record Foo(String test) {}

    public static void main(String[] args) {
        System.out.println(new Foo("Test"));

        String out = "foo";
//        String out = switch (new Random().nextInt()) {
//            case 10 -> foo();
//            case 11 -> null;
//            case 12 -> "123";
//            default -> "fjdaksl";
//        };
//
        System.out.println(out);
    }

}
