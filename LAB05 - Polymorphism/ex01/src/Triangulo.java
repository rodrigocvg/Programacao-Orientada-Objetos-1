public class Triangulo extends FormaBidimensional{

    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float obterArea(){
        this.area = this.base * this.altura;
        return this.area;
    }
    
}
