import java.util.LinkedList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        LinkedList<String> list = new LinkedList<>();
        char ll = Character.toUpperCase(a);
        int i = ll - 'A' ;

        String line ="";
        int j = 0;
        while ( j <= i) {
            for (int k = 0; k < 2*i+1; k++) {
                if (k + j == i || k - j == i) line += Character.toString(0x0041 + j);
                else line += " ";
            }
            j++;
            list.add(line);
            line = "";
        }
        j = i - 1;
        while (j>=0 ){
            for (int k = 0; k < 2*i+1; k++) {
                if (k + j  == i || k - j == i) line += Character.toString(0x0041 + j);
                else line += " ";
            }
            j--;
            list.add(line);
            line ="";
        }
        return list;
    }

}
