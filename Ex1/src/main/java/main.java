public class main {
    public static void main(String[] args) {
        NoGenericMethods n1 = new NoGenericMethods("Charlie","Bob","Alice");
        NoGenericMethods n2 =new NoGenericMethods("Bob","Alice","Charlie");
        NoGenericMethods n3 =new NoGenericMethods("Alice","Charlie","Bob");

        // Mostrar los valores almacenados para comprobar el orden
        System.out.println("First example: ");
        System.out.println(n1.getO1());
        System.out.println(n1.getO2());
        System.out.println(n1.getO3());

        System.out.println("Second example: ");
        System.out.println(n2.getO1());
        System.out.println(n2.getO2());
        System.out.println(n2.getO3());

        System.out.println("Third example: ");
        System.out.println(n3.getO1());
        System.out.println(n3.getO2());
        System.out.println(n3.getO3());



    }
}
