public class Circulo extends FormaBidimensional{
    
    protected float raio;

    

    public Circulo(float raio) {
        super();
        this.raio = raio;
    }

    
    @Override
    public float obterArea(){
        this.area = (float) Math.PI + this.raio * this.raio;

        return this.area;
    }


    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.print("Círculo");
    }

    
}
