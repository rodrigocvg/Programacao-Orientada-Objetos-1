

public class Circulo {
    private float pontoCentral;
    private float raio;
    private double area; 
    public Circulo(){
      
    
    }

    public Circulo(float pC, float r){
        this.pontoCentral = pC;
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


    public float getPontoCentral() {
        return pontoCentral;
    }
    public float getRaio() {
        return raio;
    }
    public void setPontoCentral(float pontoCentral) {
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
