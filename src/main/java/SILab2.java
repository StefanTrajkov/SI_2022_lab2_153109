import java.util.ArrayList;
import java.util.List;

public class SILab2 {

    public static List<String> function(List<String> list) {
        if (list.size() <= 0) { // node A
            throw new IllegalArgumentException("List length should be greater than 0"); //node B
        }
        int n = list.size(); // node C
        int rootOfN = (int) Math.sqrt(n); // node D
        if (rootOfN * rootOfN  != n) { // node E
            throw new IllegalArgumentException("List length should be a perfect square"); // node F
        }
        List<String> numMines = new ArrayList<>(); // node G
        for (int i = 0; i < n; i++) { // node H
            if (!list.get(i).equals("#")) { // node I
                int num = 0; // node J
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) { // node K
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){ // node L
                        num += 2; // node M
                    }
                    else { // node N
                        num  += 1; // node O
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){ // node P
                    num++; // node Q
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){ // node R
                    num++; // node S
                }
                numMines.add(String.valueOf(num)); // node T
            }
            else { // node U
                numMines.add(list.get(i)); // node V
            }
        }
        return numMines; // node W
    }
}
