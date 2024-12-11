class C4 extends C2 {
    private int atributoC4;

    public C4(String atributoC1, String atributoC2, int atributoC4) {
        super(atributoC1, atributoC2);
        this.atributoC4 = atributoC4;
    }

    @Override
    public void metodoC2() {
        System.out.println("Método sobreposto em C4: " + atributoC4);
    }

    public void metodoC4() {
        System.out.println("Método da classe C4: " + atributoC4);
    }
}
