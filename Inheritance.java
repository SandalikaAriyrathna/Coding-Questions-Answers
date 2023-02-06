public class Inheritance {
  
        public static void main(String[] args) {
          Dog dog = new Dog();
          dog.bark();
          dog.eat(); 
        }
}     
class Animal {

    void eat(){
    System.out.println("Eating...");
    }  

}

class Dog extends Animal {

    void bark() {

        System.out.println("Dog Barking ");

    }

}
    

