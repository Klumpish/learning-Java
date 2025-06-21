public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex, int tonerLevel) {
        this.pagesPrinted = 0;
        this.duplex = duplex;
        this.tonerLevel = (tonerLevel >= 0 &&
          tonerLevel <= 100) ? tonerLevel : -1;
    }

    public int addToner(int add) {
        if (add < 0 || (tonerLevel + add) > 100) {
            return -1;

        } else {
            return this.tonerLevel += add;
        }
    }

    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;

//        if (pages <= 0) {
//            return -1;
//        }
//        if (duplex) {
//            this.tonerLevel -= pages / 2;
//            this.pagesPrinted += pages / 2;
//            System.out.println(
//              "its a duplex printer only " + pages / 2 + " needed");
//            return pages / 2;
//        } else {
//            this.tonerLevel -= pages;
//            this.pagesPrinted += pages;
//            System.out.println("normal printer printing " + pages);
//            return pages;
//        }

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
