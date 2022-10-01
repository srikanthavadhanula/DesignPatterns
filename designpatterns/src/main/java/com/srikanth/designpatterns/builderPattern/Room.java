package com.srikanth.designpatterns.builderPattern;

public class Room {

    private int bed; // Mandatory Facility
    private boolean onlinePayment; // Mandatory Facility
    private boolean wifi; // Optional Facility
    private boolean bonfire; // Optional Facility
    private boolean breakfast; // Optional Facility
    private boolean ac; // Optional Facility
    private int bedLamps; // Optional Facility

    public Room(builder build) {
        this.wifi = build.wifi;
        this.bonfire = build.bonfire;
        this.breakfast = build.breakfast;
        this.ac = build.ac;
        this.bed = build.bed;
        this.onlinePayment = build.onlinePayment;
        this.bedLamps = build.bedLamps;
    }

    @Override
    public String toString() {
        return "Room{" +
                "wifi=" + wifi +
                ", bonfire=" + bonfire +
                ", breakfast=" + breakfast +
                ", ac=" + ac +
                ", bed=" + bed +
                ", onlinePayment=" + onlinePayment +
                ", bedLamps=" + bedLamps +
                '}';
    }

    public static class builder {
        private int bed;
        private boolean onlinePayment;
        private boolean wifi;
        private boolean bonfire;
        private boolean breakfast;
        private boolean ac;
        private int bedLamps;

        public builder(int bed, boolean onlinePayment) {
            this.bed = bed;
            this.onlinePayment = onlinePayment;
        }

        public builder wifi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        public builder bonfire(boolean bonfire) {
            this.bonfire = bonfire;
            return this;
        }

        public builder breakfast(boolean breakfast) {
            this.breakfast = breakfast;
            return this;
        }

        public builder ac(boolean ac) {
            this.ac = ac;
            return this;
        }

        public builder bedLamps(int bedLamps) {
            this.bedLamps = bedLamps;
            return this;
        }

        public Room build() {
            return new Room(this);
        }

    }


}
