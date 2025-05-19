package oop;
// compile time polymorphism or overloading
class Servic {
    public int sum(int a, int b){
        return a+b;
    }
    public double sum(double a, double b){
        return a+b;
    }
}

public class PolymorpismDemo {
    public static void main(String[] args) {
        Servic servic = new Servic();
        System.out.println(servic.sum(1, 2));
        System.out.println(servic.sum(1.0, 2.0));
    }
}
