package Concept_and_Syntax;

//import org.nocrala.tools.texttablefmt.Table;

import org.nocrala.tools.texttablefmt.Table;

import java.util.Scanner;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pratice {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString(); // random UUID
        System.out.println("Please Insert your name:");
        String name = new Scanner(System.in).nextLine();

        // check if name has been input regex
        Pattern pattern = Pattern.compile("^[a-zA-Z\\s]+$");
        Matcher matcher = pattern.matcher(name);
        if (!matcher.matches()) {
            System.out.println("Name must not contain number");
            return;
        }

        System.out.println("Please Insert your class:");
        int clas = new Scanner(System.in).nextInt();
        // check if class
        if (clas > 0 && clas <= 12 ){
            System.out.println("Class must not be 0");
            return;
        }

        System.out.println("Please Insert your score:");
        double score = new Scanner(System.in).nextInt();

        System.out.println("=".repeat(30));
        System.out.println("UUID: " + uuid);
        Table table = new Table(3);
        table.addCell("Name");
        table.addCell("Class");
        table.addCell("Score");

        table.addCell(name);
        table.addCell(String.valueOf(clas));
        table.addCell(String.valueOf(score));
        System.out.println(table.render());
    }
}
