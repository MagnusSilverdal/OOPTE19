import java.sql.SQLOutput;

/**
 * This is a class
 * Created 2021-09-20
 *
 * @author Magnus Silverdal
 */
public class TestAnimalAndDog {
    public static void main(String[] args) {
        Dog d = new Dog("Fido");
        Cat a = new Cat("Pelle");

        Animal[] minaDjur = new Animal[2];
        minaDjur[0] = a;
        minaDjur[1] = d;

        for (Animal x : minaDjur) {
            System.out.println(x.speak());
        }
    }
}
