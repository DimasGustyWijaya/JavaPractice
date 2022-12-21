class Person {
    String name;
    String addres;
    Person(String pname,String paddres){
        this.addres = paddres;
        this.name = pname;
    }

    void sayHi(){
        System.out.println("Hello "+this.name+"my addres is "+ this.name);
    }

}

class chil extends Person{
   chil(String pname,String paddres){
       super(pname,paddres);
   }
}


