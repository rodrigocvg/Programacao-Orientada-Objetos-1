public class C3 extends C2 {

    public int p7;
    protected int p8;
    private int p9;

    public C3(int p1, int p2, int p3,int p4, int p5, int p6, int p7, int p8, int p9) {
        this.p1 = p1;
        this.p2 = p2;
        this.setP3(p3);
        this.p4 = p4;
        this.p5 = p5;
        this.setP6(p6);
        this.p7 = p7;
        this.p8 = p8;
        this.p9 = p9;
        System.out.println("Classe C3: chamada do construtor com parametros");
    }
    
    public C3(){
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");
    }

    
    public C3(String m){
        super();
    }

    public int getP7() {
        return p7;
    }

    public void setP7(int p7) {
        this.p7 = p7;
    }

    public int getP8() {
        return p8;
    }

    public void setP8(int p8) {
        this.p8 = p8;
    }

    public int getP9() {
        return p9;
    }

    public void setP9(int p9) {
        this.p9 = p9;
    }

    public void mostrar_atributos(){
        System.out.println(this.p1 + " " + this.p2 + " " + this.getP3() + " " + this.p4 + " " + this.p5 + " " + this.getP6() +" " +  this.p7 + " " + this.p8 + " " + this.p9);
    }
    
    @Override
    public void mostrar_atributos_super(){
        super.mostrar_atributos();
        System.out.println(" " + this.p7 + " " +  this.p8 + " " + this.p9);
    }
    
    
}
