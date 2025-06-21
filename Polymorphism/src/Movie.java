public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }
}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
//        here we use repeat and get the 3 strings on a line of
//        there own.
        System.out.printf(".. %s%n".repeat(3), "Pleasant Scene",
          "Scary Music", "Somthing Bad Happens");
    }
}
