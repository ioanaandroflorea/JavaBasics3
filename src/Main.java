import fruits.Fruit;
import fruits.Plants;

public class Main {
    public static void main(String[] args) {
        // declare and instantiate object fruit of type fruits.Fruit
        Fruit fruit = new Fruit();
        fruit.setColor; = "red";
        //fruit.weight =15;
       // System.out.println(fruit.weight);
        fruit.showColor();
        Fruit fruit1 = new Fruit(200,"green");
        System.out.println("fruits.Fruit 1 color is: " + fruit1.color);
        System.out.println("fruits.Fruit 1 weight is: "+ fruit1.weight);

        Fruit apple = new Fruit();
        System.out.println("Apple color is: " + apple.color);
        System.out.println("Apple weight is: " + apple.weight);
//        apple.showVitaminAndColor("gray");
//        apple.showVitaminAndColor("pink", "C");
//        apple.showVitaminAndColor(14, "black");

        apple.showColor();

        Carrot carrot = new Carrot();
        carrot.showWeight();

        //apple.weight = 12;

        Flower flower = new Flower();
        flower.showColor();
        flower.writeName();


      /*Caine caine = new Caine();

      caine.mananca();
      caine.sunet();
       /* Persoana persoana = new Persoana();

        System.out.println(persoana.nume);
        System.out.println(persoana.varsta);
        System.out.println(persoana.adresa);

        persoana.plimbare();
        persoana.gateste();

    /*    Persoana persoana2 = new Persoana("Ionut", 50);
        System.out.println(persoana.nume);
        System.out.println(persoana.varsta);
        System.out.println(persoana.adresa);

        System.out.println(Persoana.SPECIE);
        System.out.println(Persoana.respira(0));*/

    }

}