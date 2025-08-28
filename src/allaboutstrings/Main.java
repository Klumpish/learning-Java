package allaboutstrings;

public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t   \n");

        String hellowWorld = "Hello World";
        System.out.printf("index of r = %d %n",
          hellowWorld.indexOf('r'));
        System.out.printf("index of World = %d %n",
          hellowWorld.indexOf("World"));

        System.out.printf("index of l = %d %n",
          hellowWorld.indexOf('l'));
        System.out.printf("index of l = %d %n",
          hellowWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n",
          hellowWorld.indexOf('l', 3));
        System.out.printf("index of l = %d %n",
          hellowWorld.lastIndexOf('l', 8));

        String helloWorldLower = hellowWorld.toLowerCase();
        if (hellowWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (hellowWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }

        if (hellowWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (hellowWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }

        if (hellowWorld.contains("World")) {
            System.out.println("String contains World");
        }

        if (hellowWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        if (string.isEmpty()) {
            System.out.println("Empty String");
            return;
        }
        if (string.isBlank()) {
            System.out.println("Blank String");

        }
        System.out.printf("Length = %c %n", string.charAt(0));

//      to get the last char
        System.out.printf("Last char = %c %n",
          string.charAt(length - 1));

    }
}
