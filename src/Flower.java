import fruits.Plants;

public class Flower implements Plants {
    @Override
    public void showColor() {
        System.out.println("Color is red!");

    }

    @Override
    public void writeName() {
        System.out.println("Name is rose!");

    }
}
