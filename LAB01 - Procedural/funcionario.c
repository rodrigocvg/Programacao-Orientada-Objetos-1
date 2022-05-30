#include "funcionario.h"
#include <stdlib.h>
#include <stdio.h>
#include <string.h>


struct funcionario{
    int cpf;
    char nome[50];
    char datanasc[50]; 
    char dataIng[50];
    int qtdvenda;
};

funcionario *cria_funcionario(char *nome, int cpf, char* datanasc, char* dataing)
{
    funcionario *func;
    func = malloc(1 * sizeof(funcionario));
    if (func != NULL)
    {
        strcpy(func->nome, nome);
        func->cpf = cpf;
        strcpy(func->datanasc, datanasc);
        strcpy(func->dataIng, dataing);


        
    }
    return func;
};

int destroifunc(funcionario *func){

    if(func == NULL)
        return -1;
    else{
        free(func);
        return 0;
    }
}

void printfuncinfo(funcionario *func){
    printf("funcionario: %s\n",func->nome);
    printf("Data Nascimento: %s\n",func->datanasc);
    printf("CPF: %d\n",func->cpf);
    printf("Data de Ingresso: %s\n",func->dataIng);
    printf("Quantidade de compras: %d\n",func->qtdvenda);
}