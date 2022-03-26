import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.*;

public class Task3 {
    private final int GLOBALMAX = 10000;
    private List<Integer> nums;
    private long count;

    private void getEvenNum() {
        Random random = new Random();
        int numOfNums = random.nextInt(50);
        int[] nums = new int[numOfNums];
        this.nums = new ArrayList<Integer>();

        for (int i = 0; i < numOfNums; i++){
            nums[i] = random.nextInt(GLOBALMAX);
            this.nums.add(nums[i]);
        }

        count = IntStream.of(nums).filter(x -> x % 2 == 0).count();
    }

    public void answerTask3(){
        getEvenNum();
        System.out.print("Task 3 answer:\n\nSequence of numbers:\n" + nums.get(0));

        for(int i = 1; i < nums.size(); i++){
            System.out.print(", " + nums.get(i));
        }

        System.out.println("\nEven numbers count: " + count + "\n");
    }
}
