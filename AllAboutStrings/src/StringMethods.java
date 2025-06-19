public class StringMethods {
    public static void main(String[] args) {

        String birthDate = "25/11/1982";
//        this will give us 6 as 1 in 1982 is the 6 char in the string
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println(
//                          Here we input 6 in substring
          "Birth year = " + birthDate.substring(startingIndex));
//                          Here we start at 3 and end at 5, 5 is not
//                          we stop one short of 5, so 3 and 4.
        System.out.println("Month = " + birthDate.substring(3, 5));
//      delimiter is what's going between every element.
        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);


//        dont do this <--
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate concat = " + newDate);

        newDate = "25".concat("/")
                      .concat("11")
                      .concat("/")
                      .concat("1982");
        System.out.println("newDate concat*4 = " + newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("/", "-"));
        System.out.println(newDate.replace("2", "00"));
        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));
        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
