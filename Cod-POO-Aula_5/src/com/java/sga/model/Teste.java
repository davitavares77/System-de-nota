package com.java.sga.model;

//testando models
public class Teste {
private static void testarModelos() {
    System.out.println("--- Testando Modelos ---")

    //cadastrado de alunos
    System.out.println("Cadastro")
    Aluno aluno1 = newAluno("Vitor Lima","2A", "4.0", "6.0", "6,5", "9.0");
    System.out.println("CADASTRO:" + aluno1);

    //GETTERS E SETTERS
    System.out.println("Aluno:" + aluno1.getNomeAluno());
    double resultado = aluno1.getMedia1() + aluno1.getMedia2() + aluno1.getMedia3() + aluno1.getMedia4();
    double media = resultado / 4;
    if (media >= 6) {
        System.out.printl("Aprovado");}
    }
}
