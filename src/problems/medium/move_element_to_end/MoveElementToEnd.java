package problems.medium.move_element_to_end;

import java.util.*;

public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int size = array.size();
        int i = 0;
        while (i < size) {
            int val = array.get(i);
            if (val == toMove) {
                array.add(val);
                array.remove(i);
                size--;
                Collections.swap(array, i, size);
            } else {
                i++;
            }
        }
        return array;
    }
}
