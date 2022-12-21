class Employee {
    String name;
    Employee(String name){
        this.name = name;
    }

    void sayHello(String name){
        System.out.println("hello "+ name + " my name is" + this.name);
    }
}

class Manager extends Employee{
    Manager(String name){
        super(name);
    }
    void sayHi(String name){
        System.out.println("hi " + name);
    }
}

class VicePresident extends Manager{
    VicePresident(String name){
        super(name);
    }
}
