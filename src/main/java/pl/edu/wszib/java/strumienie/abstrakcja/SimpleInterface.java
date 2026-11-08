package pl.edu.wszib.java.strumienie.abstrakcja;

public interface SimpleInterface {
    static final int x = 5;

    void method1();
    int method2();

    default void method3() {
        k1();
        k2();
        k3();
        k4();
    }

    private void k1() {
        System.out.println("cos 1"); // dlugi kod
    }

    private void k2() {
        System.out.println("cos 2"); // dlugi kod
    }

    private void k3() {
        System.out.println("cos 3"); // dlugi kod
    }

    private void k4() {
        System.out.println("cos 4"); // dlugi kod
    }

}
