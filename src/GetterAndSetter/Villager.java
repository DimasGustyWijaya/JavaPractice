package GetterAndSetter;

public class Villager {
    private String name;
    private int Id;
    private boolean Active;

    public String getName()  {
         return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean active) {
        Active = active;
    }
}
