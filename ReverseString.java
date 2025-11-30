class ReverseString {

    String reverse(String inputString) {
        String rr = "";
        int y = inputString.length();
        for (int i = 1; i <= y; i++) {
            rr += inputString.charAt( y - i );
        }
        return rr;
    }
}
