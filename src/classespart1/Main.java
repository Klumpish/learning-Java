package classespart1;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.setMake("Maserati");
//        car.setModel("Carrera");
//        car.setDoors(3);
//        car.setConvertible(true);
//        car.setColor("black");
//
//        System.out.println("make = " + car.getMake());
//        System.out.println("model = " + car.getModel());
//        car.describeCar();
//
//        Car targa = new Car();
//        targa.setMake("Maserati");
//        targa.setModel("Targa");
//        targa.setDoors(2);
//        targa.setConvertible(false);
//        targa.setColor("red");
//        targa.describeCar();
//        BankAccount bankAccount = new BankAccount(123, 24.2, "Heffa",
//          "Heffa@Heffa.com", "888-888-555");
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getAccNumber());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getEmail());

        BankAccount timsAccount = new BankAccount("tim", "Tim@tim.com",
          "555-555-5555");
        System.out.println(
          "AccountNo: " + timsAccount.getAccNumber() + "; name " + timsAccount.getName());
    }
}
