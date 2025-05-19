package oop;


    class Parent{
        protected String name;
        protected String age;
        //
        public Parent(){}
        public Parent(String name){
            this.name = name;
        }
        public void run(){
            System.out.println(name + " is running");
        }
    }
    class Son extends Parent{
        public Son(String name){
            super(name);
            super.age = "20";
        }
    }
public class SuperKeyword {
    public static void main(String[] args) {
        Parent son = new Son("John");
        son.run();
    }
}


