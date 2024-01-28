package java.examples;

class RecursiveExamples {
    public static void main(String[] args) {

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

    static int uniquePathsCount(int row, int column) {
        if (row * column == 0) {
            return 0;
        }

        if (row == 1 || column == 1) {
            return 1;
        }
        return uniquePathsCount(row - 1, column) + uniquePathsCount(row, column - 1);
    }

    static int countPartitions(int n, int m) {
        return 4;
    }
}
