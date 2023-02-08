package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();
        WriteReadFiles writeFiles = new WriteReadFiles(mapper);
        List<Person> persons = writeFiles.readFile();
        Menu menu = new Menu(scanner, persons, writeFiles);

    }


}
