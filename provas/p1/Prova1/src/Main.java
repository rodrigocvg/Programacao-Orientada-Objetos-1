import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Informe os dados que definem o circulo: ");
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        Circulo c1 = new Circulo(p,r);
        double area = c1.area();
        System.out.println("A área do ponto é "+ area);


        System.out.println("Informe o valor de um raio:");
        float r2 = sc.nextFloat();
        double perimetro = Circulo.perimetro(r2);
        System.out.println("O perimetro é "+perimetro);

        Circulo []c = new Circulo[30];

        int n;
        System.out.println("Digite quantos círculos deseja criar: ");
        n = sc.nextInt();
        int i =0;
        int j =0;
        for(i=0;i<n;i++){
            float pontC[] = new float[30];
            float raio[] = new float[30];
            System.out.println("Digite o ponto central e o raio: ");
            pontC[i] = sc.nextFloat();
            raio[i] = sc.nextFloat();
            c[i] = new Circulo(pontC[i],raio[i]);
        }


       //1 for(j=0;j<n;j++){
        //    System.out.println("O ponto "+ i  + "tem ponto central = " + c[i].getPontoCentral() + "e raio = " + c[i].getRaio() );
       // }

        double maior = 0;
        double area1 = 0;
        for(j=0;j<n;j++){
                if(c[i].getArea()>maior){
                    area1 = c[i].getArea();
                    area1  = maior;
                }
        }
        
        System.out.println("A maior área é de "+ area1);






        
    }
}
