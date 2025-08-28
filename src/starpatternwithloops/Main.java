package starpatternwithloops;

public class Main {
    public static void main(String[] args) {
        printSquareStar(5);
//        printSquareStar(10);
//        printSquareStar(20);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }

        // for each row = R and each column = C, should i print * or ""?
        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                if (row == 0 ||                          // first row
                  row == number - 1 ||                // last row
                  col == 0 ||                          // first column
                  col == number - 1 ||                // last column
                  row == col ||                        // main diagonal
                  col == number - row - 1             // reverse diagonal
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

//                System.out.print("(" + row + "," + col + ")");
            }
            System.out.println("");
        }

        //blä
    }
}
