package org.example.BuilderPattern;

public class House {
    private final int numRooms; //Number of rooms
    private final int numFloors; //Number of floors
    private final boolean hasPool; //Has a pool?
    private final boolean hasGarage; //Has a garage?

    //private constructor to use Builder
    private House(Builder builder) {
        this.numRooms = builder.numRooms;
        this.numFloors = builder.numFloors;
        this.hasPool = builder.hasPool;
        this.hasGarage = builder.hasGarage;
    }

    //Builder class to build house step-by-step
    public static class Builder {
        private int numRooms;
        private int numFloors;
        private boolean hasPool;
        private boolean hasGarage;

        //Methods to set house's parameters
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

        //build method to return constructed house
        public House build() {
            return new House(this);
        }
    }

    //Text definition of House
    @Override
    public String toString() {
        return "House with " + numRooms
                + " rooms: " + numFloors
                + " floors: " + hasPool
                + ", garage: " + hasGarage;
    }

    /*The Builder pattern allows us to construct complex objects step by step*/
}
