public class Ingresso {
    private float valor;


    

    public Ingresso(float valor) {
        this.valor = valor;
    }

    public Ingresso(){

    }


    public void escreverValor(){
        System.out.println("O valor do ingresso é : " + this.valor);
    }


    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
}
