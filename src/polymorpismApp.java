public class polymorpismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("bill");
        employee.sayHello("mark");

        sayHi(new Employee("rudi"));
        sayHi(new Manager("mark"));
        sayHi(new VicePresident("Bill"));



    }
    static void sayHi(Employee employee){
        System.out.println("Hi "+ employee.name);
    }
}
