public class CamaroteSuperior extends VIP{

    private String localizacao;

    public CamaroteSuperior(float valor, float adicional,String loc) {
        super(valor, adicional);
        this.localizacao = loc;
    }

    public float ValorIng(){
        return super.getValor();
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    



    
    
}
