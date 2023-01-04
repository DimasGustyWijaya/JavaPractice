public class polymorpismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("bill");
        employee.sayHello("mark");

        sayHi(new Employee("rudi"));
        sayHi(new Manager("mark"));
        sayHi(new VicePresident("Bill"));



    }
    static void sayHi(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vp = (VicePresident) employee;
            System.out.println("hi vp " + employee.name);
        } else if (employee instanceof Manager) {
            Manager m = (Manager) employee;
            System.out.println("hi manager " + employee.name);
        } else  {
            System.out.println("hi " + employee.name);
        }
    }
}
