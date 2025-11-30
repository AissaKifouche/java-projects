class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase();
        for (char i : phrase.toCharArray()) {
            for (char j : phrase.substring(phrase.indexOf(i) + 1).toCharArray()){
                if (Character.isLetter(i) && Character.isLetter(j)) {
                    if (i == j) return false;
                }
            }
        }
        return true;
    }

}
