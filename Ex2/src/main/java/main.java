public class main {
    public static void main(String[] args) {
        Person person = new Person("Charlie","Smith",30);
        String message = "Welcome";
        int number = 46;

        GenericMethods gm = new GenericMethods();

        gm.displayArguments(person,message,number);
        gm.displayArguments(message,number,person);
        gm.displayArguments(number,person,message);
    }
}
