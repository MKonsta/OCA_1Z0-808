import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class FunctionalInterface {

    /**
     * A functional interface is an interface that contains exactly one abstract method. It may contain zero or more default methods and/or static methods.
     * Because a functional interface contains exactly one abstract method, you can omit the name of that method when you implement it using a lambda expression.
     * For example, consider the following interface -
     * interface Predicate<T> {
     *     boolean test(T t);
     * }
     */

    public void printImportantData(ArrayList<Data> dataList, Predicate<Data> p){
        for(Data d: dataList){
            if(p.test(d)) System.out.println(d.val);
        }
    }

    public static void main(String[] args) {

        FunctionalInterface functionalInterface = new FunctionalInterface();

        ArrayList<Data> list = new ArrayList<>();
        list.add(new Data(7));
        list.add(new Data(-10));
        list.add(new Data(8));
        list.add(new Data(-45));
        list.add(new Data(3));

        Predicate<Data> predicate = data -> data.val > 0;

        functionalInterface.printImportantData(list, predicate);

    }
}

class Data {
    public int val;

    public Data(int val) {
        this.val = val;
    }
}
