package fruits;

public abstract class Vegetables {

    //attributes
   public int weight;

   public abstract void showWeight();

    public int getWeight(){
        return this.weight;
    }


    public Vegetables(){
        this.weight = 12;
    }
}
