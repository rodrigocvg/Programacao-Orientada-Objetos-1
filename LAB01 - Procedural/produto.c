#include "produto.h"
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

struct produto{
    int codigo;
    char nome[50];
    char fabricante[50];
    float preco;
    int qntdcomprado;
};

produto *cria_produto(char *nome, float preco)
{
    produto *p;
    p = malloc(1 * sizeof(produto));
    if (p != NULL)
    {
        strcpy(p->nome, nome);
        p->preco = preco;
        
    }
    return p;
};

int destroiprod(produto *p){

    if(p == NULL)
        return -1;
    else{
        free(p);
        return 0;
    }
}

void printprodinfo(produto *p){
    printf("Produto: %s\n",p->nome);
    printf("Fabricante: %s\n",p->fabricante);
    printf("Código: %d\n",p->codigo);
    printf("Quantidade vendido: %d\n",p->qntdcomprado);
}


