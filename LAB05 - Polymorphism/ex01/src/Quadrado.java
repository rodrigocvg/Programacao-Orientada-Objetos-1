public class Quadrado extends FormaBidimensional{

    private int lado;

    public Quadrado(int lado) {
        super();
        this.lado = lado;
    }

    @Override
    public float obterArea(){
        this.area = this.lado * this.lado;
        return this.area;
    }
    
}
