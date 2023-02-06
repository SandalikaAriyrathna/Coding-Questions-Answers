public class Overriding {
    
        public static void main(String[] args) {
            Child c = new Child();
            c.printName();
            Base b = new Base();
            b.printName();
        }
 }
      
class Base {

    void printName() {

        System.out.println("Base Class");

    }

}

class Child extends Base {

    @Override

    void printName() {

        System.out.println("Child Class");

    }

}

