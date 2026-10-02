package Super_keyword;

public class Car extends Vehicle {


    Car(int wheels, String color) {
        super(wheels, color);
        // super keyword for initializing constructor
        System.out.print(super.getWheels());// calling parents method
    }
}
// generally we can handle without super kw and this kw but in case of naming conflicts its required
//  // Java sees: parameter = parameter (The instance variable is untouched)
// If we give differ name to parameters and instance variable than no need of using this keyword
// same for super keywords if we want to call the method of parent and there is naming conflict than...

/**class Test{
 * int a;
 * Test(int a){
 *     a=a;// this will not initialize object's a just
 * }
 }*/