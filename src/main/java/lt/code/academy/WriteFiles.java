package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class WriteFiles {

    ObjectMapper mapper;

    void writeToFile (String fileName, Object object){
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        File file = new File(fileName);
        try{
            if (!file.exists()){
                file.createNewFile();
            }
            mapper.writeValue(file,object);
        }catch (IOException e){
            System.out.printf("Can't create file %s: %s%n:", fileName, e.getMessage());
        }

    }

    List<Person> readFile  (String fileName){

    }



}



