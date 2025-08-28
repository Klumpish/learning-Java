package constructorchallenge;

public class Main {
    public static void main(String[] args) {
        Customer tobbe = new Customer("tobbe", 999, "tobbe@tobbe.com");
        System.out.println(tobbe.getName());
        System.out.println(tobbe.getCreditLimit());
        System.out.println(tobbe.getEmail());
        Customer one1 = new Customer();
        System.out.println(one1.getName());
        System.out.println(one1.getCreditLimit());
        System.out.println(one1.getEmail());
        Customer one2 = new Customer("heffa", "Heffa@heffa.com");
        System.out.println(one2.getName());
        System.out.println(one2.getCreditLimit());
        System.out.println(one2.getEmail());
    }
}
