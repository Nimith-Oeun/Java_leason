package oop;
class Parent1{
    protected Integer id;
    protected String name;
    protected  Integer age;
    //
    public Parent1(){}
    public Parent1(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
class Son1 extends Parent1{
    public String creditCard;
}

public class InheritenceDemo {
    public static void main(String[] args) {
        Son1 son = new Son1();
        son.id = 1;
        son.name = "John";
        son.age = 20;
        son.creditCard = "1234 5678 9101 1121";
        System.out.println(son.id + " " + son.name + " " + son.age + " " + son.creditCard);
    }
}
