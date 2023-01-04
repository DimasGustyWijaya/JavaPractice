package interfacepractice;

public class Supra implements Car,Modify{
    @Override
    public void type() {
        System.out.println("ok");
    }

    @Override
    public int speed() {
        return 160;
    }


}
