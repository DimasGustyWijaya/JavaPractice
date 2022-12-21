abstract class Animal {
    String name;
    abstract void Whatis();
//    abstract method ga boleh pake block hanya gini aja
//    dan harus selalu di override di class child nya
}

class Tiger extends Animal{
    @Override
    void Whatis() {
        System.out.println("Im the "+name);
    }
}

