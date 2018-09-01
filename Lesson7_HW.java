/**
 * Java 1. Level 1. Lesson 7. Homework.
 * @author Yuriy Fedak;
 * @version 01.09.2018;
 * @link https://github.com/YuFFus/Java1_L2_HW.git;
 */
import java.util.Random;
class Lesson7_HW{
    public static void main(String[] args){
        Random random=new Random();
        Plate plate=new Plate(500);
        Cat[] cats=new Cat[100];
        for (int i=0; i<cats.length; i++){
           cats[i]=new Cat(random.nextInt(11),false);
        }
        // Cats breakfast;
        for(Cat cat:cats){
           cat.eat(plate);
           System.out.println(cat);
           System.out.println(plate);
        }
        // add foods to plate;
        plate.setFood(50);
        System.out.println(plate);       
    }
}
class Cat{
    private int appetite;
    private boolean satiety;
    
    Cat(int appetite, boolean satiety){
        this.appetite=appetite;
        this.satiety=satiety;
    }
    void eat(Plate plate){
        if (plate.getFood()>=appetite){
           plate.decreaseFood(appetite);
           satiety=true;
        }
    }
    @Override
    public String toString(){
        return ("appetite: "+appetite+ "; satiety: "+satiety);
    }
}
 
class Plate{
    private int food;
    
    Plate(int food){
        this.food=food;
    }
    void decreaseFood(int food){
        this.food-=food;
    }
    public int getFood(){
        return this.food;
    }
    public void setFood(int food){
        this.food+=food;
    }
    
    @Override
    public String toString(){
        return ("food: "+food);
    }
}