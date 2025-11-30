public class EliudsEggs {
    public int eggCount(int number) {
        int bitsOfOne = 0;
        while (number != 0){
            if (number % 2 == 1) bitsOfOne ++;
            number /= 2;
        }
        return bitsOfOne;
    }
}
