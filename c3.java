class C3 extends C1 implements I1, I2 {
    private String atributoC3;

    public C3(String atributoC1, String atributoC3) {
        super(atributoC1);
        this.atributoC3 = atributoC3;
    }

    @Override
    public void metodoAbstrato() {
        System.out.println("Implementação do método abstrato em C3");
    }

    @Override
    public void metodoI1() {
        System.out.println("Método da interface I1 implementado em C3");
    }

    @Override
    public void metodoI2A() {
        System.out.println("Primeiro método da interface I2 implementado em C3");
    }

    @Override
    public void metodoI2B() {
        System.out.println("Segundo método da interface I2 implementado em C3");
    }

    public void metodoC3() {
        System.out.println("Método da classe C3: " + atributoC3);
    }
}
