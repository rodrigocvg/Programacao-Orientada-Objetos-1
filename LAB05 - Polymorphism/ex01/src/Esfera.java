public class Esfera extends FormaTridimensional{
    
    private float raio;

    public Esfera(float raio) {
        super();
        this.raio = raio;
    }

    @Override
    public float obterArea(){
        this.area = 4 * (float)Math.PI * (float)Math.pow(raio, 2);
        return this.area;

    }

    @Override 
    public float obterVolume(){
        this.volume = 4/3 * (float)Math.PI * (float)Math.pow(raio, 2);
        return this.volume;

    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.print("Esfera");
    }




    
}
