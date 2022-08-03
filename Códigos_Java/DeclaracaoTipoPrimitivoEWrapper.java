package aula1;

public class DeclaracaoTipoPrimitivoEWrapper {


    /*Diferença de tipo primitivo para Wrapper:
     * - Tipo Primitivo (Inicial Minúscula) serve apenas para armazenar valor.
     *     Dica: se colocar um ponto (.) após uma variável primitiva perceberá
     *     que não tem nenhuma sugestão de método ou função.
     * - Wrapper (Inicial Maiúscula): é uma classe que engloba o tipo primitivo.
     *    Ela permite além de armazenar o valor realizar operações já programadas,
     *    permite receber valor null*/


     /*Os tipos de dados PRIMITIVOS apenas nos permitirem armazenar um valor.
     Por exemplo, int, float, double e char. */

    /*Além dos tipos primitivos, temos as classes próprias do Java WRAPPERS,
    que é um elemento que, além de armazenar um valor, nos permite realizar
    certas OPERAÇÕES que já estão programadas. Chamamos esses métodos
    de operações. Por exemplo, String é uma classe, portanto, é
    inicializada em maiúsculas. */

    //Lembrete: todas as classes WRAPPERS englobam dentro de si os seus respectivos tipos primitivos

    //Dica: a uníca exceção para essa regra é String sempre será WRAPPER. As demais devem ser usadas conforme sua necessidade no desenvolvimento

    //Consultar no playground os demais tipos de dados e exemplos com WRAPPERS


    String nome; //WRAPPER: aceita qualquer tipo de texto, recebe um conjunto de caracteres;
    Integer cpf; //WRAPPER: aceita números inteiros, null e possibilita funções já definidas;
    Float peso; //WRAPPER: aceita números decimais, null e possibilita funções já definidas;
    Double resultadoPi;  //WRAPPER: aceita números decimais, null e possibilita funções já definidas, maior que float;
    Boolean maiorIdade;  //WRAPPER: considera verdadeiro ou falso e possibilita funções já definidas;

    char sexo = 'M'; //PRIMITIVO: aceita somente um único carcatere, somente armazena valor;
    int mes = 12; //PRIMITIVO: aceita somente números inteiros, somente armazena valor;
    float valorAgua = 109.99F; //PRIMITIVO: aceita números com casas decimais, somente armazena valor;
    double saldoBancario = 1256985236.25;  //PRIMITIVO: aceita números com casas decimais, somente armazena valor. Maior que float;
    boolean eDia = true; //PRIMITIVO: considera verdadeiro ou false, somente armazena valor

}
