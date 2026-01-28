package bharti;

class Animal {
    void Method() {
        System.out.println("this is superclass"); 
    }
}

class Dog extends Animal { 
    @Override
    void Method() {
        System.out.println("this is subclass"); 
    }
    
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class upLowcasting {
    public static void main(String[] args) {
       
        Animal obj = new Dog(); 
        obj.Method(); 

        if (obj instanceof Dog) {
            Dog d = (Dog) obj;
            d.Method(); 
            d.bark();  
        } else {
            System.out.println("Object is not a Dog instance.");
        }
    }
}
