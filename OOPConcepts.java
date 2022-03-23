

class OOPConcepts{
    public static void main(String args[]){
        Polymorphism p=new Polymorphism();
        p.polymorphism();
        p.polymorphism("Hello");

        Encapsulation e=new Encapsulation();
        e.encapsulation();

        Abstraction2 a=new Abstraction2();
        a.abstraction();

        Inheritance2 i=new Inheritance2();
        i.inheritance();
        i.inherit();
    }


}



    //class showing the implementation of polymorphism
    //function overloading

class Polymorphism{

     void polymorphism(){
        System.out.println("I am polymorphism default function");


    }

    void polymorphism(String a){
        System.out.println(a+" I am polymorphism parameterized function");
        
    }

}

//class showing the implementation of encapsulation

class Encapsulation{
    private int a=10, b=20;

    void encapsulation(){
        System.out.println(a+" "+b+" are encapsulated members of class");
    }
}

//class showing the implementation of data abstraction

abstract class Abstraction{

    abstract void abstraction();

    
}
class Abstraction2 extends Abstraction{
    void abstraction(){
        System.out.println("I am an abstract class");
    }
}

//class showing the implementation of inheritance

class Inheritance{

    void inheritance(){

          System.out.println("****inheritance");

    }
    void inherit(){
        System.out.println("I am inheritance base class");
    }
  
}

class Inheritance2 extends Inheritance{
   
    void inheritance(){
       System.out.println("inheritance**** ");
     
    }
}

