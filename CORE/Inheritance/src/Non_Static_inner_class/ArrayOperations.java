package Non_Static_inner_class;

import java.util.Arrays;

public class ArrayOperations{
    private int[] numbers;
    public ArrayOperations(int[] numbers){
        this.numbers = numbers;
    }
    public   class Stats{
        double mean(){
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return (double) sum / numbers.length;

        }
        double median(){
            Arrays.sort(numbers);
            if(numbers.length % 2 != 0){
                return numbers[numbers.length / 2];

            }
            return (double) (numbers[numbers.length / 2] + numbers[numbers.length / 2 - 1]) / 2;
        }
    }
}
class ArrayTest{
    public static void main(String[] args){
        ArrayOperations a = new ArrayOperations(new int[]{1, 2, 3, 4, 5,6,7,8});
        ArrayOperations.Stats stats = a.new Stats();
        System.out.println(stats.mean());
        System.out.println(stats.median());

    }
}