import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class Starter {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(0);
        integerList.add(10);
        integerList.add(13);
        integerList.add(17);

        System.out.println(Starter.map(integerList, s -> s + 5));
    }


    public static List<Integer> map(List<Integer> list,
                                    IntFunction<Integer> function){

        List<Integer> newIntegerList = new ArrayList<>();

        //list.forEach(s -> newIntegerList.add(function.apply(s)));
        for (Integer integer : list) {
            newIntegerList.add(function.apply(integer));
        }
        return newIntegerList;
    }
}