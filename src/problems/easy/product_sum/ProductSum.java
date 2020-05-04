package problems.easy.product_sum;

import java.util.List;

public class ProductSum {
    private static int sumHelper(List<Object> array, int depth) {
        int sum = 0;
        for (Object value : array) {
            if (value instanceof Integer) {
                sum += (int) value;
            }
            if (value instanceof List) {
                sum += sumHelper((List) value, depth + 1);
            }
        }
        return sum * depth;
    }

    public static int productSum(List<Object> array) {
        return sumHelper(array, 1);
    }
}
