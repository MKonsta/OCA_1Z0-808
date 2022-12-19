package inheritance;

public interface C {

    public void anyPrintFromInt();

    public default void defMethodFromInterface() {
        System.out.println("Print from default method");
    }

    public static void staticMethodFromInterface() {
        System.out.println("Print from static interface method");
    }

}
