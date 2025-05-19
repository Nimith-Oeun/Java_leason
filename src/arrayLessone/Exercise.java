package arrayLessone;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        System.out.println("=".repeat(30));
        System.out.println("Product Stock management system");
        System.out.println("=".repeat(30));
        String [] productName = new String[30];
        while (true){
            System.out.println("""
                1. List all Product 
                2. Create new Product
                3. Update Product
                4. Delete 
                5. Exit
                ----------------------------------
                """);
            System.out.print("[+] Insert option: ");
            int opt = new Scanner(System.in).nextInt();
            switch (opt){
                case 1->{
                    System.out.println("==> List all Products");
                    for(String p: productName){
                        if(p!=null){
                            System.out.println(p);
                        }
                    }
                }
                case 2->{
                    System.out.print("[+] Insert Product name: ");
                    String productN = new Scanner(System.in).nextLine();
                    for(int i=0;i<productName.length;i++){
                        if(productName[i]==null){
                            productName[i] = productN;
                            break;
                        }
                    }
                    System.out.println("😀 Product has been added successfully");
                    System.out.println("📅 Created at " + Date.from(Instant.now()));
                }
                case 3->{
                    System.out.print("[+] Insert old Product name to update: ");
                    String oldName = new Scanner(System.in).nextLine();
                    for(int i=0;i<productName.length;i++){
                        if(productName[i]!=null && productName[i].equals(oldName)){
                            System.out.print("[+] Insert new Product name to update: ");
                            String newName = new Scanner(System.in).nextLine();
                            productName[i] = newName;
                        }
                    }
                    System.out.println("[🔖] Product has been updated successfully");
                    System.out.println("📅 Updated at " + Date.from(Instant.now()));
                }
                case 4->{
                    System.out.print("[+] Insert any Product name to delete: ");
                    String deleteName = new Scanner(System.in).nextLine();
                    for(int i=0;i<productName.length;i++){
                        if(productName[i]!=null && productName[i].equals(deleteName)){
                            productName[i] = null;
                        }
                    }
                    System.out.println("[🔖] Product has been deleted successfully");
                    System.out.println("📅 Deleted at " + Date.from(Instant.now()));
                }
                case 5->{
                    System.out.println("👋 Goodbye");
                    System.exit(0);
                }
            }
            System.out.print(">> Press any key continue");
            new Scanner(System.in).nextLine();
        }

    }
}
