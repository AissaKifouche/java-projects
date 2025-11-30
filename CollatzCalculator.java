class CollatzCalculator {

    int computeStepCount(int start) {
        if (start <= 0) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        }
        if (start == 1) return 0;
        if (start % 2 == 0) start /= 2;
        else start = start * 3 + 1;
        return 1 + computeStepCount(start);
    }

}
