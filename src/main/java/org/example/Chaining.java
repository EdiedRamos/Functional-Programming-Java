package org.example;

public class Chaining {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("Edied")
                .append("Ramos");
        System.out.println(stringBuilder);

        Chainer ediedramos = new Chainer();
        ediedramos
                .sayEdied()
                .sayRamos()
                .sayEdied()
                .sayRamos();
    }

    static class Chainer {
        public Chainer sayEdied() {
            System.out.println("Edied");
            return this;
        }

        public Chainer sayRamos() {
            System.out.println("Ramos");
            return this;
        }
    }
}
