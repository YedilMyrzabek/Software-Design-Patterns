package org.example.BuilderPattern;

public class House {
    private final int numRooms;
    private final int numFloors;
    private final boolean hasPool;
    private final boolean hasGarage;

    private House(Builder builder) {
        this.numRooms = builder.numRooms;
        this.numFloors = builder.numFloors;
        this.hasPool = builder.hasPool;
        this.hasGarage = builder.hasGarage;
    }

    public static class Builder {
        private int numRooms;
        private int numFloors;
        private boolean hasPool;
        private boolean hasGarage;

        public Builder setRooms(int numRooms) {
            this.numRooms = numRooms;
            return this;
        }

        public Builder setFloors(int numFloors) {
            this.numFloors = numFloors;
            return this;
        }

        public Builder setPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public Builder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House with " + numRooms
                + " rooms: " + numFloors
                + " floors: " + hasPool
                + ", garage: " + hasGarage;
    }
}
