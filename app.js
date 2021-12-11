function Aluno(nomeParam, qtdFaltasParam, notasParam) {
    this.nome = nomeParam;
    this.qtdFaltas = qtdFaltasParam;
    this.notas = notasParam;
    this.calculaMedia = function () {
        let media = 0;
        for (let i = 0; i < this.notas.length; i++) {
            media += this.notas[i];
        }
        media = media / this.notas.length
        return media.toFixed(2);
    }
    this.faltas = function () {
        return this.qtdFaltas + 1;
    }
}

function Curso(nomeCursoParam, notaAprovacaoParam, faltasMaximasParam, listaEstudantesParam) {
    this.nomeCurso = nomeCursoParam;
    this.notaAprovacao = notaAprovacaoParam;
    this.faltasMaximas = faltasMaximasParam;
    this.listaDeEstudantes = listaEstudantesParam;
    this.adicionarAlunos = function (novoAluno) {
        return this.listaEstudantes.push(novoAluno)
    }

    this.aprovarAluno = function (alunoAvaliado) {
        let aprovado = false;
        if (alunoAvaliado.calculaMedia() >= this.notaAprovacao && alunoAvaliado.qtdFaltas < this.faltasMaximas) {
            aprovado = true;
            return aprovado
        } else if (alunoAvaliado.calculaMedia() >= (this.notaDeAprocacao + (this.notaDeAprocacao * 0.1)) && alunoAvaliado.qtFaltas == this.faltasMaximas) {
            //caso o aluno tenha exatamente a quantidade de faltas permitida e nota +10%
            aprovado = true
            return aprovado
        } else {
            return aprovado
        }
    }
    //passo 6 - array de booleanos
    this.alunosAprovados = function () {
        let listaAlunosAprovados = []
        for (let i = 0; i < this.listaDeEstudantes.length; i++) {
            listaAlunosAprovados.push(this.aprovarAluno(this.listaDeEstudantes[i]))
        }
        console.log(listaAlunosAprovados)
    }
}
//Objetos Literais Alunos
const aluno1 = new Aluno("Mari", 3, [7, 8, 9]);
const aluno2 = new Aluno("Ana", 7, [9, 7, 8]);
const aluno3 = new Aluno("Caio", 7, [9, 8, 7]);
const aluno4 = new Aluno("Paulo", 7, [10, 9, 7]);

//Objetos Literais Cursos
const curso1 = new Curso("Front-End", 7, 4, [aluno1, aluno2, aluno3]);

//curso1.adicionarAluno(aluno4)
curso1.alunosAprovados()

