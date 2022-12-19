package inheritance;

class A {

    public int f;

    public void printImportantData(int i, int j) {
        System.out.println(i);
    }
}

//An overriding method (the method that is trying to override the base class’s method) must have the same parameters.
//The overriding method may opt not to declare any throws clause even if the original method has a throws clause.