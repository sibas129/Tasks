import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// List -> User("Влад", "1"), User("Давид", "2"), User("Игорь", "2"), User("Андрей", "3")
// List -> Group("1", "Разработчики"), Group("2", "Тестировщики"), Group("3", "Аналитики")
public class Task5 {
    private Map<String, Integer> user;
    private Map<Integer, String> group;
    private Map<String, String> userDto;

    private List<String> mySplitStr(String splitter, String str) {
        List<String> list = Stream.of(str.split(splitter)).collect(Collectors.toList());
        if(!list.get(0).startsWith("(")) {
            list.remove(list.get(0));
        }

        return list;
    }

    private void regroupMaps (String users, String groups) {
        user = new HashMap<>();
        group = new HashMap<>();
        userDto = new HashMap<>();

        List<String> sortedUsers = mySplitStr("User", users);
        for(String sortedUser : sortedUsers) {
            int index = sortedUser.substring(2).indexOf('\"') + 2;
            int num = Integer.parseInt(sortedUser.substring(index + 4, index + 5));

            user.put(sortedUser.substring(2, index), num);
        }

        List<String> sortedGroups = mySplitStr("Group", groups);
        for(String sortedGroup : sortedGroups) {
            int indexForNum = sortedGroup.indexOf('\"') + 1;
            int indexForWord = sortedGroup.lastIndexOf('\"');
            int num = Integer.parseInt(sortedGroup.substring(indexForNum, indexForNum + 1));

            group.put(num, sortedGroup.substring(indexForNum + 5, indexForWord));
        }

        for(Map.Entry<String, Integer> item : user.entrySet()){
            userDto.put(item.getKey(), group.get(item.getValue()));
        }
    }

    public void answerTask5(String users, String groups){
        regroupMaps(users, groups);
        System.out.print("Task 5 answer:\n\nUsersDto list:\n" + userDto);
    }
}
