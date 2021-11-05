public class MainDriver {
    public static void main(String[] args) {
        Person ps01 = new Person("Nancy", "Clementson", "Female");
        System.out.println(ps01.toString());

        System.out.println("###############################");
        Person student = new Employee("Petrio", "Steven", "Male", 0, 0);
        System.out.println(student.toString());

        Employee student01 = new Employee("Sarah", "Champion", "Female", 347908, 15480.17);
        student01.employment();
        System.out.println(student01.toString());
    }
}
