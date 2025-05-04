public class Main {
    public static void main(String[] args) {
        int[][] grid = {
            {10, 50, 40},
            {20, 40, 20},
            {30, 50, 30}
        };

        int[][] grid2 = {
            {10, 540, 440, 440},
            {220, 450, 440, 190}
        };

        //Data d = new Data(7, 5);
        Data d1 = new Data(grid);
        Data d2 = new Data(grid2);


       // System.out.println(Data.MAX);
       // System.out.println(d);
        d1.repopulate();
        System.out.println(d1);
        System.out.println(d1.countIncreasingCols());
        
        d2.repopulate();
        System.out.println(d2);
        System.out.println(d2.countIncreasingCols());
    }
}
