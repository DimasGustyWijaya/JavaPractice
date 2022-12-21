class Parent {
    String name;
    void doIt(){
        System.out.println("Do it from parent");
    }
}
class Child extends Parent{
    void doIt(){
        System.out.println("do it from child");
        System.out.println(super.name);
    }
}
