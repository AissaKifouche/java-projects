class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        String newString ="";
        for (int i = 0; i < stringToVerify.length(); i++) {
            if (Character.isLetterOrDigit(stringToVerify.charAt(i))) newString += stringToVerify.charAt(i);
        }
        if (newString.length() != 10) return false;
        int sum = 0;
        for (int i = 0; i < newString.length(); i++) {
            if (newString.charAt(i) == 'X') {
                if (!(i == newString.length() - 1)) return false;
                sum += (10 - i) * 10;
            }
            else if (Character.isLetter(newString.charAt(i))) return false;
            else sum += Integer.parseInt(String.valueOf(newString.charAt(i))) * (10 - i);
        }
        return (sum % 11 == 0);
    }

}
