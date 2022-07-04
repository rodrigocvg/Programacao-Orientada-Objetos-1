public abstract class Forma {
    protected float area;
    protected float volume;

    public Forma() {
    }

    public Forma(float area) {
        this.area = area;
    }
    
    public float obterArea(){
        return this.area;
    }

    public float obterVolume(){
        return this.volume;
    }

    
}
