import org.junit.Test;

public class FizzBuzz {

    @Test
    public void FizzBuzz() {
        //prints numbers 1 - 100
        for(int i = 1; i <= 100; i++) {
            //checks is number is divisible by 3 or 5 prints 'FizzBuzz'
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                //checks to see if a number is divisible by 3
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                //checks to see if a number is divisible by 5
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                //prints the number if is not divisible by 3 or 5
            } else {
                System.out.println(i);
            }
        }
    }
}
