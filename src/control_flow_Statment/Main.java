package control_flow_Statment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number of 4 options: ");
            int number = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (number) {
                case 1:
                    System.out.println("List all products");
                    for (String product : products) {
                        System.out.println(product);
                    }
                    break;
                case 2:
                    System.out.println("Add a product");
                    System.out.println("Enter product name: ");
                    while (true){
                        String product = scanner.nextLine();
                        if(product.isEmpty()){
                            System.out.println("Exit");
                            break;
                        }
                        products.add(product);
                        System.out.println("Product added.");
                    }
                    break;

                case 3:
                    System.out.println("Search for a product");
                    System.out.println("Enter product name or index to search: ");
                    String input = scanner.nextLine();
                    try {
                        int index = Integer.parseInt(input);
                        if (index >= 0 && index < products.size()) {
                            System.out.println("Product found at index " + index + ": " + products.get(index));
                        } else {
                            System.out.println("Index out of range.");
                        }
                    } catch (NumberFormatException e) {
                        if (products.contains(input)) {
                            System.out.println("Product found: " + input);
                        } else {
                            System.out.println("Product not found.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Delete a product");
                    System.out.println("Enter product name to delete: ");
                    String deleteProduct = scanner.nextLine();
                    if (products.remove(deleteProduct)) {
                        System.out.println("Product deleted.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                default:
                    System.out.println("Invalid number");
            }
        }
    }
}
