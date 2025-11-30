public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        return switch (shirtNum){
            case 1 -> "goalie";
            case 5 -> "right back";
            case 2 -> "left back";
            case 4 ,3 -> "center back";
            case 6 ,7 ,8 -> "midfielder";
            case 9 -> "left wing";
            case 10 -> "striker";
            case 11 -> "right wing";
            default -> "invalid";
        };

    }
}
