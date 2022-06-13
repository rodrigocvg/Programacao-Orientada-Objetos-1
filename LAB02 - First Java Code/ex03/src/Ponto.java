public class Ponto {


    public float x;
    public float y;

    public Ponto(){
    }

    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void imprime_ponto(){
        System.out.println("O ponto digitado é: (" + x + "," + y + ")");
    }


    public Ponto somaPontos(Ponto a, Ponto b){
        float x1;
        float y1;


        x1 = a.x + b.x;
        y1 = a.y + b.y;
        //System.out.println("A soma de (" + a.x + "," + a.y + ") com (" + b.x + "," + b.y + ") é (" + x1 + "," + y1 + "");
        Ponto pf = new Ponto(x1,y1);
        return pf;
    }

    public static void somaPontos(Ponto a, Ponto b,Ponto c){
        float x1;
        float y1;


        x1 = a.x + b.x;
        y1 = a.y + b.y;
        //System.out.println("A soma de (" + a.x + "," + a.y + ") com (" + b.x + "," + b.y + ") é (" + x1 + "," + y1 + "");
        c.x = x1;
        c.y = y1;
    }

    public void calc_area(Ponto a, Ponto b){

    }

    public void mult_ponto(int c){
            float a = this.x * c;
            float b = this.y * y;
        System.out.println("Resultado: (" + this.x + "," + this.y + ") * "+ c + " = " + "(" + a + "," + b + ")");
        this.x = this.x * c;
        this.x = this.y * y;

    }

    public void inc_dir(String cord){
        if(cord.equals("l")){
            this.x++;
        }
        if(cord.equals("o")){
            this.x--;
        }
        if(cord.equals("n")){
            this.y++;
        }
        if(cord.equals("s")){
            this.y--;
        }
    }

    public void ind_diag(String cord){
        if(cord.equals("sudeste")){
            this.x++;
            this.y--;
        }
        if(cord.equals("sudoeste")){
            this.x--;
            this.y--;
        }
        if(cord.equals("nordeste")){
            this.x++;
            this.y++;
        }
        if(cord.equals("noroeste")){
            this.x--;
            this.y++;
        }
    }
}