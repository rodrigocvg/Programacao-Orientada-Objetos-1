import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) throws Exception {
        Contato c[] = new Contato[30];
        int i =0;
        while(true){
            int op;
            Scanner sc = new Scanner(System.in);
            System.out.println("1-Inserir Contato: ");
            op = sc.nextInt();
            switch(op){
                case 1:
                System.out.println("Digite o tipo de contato: ");
                System.out.println("1-Familia/2-Amigos/3-Trabalho");
                int op1;
                op1 = sc.nextInt();
                switch(op1){
                    case 1:
                    String ap,name,em,aniv,parent;
                    System.out.println("Digite o apelido: ");
                    ap = sc.next();
                    System.out.println("Digite o nome: ");
                    name=sc.next();
                    System.out.println("Digite o email: ");
                    em = sc.next();
                    System.out.println("Digite o aniversário: ");
                    aniv = sc.next();
                    System.out.println("Digite o parentesco: ");
                    parent = sc.next();
                    c[i] = new Familia(ap, name, em, aniv, parent);
                    i++;
                    case 2:
                    String ap1,name1,em1,aniv1,grau;
                    System.out.println("Digite o apelido: ");
                    ap1 = sc.next();
                    System.out.println("Digite o nome: ");
                    name1 =sc.next();
                    System.out.println("Digite o email: ");
                    em1 = sc.next();
                    System.out.println("Digite o aniversário: ");
                    aniv1 = sc.next();
                    System.out.println("Digite o grau: ");
                    grau = sc.next();
                    c[i] = new Familia(ap1, name1, em1, aniv1, grau);
                    i++;
                    case 3:


                    
                }

            }
        }
    }
}
