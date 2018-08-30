/**
 * Java1. Level 1. Lesson 6. Homework;
 * @author Fedak Yuriy;
 * @version 29.08.2018;
 * @link https://github.com/YuFFus/Java1_L2_HW.git ;
*/

class Lesson6_HW_v1{
    public static void main(String args[]){
        Cat cat=new Cat("Cat", 200, 2);
        Dog Dog=new Dog("Collie", 500, 0.5, 10);
        cat.run(150);
        cat.swim(2);
        Dog.jamp(1);
    }
}
interface IAnimal{
    abstract public void run(int x);
    abstract public void jamp(int y);
    abstract public void swim(int z);
}

abstract class Animal implements IAnimal{
    public String name;
    public int runLim;
    public int jampLim;
    public int swimLim;
    
    Animal(String name, int runLim, int jampLim, int swimLim){
        this.name=name;
        this.runLim=runLim;
        this.jampLim=jampLim;
        this.swimLim=swimLim;
    }
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
    Cat(String name, int runLim, int jampLim){
        super(name, runLim, jampLim, 0);
    }
    @Override //cat can not swim in any case. No need to make a checking;
    public void swim(int swimCheck){
        System.out.println(name+" - swim: "+swimCheck+" - false");
    }
}

class Dog extends Animal{
    public double jampLim; // override type of this variable from int to float;
    Dog(String name, int runLim, double jampLim, int swimLim){ 
        super(name, runLim, 0, swimLim);
        this.jampLim=jampLim;
    }
}