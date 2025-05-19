package collection_framwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class HasMapEx {
    private static Map<Integer,String> studentName = new HashMap<>();
    private static boolean addNewStuden (String name){
        int key = new Random().nextInt(999);
        studentName.put(key,name);
        return true;
    }
    private static boolean removeStudent(int key){
        String remove = studentName.remove(key);
        if(remove==null){
            System.out.println("Student not found");
            return true;
        }
        return false;
    }
    private static boolean seachById(int key){
        String name = studentName.get(key);
        if(name==null){
            System.out.println("Student not found");
            return true;
        }
        System.out.println("Student name: " + name);
        return false;
    }
    private static boolean updateStudent(int key,String name){
        studentName.put(key,name);
        return true;
    }
    private static void home (){
        System.out.println("=".repeat(30));
        System.out.println("Student Management System");
        System.out.println("=".repeat(30));
        System.out.println("""
                1. Add new Student
                2. search by Id
                3. Remove Student 
                4. update Student
                5. List all Students
                6. Exit
                """);
        System.out.print("[+] Insert option: ");
        switch (new Scanner(System.in).nextInt()){
            case 1 -> {
                while (true){
                    System.out.print("[+] Insert Student name or press Enter to back: ");
                    String name = new Scanner(System.in).nextLine();
                    if(name.isEmpty()){
                        break;
                    }
                    addNewStuden(name);
                    System.out.println("🎉 Student has been added successfully");
                }
            }
            case 2 -> {
                System.out.print("[+] Insert Student key to search: ");
                int key = new Scanner(System.in).nextInt();
                seachById(key);
                System.out.println("press Enter back to home");
                new Scanner(System.in).nextLine();
            }
            case 3 -> {
                System.out.print("[+] Insert Student key to remove: ");
                int key = new java.util.Scanner(System.in).nextInt();
                removeStudent(key);
                System.out.println("🎉 Student has been removed successfully");
                System.out.println("press Enter back to home");
                new Scanner(System.in).nextLine();
            }
            case 4 -> {
                System.out.print("[+] Insert Student key to update: ");
                int key = new Scanner(System.in).nextInt();
                if (studentName.get(key) == null) {
                    System.out.println("Student not found");
                }else {
                    System.out.print("[+] Insert new Student name: ");
                    String name = new Scanner(System.in).nextLine();
                    updateStudent(key, name);
                    System.out.println("🎉 Student has been updated successfully");
                }
                new Scanner(System.in).nextLine();
            }
            case 5 -> {
                System.out.println("==> All Students");
                for (Map.Entry<Integer, String> entry : studentName.entrySet()) {
                    System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
                }
                System.out.println("continue");
                new Scanner(System.in).nextLine();
            }
            case 6 -> {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            home();
        }
    }

}
