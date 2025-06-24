import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie = new Adventure("Star Wars");
//        theMovie.watchMovie();
//
//        Movie theMovie2 = Movie.getMovie("comedy", "Star Wars");
//        theMovie2.watchMovie();

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Type (A for Adventure, C for " +
              "Comedy, S for ScienceFiction or Q to quit): " + ")");
            String type = input.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter Movie Title:");
            String title = input.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
