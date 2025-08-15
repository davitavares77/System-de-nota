package com.java.sga.model;

//validaçoes privadas, pois são particulares
public class Aluno {
    private String nome;
    private String matricula;
    private float nota1;
    private float nota2;
    private float nota3;
    private float media;
    private String situacao;

//construtor vazio para facilitar a leitura do codigo
    public Aluno() {
    }

//pega a media e ja calcula a situação do aluno
    public void calcularMedia() {
        this.media = (nota1 + nota2 + .nota3) / 3;

        if (this.media < 3) {
            this.situacao = "Reprovado";
        } else if (this.media >= 7) {
            this.situacao = "Aprovado";
        } else {
            this.situacao = "Recuperacao";
        }

//mostra o nome e a media 
        System.out.println("Aluno: " + this.nome + " - " + this.situacao);
    }

//busca o aluno recebendo como paremetro e verivica se a matricula é a certa
    public boolean buscarAluno(String matricula) {
        if (this.matricula.equals(matricula)) {
            return true;
        }
        return false;
    }

//altera a nota como string e como parametro o codigo da nota e o valor
    public String alterarNota(int codNota, float valorNota) {

//se o codigo for 1, muda a  nota1 e assim por diante 
        if (codNota == 1) {
            setNotas(valorNota, nota2, nota3);
        }
        if (codNota == 2) {
            setNotas(nota1, valorNota, nota3);
        }
        if (codNota == 3) {
            setNotas(nota1, nota2, valorNota);
        }
   
//e retorna com ela sendo alterada junto com o codigo 
        return "Nota " + codNota + " alterada com sucesso!";
    }
    
// Getter e Setter do nome
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Getter da matrícula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void setNotas(float nota1, float nota2, float nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public float getNota1() {
        return nota1;
    }
    
    public float getNota2() {
        return nota2;
    }
    
    public float getNota3() {
        return nota3;
    }
    
    public float getMedia() {
        return media;
    }
    
    public void setMedia(float media) {
        this.media = media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    public String getSituacao() {
        return situacao;
    }
    
//toString pega todos os dados do aluno
    @Override
    public String toString() {
        System.out.println("Dados de:" + nome);
        return "\nNome: " + nome + "\nMatricula: " + matricula + "\nMedia: " + media + "\nSituacao: " + situacao + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nNota 3: " + nota3;
    }
    
}
