typedef struct cliente cliente;

cliente *cria_cliente(char *nome, int cpf, int cep, char* datanasc);
int destroicliente(cliente *p);
void printclienteinfo(cliente *p);