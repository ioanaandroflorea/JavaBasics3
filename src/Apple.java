import fruits.Fruit;

public class Apple extends Fruit {


    public Apple() {
        setColor ("red");
        setWeight(13);
    }

    public String vitamin;

    public void showVitaminAndColor(String color) {
        System.out.println("Apple color is" + color);
        System.out.println("Apple vitamin is: " + vitamin);
    }

    public void showVitaminAndColor(String color, String vitamin) {
        System.out.println("Apple color 2 is: " + color);
        System.out.println("Apple vitamin 2 is: " + vitamin);
    }

    public void showVitaminAndColor (int weight, String color){
        System.out.println("Apple weight 3 is: " + weight);
        System.out.println("Apple color 3 is: " + color);
    }

    public void showColor(String color){
        System.out.println("Apple color is nice");
    }

}

