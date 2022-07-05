public class Cubo extends FormaTridimensional{
    private float lado;

    public Cubo(float lado) {
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

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.print("Cubo");
    }
    
    
    
}
