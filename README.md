# Consultorio_Odontologico
Sistema para um consultório odontológico com cadastro de funcionários, dentistas, procedimentos, controle de caixa e controle de marcação de procedimento. Roteiro obrigatório da disciplina de Orientação a Objetos do 3º Período.

## Características:
1. Secretária pode:
  * Cadastrar Pacientes
  * Realizar Agendamentos de Procedimentos
  * Consultar Lista de Pacientes
  * Acesso total ao Caixa
2. Dentista Proprietário pode:
  * Cadastrar Funcionários (qualquer natureza) e Procedimentos
  * Consultar Lista de Pacientes e de Funcionários
  * Acesso parcial ao Caixa (somente ver o saldo, sem poder realizar alterações

### TODO:
- Alterar atributos das classes `Secretaria`
- Arrumar os botões da Tela Principal de acordo com os poderes de acesso permitidos anteriormente;
- criar atributo *cargo* na classe`Funcionario`, pois será necessário para a GUI de Cadastro de Funcionários;
- implementar tabela em `JDialog` no Cadastro de Funcionários e de Dentistas Colaboradores;
- alterar interface `Pattern View` - retirar os métodos `copyFromFieldsToObject` e `copyFromObjectToFields` e traduzir os métodos;
- alterar os botões de rádio da classe `FrCad` para `JList`
- fazer o diagrama UML e subir pra pasta raiz do projeto;
