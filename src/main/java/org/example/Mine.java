package org.example;
public class Mine {
    private static int x = 10;
    static {
        x++;
    }
    static {
        ++x;
    }
    {
        x--;
    }
    public static void main(String[] args) {
        Mine obj = new Mine();
        Mine obj2 = new Mine();
        Mine obj3 = new Mine();
        System.out.println(x);
    }
}

