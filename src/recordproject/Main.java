package recordproject;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Student s = new Student("s92300" + i, switch (i) {
                case 1 -> "Mary";
                case 2 -> "Jane";
                case 3 -> "John";
                case 4 -> "Sara";
                case 5 -> "Heffa";
                default -> "Anonymous";
            }, "05/11/1985", "Java Masterclass");
            //will use the toString method.
            System.out.println(s);
        }

        for (int i = 1; i <= 5; i++) {
            //here we use the record
            LPAStudent s = new LPAStudent("S8888" + i, switch (i) {
                case 1 -> "Mary";
                case 2 -> "Jane";
                case 3 -> "John";
                case 4 -> "Sara";
                case 5 -> "Heffa";
                default -> "Anonymous";
            }, "05/11/1985", "Java Suckerclass");
            System.out.println(s);
//            System.out.println(s.id());
        }
        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985",
          "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S696969", "Bill",
          "06/12/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(
          pojoStudent.getClassList() + ", Java OCP Exam 829");
//        record cant set things.
//        recordStudent.setClassList(recordStudent.classList() + ", Java " +
//          "OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " +
          pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
          recordStudent.classList());
    }
}
