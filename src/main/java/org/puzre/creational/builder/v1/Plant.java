package org.puzre.creational.builder.v1;

public class Plant {

    private final int leafs;
    private final int fruits;
    private final int nodes;
    private final String color;

    public String getColor() {
        return this.color;
    }

    public Plant(Builder builder) {
        this.leafs = builder.leafs;
        this.fruits = builder.fruits;
        this.nodes = builder.nodes;
        this.color = builder.color;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Plant {" +
                "leafs=" + leafs +
                ", fruits=" + fruits +
                ", nodes=" + nodes +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder {

        private int leafs;
        private int fruits;
        private int nodes;
        private String color;

        public Builder leafs(int leafs) {
            this.leafs = leafs;
            return this;
        }

        public Builder fruits(int fruits) {
            this.fruits = fruits;
            return this;
        }

        public Builder nodes(int nodes) {
            this.nodes = nodes;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Plant build() {
            return new Plant(this);
        }

    }

}
