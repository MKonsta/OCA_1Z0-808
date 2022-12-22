public class CompareOperators {

    public static void main(String args[]) {
        int i = 0;
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool = false;
        bool = (bool2 & method1(i++)); // всегда проверяет оба условия
        bool = (bool2 && method1(i++)); // проверяет второе условие по необходимоости
        bool = (bool1 | method1(i++)); // всегда проверяет оба условия
        bool = (bool1 || method1(i++)); // проверяет второе условие по необходимоости
        System.out.println(i);
    }

    public static boolean method1(int i) {
        return i > 0 ? true : false;
    }
}
