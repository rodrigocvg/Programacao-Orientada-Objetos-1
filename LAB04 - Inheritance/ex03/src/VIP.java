public class VIP extends Ingresso {
    private float adicional;



    
    public VIP(float valor, float adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public VIP(float adicional) {
        this.adicional = adicional;
    }

    public float ingVIP(){
        return this.adicional + super.getValor();
    }

    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }
    
}
