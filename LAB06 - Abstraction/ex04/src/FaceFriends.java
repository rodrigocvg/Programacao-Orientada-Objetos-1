import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) throws Exception {
        Contato c[] = new Contato[30];
        int i =0;
        while(true){
            int op;
            Scanner sc = new Scanner(System.in);
            System.out.println("1-Inserir Contato: ");
            System.out.println("2- Imprimir todos contatos");
            System.out.println("3- Imprimir apenas familiares");
            System.out.println("4- Imprimir amigos");
            System.out.println("5- Imprimir colegas de trabalho");
            System.out.println("6- Imprimir melhores amigos, irmãos, e colegas de trabalho");
            System.out.println("7 - Imprimir contato específico: ");
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
                    
                    System.out.println("Contato Familia criado");
                    continue;

                    case 2:
                        String ap1,name1,em1,aniv1;
                        int grau;
                        System.out.println("Digite o apelido: ");
                        ap1 = sc.next();
                        System.out.println("Digite o nome: ");
                        name1 =sc.next();
                        System.out.println("Digite o email: ");
                        em1 = sc.next();
                        System.out.println("Digite o aniversário: ");
                        aniv1 = sc.next();
                        System.out.println("Digite o grau: ");
                        grau = sc.nextInt();
                        c[i] = new Amigos(ap1, name1, em1, aniv1, grau);
                        i++;
                        System.out.println("Contato Amigo criado");
                        continue;

                    case 3:
                        String ap2,name2,em2,aniv2,tipo;
                        System.out.println("Digite o apelido: ");
                        ap2 = sc.next();
                        System.out.println("Digite o nome: ");
                        name2 =sc.next();
                        System.out.println("Digite o email: ");
                        em2 = sc.next();
                        System.out.println("Digite o aniversário: ");
                        aniv2 = sc.next();
                        System.out.println("Digite o tipo: ");
                        tipo = sc.next();
                        c[i] = new Trabalho(ap2, name2, em2, aniv2, tipo);
                        i++;
                        System.out.println("Contato Trabalho criado");
                        continue;
                    default: 
                        break;
                    }
                case 2:
                    System.out.println("Imprimir todos contatos:");
                    for(int j =0;j<i;j++){
                        System.out.println("Contato "+ j);
                        System.out.println(c[j].imprimirContato());
                        System.out.println("-------------------------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("Imprimir apenas familiares ");
                    for(int j =0;j<i;j++){
                        if(c[j].getParentesco() != null){
                            System.out.println("Contato  " + j + ": ");
                            System.out.println(c[j].imprimirContato());
                        }
                        else{
                            break;
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Imprimir apenas amigos");
                    for(int j =0;j<i;j++){
                        if(c[j].getGrau() != 0){
                            System.out.println("Contato  " + j + ": ");
                            System.out.println(c[j].imprimirContato());
                        }
                    }
                    break;
                case 5: 
                    System.out.println("Imprimir apenas colegas de trabalho");
                    for(int j =0;j<i;j++){
                        if(c[j].getTipo() != null){
                            System.out.println("Contato  " + j + ": ");
                            System.out.println(c[j].imprimirContato());
                        }
                    }
                    break;
                case 6: 
                    System.out.println("Imprimir melhores amigos, irmãos, e colegas de trabalho");
                    for(int j =0;j<i;j++){
                        if(c[j].getGrau() == 1){
                            System.out.println("Contato  " + j + ": ");
                            System.out.println(c[j].imprimirContato());
                        }
                        if(c[j].getParentesco()== "irmão"){
                            System.out.println("Contato  " + j + ": ");
                            System.out.println(c[j].imprimirContato());
                        }
                        if(c[j].getTipo()== "colega"){
                            System.out.println("Contato  " + j + ": ");
                            System.out.println(c[j].imprimirContato());
                        }
                        else{
                            break;
                        }
                    }
                    break;
                case 7:
                int ctt;
                System.out.println("Digite o índice do contato: ");
                ctt = sc.nextInt();
                System.out.println("Contato do tipo: " + c[ctt].getClass());
                System.out.println(c[ctt].imprimirContato());
                break;

                default: 
                break;
            }
        }
    }
}
