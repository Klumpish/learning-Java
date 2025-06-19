public class StringOptionsBuilder {
    public static void main(String[] args) {
        String hellowWorld = "Hello" + " World";
//        we need to assign this to a variable else nothing will
//        happen
        hellowWorld.concat(" and Goodbye");

//        this wont work
//        StringBuilder helloWorldBuilder = "Hello" + " World";
        StringBuilder helloWorldBuilder = new StringBuilder(
          "Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(hellowWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));
        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder test = new StringBuilder("Hello Test World");
//        test.reverse();
//        test.setLength(5); // allows only 5 chars
//        test.delete(5, 10); // removes Test
//        test.deleteCharAt(6); // removes T
//        test.insert(6, "Heffa "); // Hello Heffa Test World
        test.reverse().setLength(5);
        printInformation(test);
       
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity() + "\n");
    }
}
