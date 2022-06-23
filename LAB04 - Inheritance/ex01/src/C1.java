public class C1 {
    public int p1;
    protected int p2;
    private int p3;

    public C1(int p1, int p2, int p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        System.out.println("Classe C1: chamada do construtor com parametros");
    }

    public C1(){
            System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getP3() {
        return p3;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }

    public void mostrar_atributos(){
        System.out.println(this.p1 + " " + this.p2 + " " + this.p3);
    }
    public void mostrar_atributos_super(){
        System.out.println();
    }
}
