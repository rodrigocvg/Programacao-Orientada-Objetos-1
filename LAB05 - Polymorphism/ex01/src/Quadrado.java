public class Quadrado extends FormaBidimensional{

    private float lado;

    public Quadrado(float lado) {
        super();
        this.lado = lado;
    }

    @Override
    public float obterArea(){
        this.area = this.lado * this.lado;
        return this.area;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.print("Quadrado");
    }

    
    
}
