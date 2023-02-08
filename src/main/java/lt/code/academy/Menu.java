package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    ObjectMapper mapper = new ObjectMapper();
    WriteReadFiles writeRead = new WriteReadFiles(mapper);
    List<Person> persons = writeRead.readFile();

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
            case "1" -> addPersonToList();
            case "2" -> printList();
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

    void addPersonToList (){
        Person person = createNewPerson();
        for (Person p : persons ) {
            if (p.getId().equals(person.getId())){
                System.out.printf("Person with ID: %s exist.", person.getId());
                return;
            }
            persons.add(person);
            System.out.println("Person was added successfully");
        }
    }

    void printList (){
        persons.forEach(System.out::println);
    }







}
