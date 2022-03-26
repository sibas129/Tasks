import java.util.*;
import java.util.stream.*;

public class Task2 {
    private Set<String> words;

    private void getIndividualWords (String text){
        this.words = new HashSet<String>();
        text = text.toLowerCase();

        this.words = Stream.of(text.split(", ")).collect(Collectors.toSet());
    }

    public void answerTask2(String str){
        getIndividualWords(str);
        System.out.print("Task 2 answer:\n\nColours list:\n" + words + "\n\n");

    }
}
