class C5 extends C2 implements I1 {
    private boolean atributoC5;

    public C5(String atributoC1, String atributoC2, boolean atributoC5) {
        super(atributoC1, atributoC2);
        this.atributoC5 = atributoC5;
    }

    @Override
    public void metodoI1() {
        System.out.println("Método da interface I1 implementado em C5");
    }

    public void metodoC5() {
        System.out.println("Método da classe C5: " + atributoC5);
    }
}
