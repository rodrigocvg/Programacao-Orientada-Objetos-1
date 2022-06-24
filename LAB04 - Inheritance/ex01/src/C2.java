public class C2 extends C1{
    public int p4;
    protected int p5;
    private int p6;

    public C2(int p1, int p2, int p3,int p4, int p5, int p6) {
        this.p1 = p1;
        this.p2 = p2;
        this.setP3(p3);
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
        
        System.out.println("Classe C2: chamada do construtor com parametros");
    }

    public C2(){
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    public C2(String m){
        super();
    }

    public int getP4() {
        return p4;
    }

    public void setP4(int p4) {
        this.p4 = p4;
    }

    public int getP5() {
        return p5;
    }

    public void setP5(int p5) {
        this.p5 = p5;
    }

    public int getP6() {
        return p6;
    }

    public void setP6(int p6) {
        this.p6 = p6;
    }

    public void mostrar_atributos(){
        System.out.println(this.p1 + " " + this.p2 + " " + this.getP3() + " " + this.p4 + " " + this.p5 + " " + this.p6);
    }

    
    public void mostrar_atributos_super(){
        super.mostrar_atributos();
        System.out.println(" " +this.p4 + " " + this.p5 +  " " + this.p6);
    }


}
