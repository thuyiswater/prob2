import java.util.Arrays;

public class PeopleQueue {
    Person[] people;
    int size = 0;
    int MAX_SIZE = 100;

    public PeopleQueue() {
        people = new Person[MAX_SIZE];
    }

    public void joinQueue(Person person) {
        if(person.age < 65) {
            people[size] = person;
            size++;
            return;
        }

        int index = size;
        while(index > 0) {
            if(people[index - 1].age < 65) {
                people[index] = people[index - 1];
                index--;
            } else break;
        }

        people[index] = person;
        size++;
    }

    public Person getVaccine() {
        if(size == 0) return null;
        Person p = people[0];
        for(int i = 0; i < size; i++) {
            people[i] = people[i + 1];
        } size--;
        return p;
    }

    public void giveUp() {

    }

    public void print() {
        for(int i = 0; i <size; i++) {
            System.out.println("id: " + people[i].id + ", age: " + people[i].age);
        }
    }

    @Override
    public String toString() {
        return "dit me may";
    }
}
