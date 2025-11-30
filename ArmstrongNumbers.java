class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        if (numberToCheck == 0) return true;
        int numOfDigits = String.valueOf(numberToCheck).length();
        int sum = 0;
        int a = numberToCheck;

        while (numberToCheck != 0){
            sum += Math.pow(numberToCheck % 10, numOfDigits);
            numberToCheck /= 10;
        }
        if (sum == a) return true;
        return false;
    }

}
