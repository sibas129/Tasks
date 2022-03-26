import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;

public class Task1 {
    private final double GLOBALMIN = -10000;
    private final double GLOBALMAX = 10000;
    private List<Double> nums;
    private double average;
    private double min;
    private double max;

    private void getAverage(){
        Random random = new Random();
        int numOfNums = random.nextInt(50);
        double[] nums = new double[numOfNums];
        this.nums = new ArrayList<Double>();

        for (int i = 0; i < numOfNums; i++){
            nums[i] = Math.random() * (GLOBALMAX - GLOBALMIN + 1) + GLOBALMIN;
            this.nums.add(nums[i]);
        }

        average = DoubleStream.of(nums).average().orElse(0);
        min = DoubleStream.of(nums).min().orElse(0);
        max = DoubleStream.of(nums).max().orElse(0);
    }

    public void answerTask1(){
        getAverage();
        System.out.format("\nTask 1 answer:\n\nSequence of numbers:\n%.3f", nums.get(0));

        for(int i = 1; i < nums.size(); i++){
            System.out.format(", %.3f", nums.get(i));
        }

        System.out.format("\nMin number: %.3f\nMax number: %.3f\nAverage: %.3f\n\n", min, max, average);
    }
}
