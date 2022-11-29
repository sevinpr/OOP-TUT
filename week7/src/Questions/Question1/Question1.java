package Questions.Question1;
import java.util.*;
public class Question1 {
        int[][]  cells;
        // creates a nxn size board
        public Question1(int n) {
            cells = new int[n][n];
// fill in array with random ints in the range [0, 100]
            Random generator = new Random();
            for (int i=0; i < n; i++)
                for (int j=0; j < n; j++)
                    cells[i][j] = generator.nextInt(101);
        }
        // display the contents of the board
        public void print() {
            for (int[] r : cells) { // for all rows
                for (int c : r) // for every element in current row
                    System.out.print(c + " ");
                System.out.println();
            }
            //System.out.println(cells.length);
        }

        public int findMaxInRow(int row) {
            var arrCopy = Arrays.copyOf(cells[row],cells[row].length);
            Arrays.sort(arrCopy);
            return arrCopy[arrCopy.length - 1];
        }

//        public int findMaxDiagonal(int row, int column){
//            int length = cells.length;
//            int diaLines = (length+length)-1;
//        }
}

