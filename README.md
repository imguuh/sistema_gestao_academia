# sistema_gestao_academia
GRUPO A1 – Sistema de Gestão de Academia
Descrição: Sistema destinado ao gerenciamento de uma academia, permitindo controlar alunos, professores, exercícios e treinos.

O sistema deverá permitir as seguintes classes:
* Aluno;
* Professor;
* Treino;
* Exercício;
* Ficha

Relacionamentos:
* Um professor pode ter varios alunos -> associação;
* Um treino pode incluir varios exercicios -> associação;
* um aluno pode ter somente uma ficha -> associação;
* uma ficha pode ter varios treinos -> associação;

Relacionamentos:
Regras de negócio (implementar):
* Não permitir o cadastro de aluno sem nome e CPF;
* Um aluno poderá possuir apenas uma ficha de treino ativa;
* Um treino deverá possuir pelo menos um exercício;
* Não permitir que um exercício seja incluído duas vezes na mesma ficha de treino;
* Um professor poderá ser responsável por vários alunos;
* Ao cadastrar um exercício em um treino, deverão ser informadas as séries e repetições.
