package inheritance;

public class B extends A implements C {

    @Override
    public void printImportantData(int i, int j) throws NullPointerException {
        System.out.println(j);
    }

    @Override
    public void anyPrintFromInt() {
        System.out.println("Print from normal implemented method");
    }

    public static void main(String[] args) {
        C instanceC = new B();

        instanceC.defMethodFromInterface();
        instanceC.anyPrintFromInt();

        C.staticMethodFromInterface();
    }
}
