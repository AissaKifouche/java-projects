public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int units = 0;

    @Override
    public void drive() {
        this.units += 20;
    }

    @Override
    public int getDistanceTravelled() {
        return this.units;
    }
}
