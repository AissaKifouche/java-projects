class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    public int distanceDriven = 0;
    public int batteryPourcentage = 100;
    NeedForSpeed(int speed, int batteryDrain) {
        this.batteryDrain = batteryDrain;
        this.speed =speed;
    }

    public boolean batteryDrained() {
        return batteryPourcentage < batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (!this.batteryDrained()){
            this.distanceDriven += speed;
            this.batteryPourcentage -= batteryDrain;
            this.batteryPourcentage = Math.max(0, this.batteryPourcentage);
        }

    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int res = car.batteryPourcentage / car.batteryDrain;
        return car.speed * res >= this.distance;
    }
}
