package mvc.view;

import mvc.controller.UserController;

public class Main {
    public static void main(String[] args) {
        new UserController().getAllUsers().forEach(System.out::println);

    }
}
