package arrayLessone;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

//        //One Dimensional Array in Java
//        String [] namesi = {"sok","jame","josh","bunath"};
//        System.out.println(Arrays.toString(namesi));//print array all elements
//        //foreach loop
//        for (String name: namesi){
//            System.out.println(name);
//            name.getBytes();
//        }
//
//        System.out.print("[+] Insert number of element: ");
//        int number = new Scanner(System.in).nextInt();
//        String [] names = new String[number];
//        for(int i=0;i<number;i++){
//            System.out.print("[+] Insert name [ " + i + " ]: ");
//            names[i] = new Scanner(System.in).nextLine();
//        }
//        System.out.println("==> All names");
//        System.out.println(Arrays.toString(names));
////        update new name
//        System.out.print("[+] Insert old name to update: ");
//        String oldName = new Scanner(System.in).nextLine();
//        for(int i=0;i<names.length;i++){
//            if(names[i].equals(oldName)){
//                System.out.print("[+] Insert new name to update: ");
//                String newName = new Scanner(System.in).nextLine();
//                names[i] = newName;
//            }
//        }
//        System.out.println("==> All updated names");
//        System.out.println(Arrays.toString(names));

        //delete array element

        System.out.println("=> All Numbers");
        Integer [] numbers = {1,2,3,4};
        System.out.println(Arrays.toString(numbers));
        System.out.print("[+] Insert any element to delete: ");
        int deleteNumber = new Scanner(System.in).nextInt();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==deleteNumber){
                numbers[i] = null;
            }
        }
        System.out.println("==> All elements after deleted");
        for(Integer n: numbers){
            if(n!=null){
                System.out.println(n);
            }
        }
    }
}
