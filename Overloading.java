public class Overloading {
    
        public static void main(String[] args) {
          String s = "asd";
          Foo foo = new Foo();
          foo.print(s);
          foo.print(s,5);
               
        }
 }
      
class Foo {

    void print(String s) {

        System.out.println(s + "mm");

    }

    void print(String s, int count) {

        while (count > 0) {

            System.out.println(s);

            count--;

        }

    }

}
    

