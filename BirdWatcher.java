
class BirdWatcher {
    private final int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length - 1] ++;
    }

    public boolean hasDayWithoutBirds() {
        for (int i : this.birdsPerDay) {
            if ( i == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum  =  0 ;
        if ( numberOfDays <= birdsPerDay.length) {
            for (int i = 0; i < numberOfDays; i++) {
                sum += this.birdsPerDay[i];
            }
        }
        else {
            for (int i : this.birdsPerDay){
                sum += i ;
            }
        }
        return sum;
    }

    public int getBusyDays() {
        int bdays = 0 ;
        for (int i : this.birdsPerDay){
            if (i>=5) bdays ++ ;
        }
        return bdays;
    }
}
