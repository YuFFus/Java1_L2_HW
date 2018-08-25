/**
 * Java. Level 1. Lesson 5. HomeWork.
 * @author Yuriy Fedak.
 * @version 25.08.2018.
*/

class Lesson5_HW {
    
    public static void main(String[] args){
        Person[] perArray=new Person[5];
        arrayInit(perArray);
        for (int i=0; i<perArray.length; i++){
            if (perArray[i].getAge()>40) 
                System.out.println(toString(perArray[i]));
        }
    }
    
    static class Person{
        String name;
        String position;
        String email;
        String telNumber;
        private int salary;
        private int age;
        
        void setSalary(int salary){
            this.salary=salary;
        }
        void setAge(int age){
            this.age=age;
        }
        int getSalary(){
            return salary;
        }
        int getAge(){
            return age;
        }
        Person(String name, String position, String email, String telNumber, int salary, int age){
            this.name=name;
            this.position=position;
            this.email=email;
            this.telNumber=telNumber;
            setSalary(salary);
            setAge(age);
        }
    }
    
    private static Person[] arrayInit(Person[] perArray){
        perArray[0]=new Person("Ivanov Ivan","porter", "ivanov@ivanov.ru", "+79991112535", 50000, 25);
        perArray[1]=new Person("Petrov Pyotr","rocker", "petrov@ivanov.ru", "+70001112577", 10000, 42);
        perArray[2]=new Person("Sidorov Sidr","ripper", "sidorov@ivanov.ru", "+71111112577", 30000, 39);
        perArray[3]=new Person("Polyakov Pol","trasher", "polyakov@ivanov.ru", "+72221112577", 10000, 55);
        perArray[4]=new Person("Nikolayev Nikolay","superstar", "nikolayev@ivanov.ru", "+73331112577", 10000, 31);
        return perArray;
    }
 
    static String toString(Person person){
        return "Name: "+person.name+"; Position: "+person.position+"; E-mail: "+person.email+
            "; Tel Number: "+person.telNumber+"; Salary: "+person.getSalary()+"; Age: "+person.getAge();
    }
}