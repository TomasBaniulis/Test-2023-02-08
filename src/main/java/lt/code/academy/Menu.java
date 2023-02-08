package lt.code.academy;

import java.util.Scanner;

public class Menu {

    Scanner scanner;

    void mainMenu (){
        String action;
        do {
            System.out.println("""
                    [1] -> Enter new person
                    [2] -> Print list of persons
                    [0] -> exit
                    """);
            action = scanner.nextLine();

        } while (!action.equals(0));
    }


    void mainMenuAction(String action){
        switch (action){
            case "1" -> ;
            case "2" -> ;
            case "0" -> System.out.println("Exit");
            default -> System.out.println("No such action");

        }
    }


    Person createNewPerson (){
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter surname");
        String surname = scanner.nextLine();
        System.out.println("enter id");
        String id = scanner.nextLine();

        return new Person(name, surname, id);

    }





}
