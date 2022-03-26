import java.util.ArrayList;
import java.util.List;

public class Task4 {
    private List<String> names;

    private void getCorrectNames(String text){
        this.names = new ArrayList<String>();

        String[] names = text.split("[, ]");

        for(int i = 0; i < names.length; i+= 3){
            this.names.add(names[i] + " " + names[i + 1].charAt(0) + ".");
        }
    }

    public void answerTask4(String str){
        getCorrectNames(str);
        System.out.print("Task 4 answer:\n\nNames list:\n" + names + "\n\n");
    }
}
