class C2 extends C1 {
    protected String atributoC2;

    public C2(String atributoC1, String atributoC2) {
        super(atributoC1);
        this.atributoC2 = atributoC2;
    }

    @Override
    public void metodoAbstrato() {
        System.out.println("Implementação do método abstrato em C2");
    }

    public void metodoC2() {
        System.out.println("Método da classe C2: " + atributoC2);
    }
}
