package aula1;

import java.util.Locale;

public class Main {

      /* linguagem compilada e interpretada: o programa pode ser
     compilado e executado em qualquer SO desde que tenha o
     interpretador */

    /*operações aritméticas: uma operação só pode ser realizada com variaveis do mesmo tipo e o
     resultado mantem o tipo associado*/

    /*Método mains é o método principal e necessário para a execução do projeto
     * a JVM vai procurar esse método*/

    //CTRL S - SALVAR
    //SHIFT ALT I - INDENTAR

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        System.out.println("Hello Word. Sejam bem vindos! Esse é o seu primeiro programa");

        String nome = "diana";
        int dia = 01; //primitivo
        Integer mes = 12; //WRAPPER

        Integer idade;

        //atalho sout
        System.out.println(nome.toUpperCase());


    }

}
