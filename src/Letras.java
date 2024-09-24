public enum Letras {
    A(1),B(2),C(3),D(4),E(5),F(6),G(7),H(8);

    private int valor;

    Letras(int valor){
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }
}
