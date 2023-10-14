import java.util.*;

class Increment {
    static int a;
    Increment() {
        a++;
    }

    static void show() {
        System.out.println("");
    }

    public static void main(String args[]) {
        Increment i = new Increment(1);
        i.show();
    }
}