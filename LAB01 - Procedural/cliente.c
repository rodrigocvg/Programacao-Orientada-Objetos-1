#include "cliente.h"
#include <stdlib.h>
#include <stdio.h>
#include <string.h>


struct cliente{
    int cpf;
    char nome[50];
    char datanasc[50];  
    int cep;
    int qntdcompra;
};

cliente *cria_cliente(char *nome, int cpf, int cep, char* datanasc)
{
    cliente *cl;
    cl = malloc(1 * sizeof(cliente));
    if (cl != NULL)
    {
        strcpy(cl->nome, nome);
        cl->cpf = cpf;
        cl->cep = cep;
        strcpy(cl->datanasc, datanasc);


        
    }
    return cl;
};

int destroicl(cliente *cl){

    if(cl == NULL)
        return -1;
    else{
        free(cl);
        return 0;
    }
}

void printclinfo(cliente *cl){
    printf("Cliente: %s\n",cl->nome);
    printf("Data Nascimento: %s\n",cl->datanasc);
    printf("CPF: %d\n",cl->cpf);
    printf("Quantidade de compras: %d\n",cl->qntdcompra);
}