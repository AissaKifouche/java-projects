public class JedliksToyCar {
    private int drivenMeters = 0;
    private int batteryPourcentage = 100;
    public static JedliksToyCar buy() {
        JedliksToyCar brandNewCar = new JedliksToyCar();
        return brandNewCar;
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.drivenMeters);
    }

    public String batteryDisplay() {
        if (this.batteryPourcentage == 0) return "Battery empty";
        return String.format("Battery at %d%%", this.batteryPourcentage);
    }

    public void drive() {
        if (this.batteryPourcentage == 0){
            System.out.println("Battery empty");
        }
        else {
            this.drivenMeters += 20;
            this.batteryPourcentage --;
        }
    }
}
