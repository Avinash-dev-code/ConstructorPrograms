//Class Name will consider a constructor id there is no defualt or parameterized constructor 
public class DefaultConstructor {
   
    int i;

    public static void main(String[] args) {
        DefaultConstructor defaultConstructor=new DefaultConstructor();
        System.out.println(defaultConstructor.i);
        /*Like C++, Java automatically creates default constructor
         if there is no default or parameterized constructor written by user, and
          (like C++) the default constructor automatically calls parent default constructor.
         But unlike C++, default constructor in Java initializes member data variable to default values (numeric values are initialized as 0,
         booleans are initialized as false and references are initialized as null).*/
    }

}