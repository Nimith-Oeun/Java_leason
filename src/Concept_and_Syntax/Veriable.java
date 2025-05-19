package Concept_and_Syntax;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Scanner;
import java.util.UUID;

import static java.util.UUID.randomUUID;
class User{
    public int id;
    public String name;
    public String email;
}
enum Status{
    FAILED,
    SUCCESS
}

public class Veriable {
    public static void  main (String[] args) {
        //reference data type
        User user = new User();
        user.id = 1;
        user.name = "John Doe";
        user.email = "sasa@gmail.com";
        System.out.println(user.id);
        System.out.println(user.name);
        System.out.println(user.email);

        Status status = Status.SUCCESS; // enum
        System.out.println(status);

        //=============================================
        //primitive data type
        int a = 10;
        long b = 20;
        float c = 30.0f;
        double d = 40.0;
        char e = 'A';
        boolean f = true;
        String g = "Hello World";

        // wrapper class user for convert primitive data type to object
        Short myNewAge = 12;
        Character newGender = 'A';
        Double pPrice = 2.9;
        Float ff  = 2.4f;
        Byte _byte = 2;
        double result = myNewAge.doubleValue();


//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
//        System.out.println("e = " + e);
//        System.out.println("f = " + f);
//        System.out.println("g = " + g);

        System.out.println("please Insert ID: ");
        int id = new Scanner(System.in).nextInt();
        String uuid = UUID.randomUUID().toString(); // random UUID
        System.out.println("Please Insert your name");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Please Insert your price");
        double price = new Scanner(System.in).nextDouble();
        System.out.println("Please Insert your quantity");
        int quantity = new Scanner(System.in).nextInt();

//        System.out.println("=".repeat(30));
//        System.out.println("""
//                ID  name  price  quantity
//                """);
//        System.out.println(id + "  " + name + "  " + price + "  " + quantity);

        Table table = new Table(4, BorderStyle.UNICODE_BOX_DOUBLE_BORDER);
        table.addCell("ID", new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell("Name", new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell("Price", new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell("Quantity", new CellStyle(CellStyle.HorizontalAlign.center));

        table.addCell(String.valueOf(id), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(name, new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(String.valueOf(price), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(String.valueOf(quantity), new CellStyle(CellStyle.HorizontalAlign.center));
        System.out.println(table.render());
    }


}
