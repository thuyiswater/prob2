public class Main {

    public static void main(String[] args) {
	PeopleQueue list = new PeopleQueue();

	list.joinQueue(new Person("1", 20));
	list.joinQueue(new Person("2", 65));
	list.joinQueue(new Person("3", 65));
	list.joinQueue(new Person("4", 70));
	list.joinQueue(new Person("5", 45));
	list.print();

    }
}
