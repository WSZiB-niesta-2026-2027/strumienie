package pl.edu.wszib.java.strumienie.abstrakcja;

public class App {
    static void main() {
        Sorter sorter = null;

        //sorter.sort();

        SimpleInterface simpleInterface = null;

        Object o = new Klasa1();

        Pet p = new Dog();

        System.out.println(SimpleInterface.x);

        System.out.println(Stale.PI);

        Stale stale1 = new Stale();
        Stale stale2 = new Stale();

        System.out.println(Stale.PI);
        System.out.println(stale1.PI);
        System.out.println(stale2.PI);

        stale1.PI = 5.00;

        System.out.println(Stale.PI);
        System.out.println(stale1.PI);
        System.out.println(stale2.PI);

    }
}
