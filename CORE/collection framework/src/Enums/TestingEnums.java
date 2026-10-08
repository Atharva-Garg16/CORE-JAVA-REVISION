package Enums;
// Enums are special type of classes use to define fixed set of constants
// eg : days of week , Month of year ,etc
// Access const with '.' operator
public class TestingEnums {
    public static void main(String[] args) {
        TrafficLight color=TrafficLight.YELLOW;
        color=TrafficLight.GREEN;
        /// this color is object of enum so it can Have only 3 possible values TrafficLight.RED...
//        color=TrafficLight.PINK; Cannot resolve symbol 'PINK'


    }
}
