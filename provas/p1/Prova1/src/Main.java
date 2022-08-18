import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Informe os dados que definem o circulo: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o x: ");
        float x = sc.nextFloat();
        System.out.println("Digite o y: ");
        float y = sc.nextFloat();
        Ponto p1 = new Ponto(x,y);

        System.out.println("Digite o raio: ");

        float r = sc.nextFloat();
        Circulo c1 = new Circulo(p1,r);
        double area = c1.area();
        System.out.println("A área do ponto é "+ area);


        System.out.println("Informe o valor de um raio:");
        float r2 = sc.nextFloat();
        double perimetro = Circulo.perimetro(r2);
        System.out.println("O perimetro é "+perimetro);

        Circulo []c = new Circulo[30];
        Ponto []p = new Ponto[30];

        int n;
        System.out.println("Digite quantos círculos deseja criar: ");
        n = sc.nextInt();
        int i =0;
        for(i=0;i<n;i++){
            System.out.println("Digite o ponto e o raio: ");
            float x1[] = new float[30];
            float y1[] = new float[30];// check:<<<erro:vetor criado todo passo do laço>>>>
            System.out.println("Digite o x: ");
            x1[i] = sc.nextFloat();
            System.out.println("Digite o x: ");
            y1[i] = sc.nextFloat();
            p[i] = new Ponto(x1[i], y1[i]);

            System.out.println("Digite o raio: ");

            float raio[] = new float[30];// check:<<<erro:vetor criado todo passo do laço>>>>
            
            raio[i] = sc.nextFloat();
            c[i] = new Circulo(p[i],raio[i]);
        }


       for(i=0;i<n;i++){
          System.out.println("O ponto "+ i  + " tem ponto central = " + c[i].getPontoCentral() + " e raio = " + c[i].getRaio() );
        }

        double maior = 0;
        String nome = null;
        for(i=0;i<n;i++){
            double area2[] = new double[30];// check:<<<erro: o vetor está sendo criado a cada passo do laço>>>>
            area2[i] = c[i].area();
                if(area2[i]>maior){
                    maior = area2[i];
                    nome = c[i].getPontoCentral();
    
                }
        }
        
        System.out.println("A maior área é de "+ maior + " do ponto " + nome);






        
    }
}
