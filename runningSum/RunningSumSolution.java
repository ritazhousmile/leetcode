package runningSum;
public class RunningSumSolution {
    public int[] runningSum(int[] numbers) {
        
        for (int i = 1; i< numbers.length;i++){
            numbers[i] += numbers[i-1];
        }
        return numbers;

    }
}

//another solution
/* 
public class RunningSumSolution {
    public int[] runningSum(int[] numbers) {
        int[] results = new int[number.length];
        results[0] = numbers[0]
        for (int i = 1; i< numbers.length;i++){
            results[i] = numbers[i] + results[i-1];
        }
        return results;

    }
}
*/