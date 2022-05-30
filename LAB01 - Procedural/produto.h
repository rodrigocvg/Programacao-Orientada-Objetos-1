typedef struct produto produto;

produto *cria_produto(char *nome, float preco);
int destroiprod(produto *p);
void printprodinfo(produto *p);