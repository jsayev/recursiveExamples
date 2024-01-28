package examples.java;

class RecursiveExamples {
    public static void main(String[] args) {
        System.out.println(countPartitions(6, 4));
    }

    /**
     * @param i inclusive number to sum numbers from 0 to it
     * @return sum of numbers
     */
    private static int sum(int i) {
        return i > 0 ?
                i + sum(i - 1) :
                i < 0 ?
                        i - sum(Math.abs(i) - 1) :
                        0;
    }

    /**
     * @param row    horizontal cells count
     * @param column vertical cells count
     * @return count of unique paths possible from (0,0) cell to (row,column) cell
     */
    static int uniquePathsCount(int row, int column) {
        if (row * column == 0) {
            return 0;
        }

        if (row == 1 || column == 1) {
            return 1;
        }
        return uniquePathsCount(row - 1, column) + uniquePathsCount(row, column - 1);
    }

    /**
     * @param n number of objects/items
     * @param m max number of unique partitioning allowed
     * @return total number of unique partitioning
     */
    static int countPartitions(int n, int m) {
        if (n == 0) {
            return 1;
        }
        if (m == 0 || n < 0) {
            return 0;
        }
        return countPartitions(n - m, m) + countPartitions(n, m - 1);
    }
}
