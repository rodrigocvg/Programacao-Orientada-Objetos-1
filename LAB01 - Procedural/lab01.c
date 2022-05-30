#include <stdio.h> 
#include <string.h>
#include "produto.h"
#include "produto.c"
#include "cliente.h"
#include "cliente.c"
#include "funcionario.h"
#include "funcionario.c"

void venda(produto *p,cliente *cl, funcionario *func){
      p->qntdcomprado += 1;
      cl->qntdcompra += 1;
      func->qtdvenda += 1;  
}

int main(){
    int opcao;

    
    produto *p1;
    produto *p2;
    produto *p3;

    cliente *cl1;

    funcionario *func1;

    char nomeprod[4][100];
    float preco[4];
    char nomecl[4][100];
    int cpf[4];
    int cep[4];
    char datanasccl[4][100]; 

    char nomefunc[4][100];
    int cpfFunc[4];
    char datanascFunc[4][100]; 
    char dataIngFunc[4][100];
    printf("CADASTRO DO PRODUTO 1\n Digite o nome e o preço do produto");
    scanf("%s",nomeprod[0]);
    scanf("%f",&preco[0]);
    
    p1 = cria_produto(nomeprod[0],preco[0]);
    
    printf("CADASTRO DO PRODUTO 2\n Digite o nome e o preço do produto");
    scanf("%s",nomeprod[1]);
    scanf("%f",&preco[1]);
    p2 = cria_produto(nomeprod[1],preco[1]);

    printf("CADASTRO DO PRODUTO 2\n Digite o nome e o preço do produto");
    scanf("%s",nomeprod[2]);
    scanf("%f",&preco[2]);
    p3 = cria_produto(nomeprod[2],preco[2]);


    printf("CADASTRO DO CLIENTE 1\n Digite o nome, o cpf, o cep e a data de nascimento:");
    printf("\nNome:");
    scanf("%s",nomecl[0]);
    printf("\nCpf:");
    scanf("%d",&cpf[0]);
    printf("\nCep:");
    scanf("%d",&cep[0]);
    printf("\nData Nascimento:");
    scanf("%s",datanasccl[0]);
    cl1 = cria_cliente(nomecl[0],cpf[0],cep[0],datanasccl[0]);
    
    printf("CADASTRO DO FUNCIONARIO 1\n Digite o nome, o cpf, a data de nascimento e a data de ingresso:");   
    printf("\nNome:");
    scanf("%s",nomefunc[0]);
    printf("\nCpf:");
    scanf("%d",&cpfFunc[0]);
    printf("\nData Nascimento:");
    scanf("%s",datanascFunc[0]);
    printf("\nData de Ingresso:");
    scanf("%s",dataIngFunc[0]);

    func1 = cria_funcionario(nomefunc[0],cpfFunc[0],datanascFunc[0],dataIngFunc[0]);

    printf("Realizar uma venda do produto 1, cliente 1 e funcionario 1:\n");
    venda(p1,cl1,func1);
    printf("Venda realizada com sucesso\n\n\n\n\n");

    printprodinfo(p1);
    printclinfo(cl1);
    printfuncinfo(func1);


    

    return 0;
}