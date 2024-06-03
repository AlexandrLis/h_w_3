package task_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(105);

        List<Integer> list1 = new ArrayList<>();
        list1.add(15);
        list1.add(10);

        System.out.println(compareArrays(list, list1));

    }

    public static <T, V> boolean compareArrays(List<T> list1, List<V> list2){
        if(list1.size() != list2.size()){
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if(!(list1.get(i).getClass().getName()).equals(list2.get(i).getClass().getName())){
                return false;
            }
        }
        return true;
    }
}
