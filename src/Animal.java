/**
 * This is a class
 * Created 2021-09-20
 *
 * @author Magnus Silverdal
 */
public class Animal {
    private String owner = "";
    private String name;

    public Animal(String n) {
        this.name = n;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Animal{" + "owner='" + owner + '\'' + ", name='" + name + '\'' + '}';
    }

    public String speak() {
        return "I don't know...";
    }
}
