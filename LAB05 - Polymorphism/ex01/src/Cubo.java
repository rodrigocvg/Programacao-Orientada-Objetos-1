public class Cubo extends FormaTridimensional{
    private int lado;

    public Cubo(int lado) {
        super();
        this.lado = lado;
    }

    @Override
    public float obterArea(){
        this.area = 6 * (float)Math.pow(lado, 2);
        return this.area;

    }

    @Override 
    public float obterVolume(){
        this.volume = (float)Math.pow(lado, 3);
        return this.volume;
    }
    
}
