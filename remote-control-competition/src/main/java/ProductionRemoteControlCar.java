class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private int units = 0;
    private int numberOfVictories = 0;

    @Override
    public void drive() {
        this.units += 10;
    }

    @Override
    public int getDistanceTravelled() {
        return this.units;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return this.numberOfVictories - o.numberOfVictories;
    }
}
