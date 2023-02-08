package lt.code.academy;

public class Person {

    String name;
    String surname;
    String Id;

    public Person() {
    }

    public Person(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Id='" + Id + '\'' +
                '}';
    }
}
