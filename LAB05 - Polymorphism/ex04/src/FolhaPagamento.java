public class FolhaPagamento extends Funcionario{

    public FolhaPagamento(Funcionario f){
    }

    public void mostrarSalario(Funcionario f){
        System.out.println("O salário de "+ f.getNome() + " é de "+ f.getSalario());
    }

   
}
