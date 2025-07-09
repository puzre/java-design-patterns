package org.puzre.creational.builder;

public class House {

    private final int doors;
    private final int windows;
    private final String color;

    public House(Builder builder) {
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.color = builder.color;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "House {" +
                "doors=" + doors +
                ", windows=" + windows +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder {

        private int doors;
        private int windows;
        private String color;

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder windows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder colors(String color) {
            this.color = color;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }

}
