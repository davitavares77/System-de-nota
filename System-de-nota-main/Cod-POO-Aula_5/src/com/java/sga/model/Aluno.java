package com.java.sga.model;

public class Aluno {

    String nomeAluno;
    String turma;
    Double media1;
    Double media2;
    Double media3;
    Double media4;
    
    //Construtor
    public Aluno(String nomeAluno, String turma, Double media1, Double media2, Double media3, Double media4) {
        this.nomeAluno = nomeAluno;
        this.turma = turma;
        this.media1 = media1;
        this.media2 = media2;
        this.media3 = media3;
        this.media4 = media4;
    }

    //metodo
    public Double calcularMedia(){
        return ((media1 + media2 + media3 + media4)/4);
    }

    @Override
    //indicar que você está sobrescrevendo (ou redefinindo) um método de uma classe pai ou de uma interface.
    public String toString() {
        return "Aluno: " + nomeAluno +
            "\nTurma: " + turma +
            "\nNota 1: " + media1 +
            "\nNota 2: " + media2 +
            "\nNota 3: " + media3 +
            "\nNota 4: " + media4 +
            "\nMédia Final: " + calcularMedia();
        }
}



