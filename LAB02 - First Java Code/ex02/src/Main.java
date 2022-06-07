import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

            System.out.println("Digite o código, nome, fabricante e preço do produto:");
            Scanner sc = new Scanner(System.in);
            int codP = sc.nextInt();
            String nomeP = sc.next();
            String fabrP = sc.next();
            float precoP = sc.nextFloat();

            Produto p1 = new Produto(codP, nomeP, fabrP, precoP);
            System.out.println(p1.código + " " +  p1.nome + " " + p1.fabricante + " " + p1.preço);


        System.out.println("Digite o CPF, o nome, a data de nascimento e a data de ingresso do funcionario:");
        int cpfF = sc.nextInt();
        String nomeF = sc.next();
        String datanascF = sc.next();
        String dataingF = sc.next();

        Funcionário f1 = new Funcionário(cpfF,nomeF,datanascF,dataingF);
        System.out.println(f1.CPF + " " +  f1.nome + " " + f1.dataNasc + " " + f1.dataIng);

        System.out.println("Digite o CPF, o nome, a data de nascimebnto e o CEP do cliente:");
        int cpfC = sc.nextInt();
        String nomeC = sc.next();
        String datanascC = sc.next();
        int cepC = sc.nextInt();

        Cliente c1 = new Cliente(cpfC,nomeC,datanascC,cepC);
        System.out.println(c1.CPF + " " +  c1.nome + " " + c1.datanasc + " " + c1.CEP);

        c1.comprar(p1,f1);

        sc.close();


    }
}