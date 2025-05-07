public class Person {

    private String name;
    private String subname;
    private int age;

    public Person(String name, String subname, int age) {
        this.name = name;
        this.subname = subname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", subname='" + subname + '\'' +
                ", age=" + age +
                '}';
    }
}
