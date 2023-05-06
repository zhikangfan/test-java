import java.util.*;
public class TestList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("huawei");
        list.add("apple");
        list.add(null);
        String v = list.get(1);
        System.out.println(list.size());
        System.out.println(v);
    }
}