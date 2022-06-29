public class CamaroteInferior extends VIP{

    private String localizacao;

    public CamaroteInferior(float ing,String loc) {
        super(ing);
        this.localizacao = loc;
    }

    public void imprimeLoc(){
        System.out.println("A localização desse ingresso é: " + this.localizacao);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    
    
}
