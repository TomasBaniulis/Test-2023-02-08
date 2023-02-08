package lt.code.academy;

import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scanner;
    List<Person> persons;
    WriteReadFiles writeRead;

    public Menu(Scanner scanner, List<Person> persons, WriteReadFiles writeRead) {
        this.scanner = scanner;
        this.persons = persons;
        this.writeRead = writeRead;
    }

    void mainMenu (){
        String action;
        do {
            System.out.println("""
                    [1] -> Enter new person
                    [2] -> Print list of persons
                    [0] -> exit
                    """);
            action = scanner.nextLine();
            mainMenuAction(action);

        } while (!action.equals(0));
    }

    void mainMenuAction(String action){
        switch (action){
            case "1" -> addPersonToList(persons);
            case "2" -> printList(persons);
            case "0" -> {
                writeRead.writeToFile(persons);
                System.out.println("Exit");
            }
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

    void addPersonToList (List<Person> persons){
        Person person = createNewPerson();
        for (Person p : persons ) {
            if (p.getId().equals(person.Id)){
                System.out.printf("Person with ID: %s exist.", person.getId());
                return;
            }
            persons.add(person);
        }
    }

    void printList (List<Person> persons){
        persons.forEach(System.out::println);
    }







}
