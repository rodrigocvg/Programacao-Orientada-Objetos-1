typedef struct funcionario funcionario;

funcionario *cria_funcionario(char *nome, int cpf, char* datanasc, char* dataing);
int destroifuncionario(funcionario *func);
void printfuncionarioinfo(funcionario *func);