package fruits;

 public class Fruit {
     public Object setColor;

     public Fruit() {
        this.weight = 10;
        this.color = "blue";
    }

    public Fruit(int weight, String color){
        this.color = color;
        this.weight = weight;
    }

     public int getWeight() {
         return weight;
     }

     public void setWeight(int weight) {
         this.weight = weight;
     }

     //attributes
    private int weight;

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     private String color;


    //methods
    public void showColor(){
        System.out.println("fruits.Fruit color is: " + color + weight);
    }
}
