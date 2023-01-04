package GetterAndSetter.Application;

import interfacepractice.Modify;
import interfacepractice.Supra;

public class Transport {
    public static void main(String[] args) {
        Supra trans = new Supra();
        System.out.println(trans.speed());
        trans.price();
    }
}
