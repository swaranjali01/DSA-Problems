package Array;

import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArrays {

    public static List<Integer> findUnion(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
           
            if (!result.isEmpty() && result.get(result.size() - 1) == a[i]) {
                i++;
                continue;
            }
            if (!result.isEmpty() && result.get(result.size() - 1) == b[j]) {
                j++;
                continue;
            }

            if (a[i] < b[j]) {
                result.add(a[i++]);
            } else if (a[i] > b[j]) {
                result.add(b[j++]);
            } else {
                result.add(a[i]);
                i++;
                j++;
            }
        }

       
        while (i < a.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                result.add(a[i]);
            }
            i++;
        }

        
        while (j < b.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != b[j]) {
                result.add(b[j]);
            }
            j++;
        }

        return result;
    }

}

