package encapsulationchallenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(true, 35);
        System.out.println(
          "pages printed " + printer.getPagesPrinted());
        System.out.println("toner level " + printer.getTonerLevel());
        System.out.println("is duplex " + printer.isDuplex());
        printer.printPages(22);

        System.out.println(
          "pages printed " + printer.getPagesPrinted());
        System.out.println("toner level " + printer.getTonerLevel());
        printer.addToner(40);
        System.out.println("toner level " + printer.getTonerLevel());


    }
}
