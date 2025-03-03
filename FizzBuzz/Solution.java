package FizzBuzz;
/*Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
 * 
 */
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<String> fizzBuzz(int n){
        List<String> results = new ArrayList<>(n);
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0){
                results.add("FizzBuzz");
            } else if (i % 3 == 0){
                results.add("Fizz");
            } else if (i % 5 == 0){
                results.add("Buzz");
            } else {
                results.add(String.valueOf(i));
            }
        }
        return results;
    }
}
