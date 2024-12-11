public class principal {
    public static void main(String[] args) {
        // Criando objetos de todas as classes concretas
        C2 objC2 = new C2("Atributo C1 em C2", "Atributo C2");
        C3 objC3 = new C3("Atributo C1 em C3", "Atributo C3");
        C4 objC4 = new C4("Atributo C1 em C4", "Atributo C2 em C4", 42);
        C5 objC5 = new C5("Atributo C1 em C5", "Atributo C2 em C5", true);

        // Testando métodos
        System.out.println("=== C2 ===");
        objC2.metodoAbstrato();
        objC2.metodoC1();
        objC2.metodoC2();

        System.out.println("\n=== C3 ===");
        objC3.metodoAbstrato();
        objC3.metodoC1();
        objC3.metodoC3();
        objC3.metodoI1();
        objC3.metodoI2A();
        objC3.metodoI2B();

        System.out.println("\n=== C4 ===");
        objC4.metodoAbstrato();
        objC4.metodoC1();
        objC4.metodoC2(); // Método sobreposto
        objC4.metodoC4();

        System.out.println("\n=== C5 ===");
        objC5.metodoAbstrato();
        objC5.metodoC1();
        objC5.metodoC2();
        objC5.metodoI1();
        objC5.metodoC5();
    }
}
