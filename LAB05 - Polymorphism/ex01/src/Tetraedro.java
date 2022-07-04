public class Tetraedro extends FormaTridimensional{
    private float areaBase;
    private float altura;
    private float lado;


   

    public Tetraedro(float areaBase, float altura, float lado) {
        super();
        this.areaBase = areaBase;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public float obterArea(){
        this.area = (float)Math.pow(this.lado, 2) * (float)Math.sqrt(3);
        return this.area;

    }

    @Override 
    public float obterVolume(){
        this.volume = 1/3 * areaBase * altura;
        return this.volume;

    }
    
}
