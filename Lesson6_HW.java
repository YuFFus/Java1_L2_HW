/**
 * Java1. Level 1. Lesson 6. Homework;
 * @author Fedak Yuriy;
 * @version 29.08.2018;
 * @link https://github.com/YuFFus/Java1_L2_HW.git ;
*/

class Lesson6_HW{
    public static void main(String args[]){
        Cat cat=new Cat(); // ordinary cat;
        Dog Dog=new Dog(); // ordinary dog;
        Dog collie=new Dog("Сollie", 1000); // this is a superDog with extended run range;
        cat.run(150);
        cat.swim(2);
        Dog.jamp(1);
        collie.run(1000);
    }
}

abstract  class Animal{
    public String name;
    public int runLim;
    public int jampLim;
    public int swimLim;
        
    public void run(int runCheck){
        if (runCheck<=runLim)
            System.out.println(name+" - run: "+runCheck+" - true");
        else System.out.println(name+" - run: "+runCheck+" - false");
    }
    public void jamp(int jampCheck){
        if (jampCheck<=jampLim) 
            System.out.println(name+" - jamp: "+jampCheck+" - true");
        else System.out.println(name+" - jamp: "+jampCheck+" - false");
    }
    public void swim(int swimCheck){
        if (swimCheck<=swimLim)
            System.out.println(name+" - swim: "+swimCheck+" - true");
        else System.out.println(name+" - swim: "+swimCheck+" - false");
    }
}
class Cat extends Animal{
    Cat(){
        name="Cat";
        runLim=200;
        jampLim=2;
    }
    @Override //cat can not swim in any case. No need to make a checking;
    public void swim(int swimCheck){
        System.out.println(name+" - swim: "+swimCheck+" - false");
    }
}
class Dog extends Animal{
    public float jampLim; // override type of this variable from int to float;
    Dog(){ // constructor for ordinary dog;
        name="Dog";
        runLim=500;
        jampLim=0.5f;
        swimLim=10;
    }
    Dog(String breed, int runLim){ // constructor for dogs with diffrend run range;
        name=breed;
        this.runLim=runLim;
        jampLim=0.5f;
        swimLim=10;
    }
}