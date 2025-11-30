class Scrabble {
    private int scrableScore = 0;
    Scrabble(String word) {
        word = word.toUpperCase();
        char c ;
        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            switch (c){
                case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> this.scrableScore += 1;
                case 'D', 'G' -> this.scrableScore += 2;
                case 'B', 'C', 'M', 'P'-> this.scrableScore += 3;
                case 'F', 'H', 'V', 'W', 'Y' -> this.scrableScore += 4;
                case  'K' -> this.scrableScore += 5;
                case  'J', 'X' -> this.scrableScore += 8;
                case  'Q', 'Z' -> this.scrableScore += 10;
            }
        }
    }

    int getScore() {
        return this.scrableScore;
    }

}
