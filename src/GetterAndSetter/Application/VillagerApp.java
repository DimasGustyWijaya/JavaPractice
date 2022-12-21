package GetterAndSetter.Application;

import GetterAndSetter.Villager;

public class VillagerApp {
    public static void main(String[] args) {
        Villager village = new Villager();
        village.setId(001);
        village.setName("Zayn");
        village.setActive(false);

        System.out.println(village.getId());
        village.getName();
        village.isActive();

    }
}
