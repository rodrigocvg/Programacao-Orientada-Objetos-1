public class Empresa {
    public static void main(String[] args){
        Funcionario f[] = new Funcionario[10];
       
        f[0] = new Chefe("Lucas", "30/06/1987");
        f[1] = new Horista("Joao", "04/05/1999");
        f[2] = new Operario("Maria", "27/08/1989");
        f[3] = new Vendedor(1000, "Judas", "09/12/2000", 0);
        f[1].trabalhar();
        f[2].trabalhar();
        f[3].trabalhar();

        FolhaPagamento a[] = new FolhaPagamento[10];
        for(int i =0;i<4;i++){
            a[i] = new FolhaPagamento(f[i]);
            a[i].mostrarSalario(f[i]);
        }

        
    }
}
