public class Data {
    public static final int MAX = (int) (Math.random() * Integer.MAX_VALUE);
    private int[][] grid;

    public void repopuate() {}

    public int countIncreasingCols() {
        return 0; }

        public Data(int rows, int colums) {
            grid = new int[rows][colums];
        }

        public String toString() {
            String s = "";
            for (int[] row : grid) {
                for(int col : row) {
                    s += col + " ";
                }
                s += "\n";
            }
            return s;
        }
    }
