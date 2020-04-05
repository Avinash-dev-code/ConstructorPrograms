
class Vehicle{
      int wheels;
      String color;
      //vechile are constructor contain two parameter .
      //now you can used parameter for multiple objects.
     Vehicle(int Wheels,String Color){
         wheels=Wheels;
         color=Color;
            
     }

}


public class ParamaterizedConstructor {


    public static void main(String[] args) {
        Vehicle cars=new Vehicle(4,"Red"); //you can pass value for parameter that you assigned.
        Vehicle bike=new Vehicle(2,"Blue"); // you can create multiple object with same constructor.
        Vehicle rickshaw=new Vehicle(3,"Black");
        System.out.println(" The cars has"+" "+cars.wheels+" "+"and"+" "+cars.color+" "+"in color");
        System.out.println(" The bike has"+" "+bike.wheels+" "+"and"+" "+bike.color+" "+"in color");

        System.out.println(" The rickshaw has"+" "+rickshaw.wheels+" "+"and"+" "+rickshaw.color+" "+"in color");


        
    }

}