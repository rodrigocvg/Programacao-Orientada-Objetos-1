public class Quadrado extends FormaBidimensional{

    private int lado;

    @Override
    public float obterArea(){
        this.area = this.lado * this.lado;
        return this.area;
    }
    
}
