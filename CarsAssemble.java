public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double successRate = 0.0;
        if ( speed >=0 && speed <= 10){
            if (speed == 0) return 0;
            else if (speed <= 4) successRate = 1.0;
            else if (speed <= 8) successRate = 0.9;
            else if (speed == 9) successRate = 0.8;
            else successRate = 0.77;

            return 221*speed*successRate;
        }
        else throw new IllegalArgumentException("speed cant be below zero neither above 10");
    }

    public int workingItemsPerMinute(int speed) {
        if (speed >= 0 && speed <= 10){
            return (int)productionRatePerHour(speed) / 60;
        }
        else throw new IllegalArgumentException("speed cant be below zero neither above 10");
    }
}
