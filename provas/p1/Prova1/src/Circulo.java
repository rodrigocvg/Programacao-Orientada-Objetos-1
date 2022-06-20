

public class Circulo {
    private String pontoCentral;
    private float raio;
    private double area; 


    public Circulo(){
      
    
    }

    public Circulo(Ponto p, float r){
        this.pontoCentral = "(" + p.getX() + "," + p.getY()+ ")";
        this.raio = r;
    }

    public double area(){
        double area = Math.PI* this.raio * this.raio;
        this.setArea(area);
        return area;
    }

    public static double perimetro(float r){
        double perimetro = 2 * Math.PI * r;
        return perimetro;
    }




    
    public float getRaio() {
        return raio;
    }
    public String getPontoCentral() {
        return pontoCentral;
    }
    public void setPontoCentral(String pontoCentral) {
        this.pontoCentral = pontoCentral;
    }
    
    
    public void setRaio(float raio) {
        this.raio = raio;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    
}
