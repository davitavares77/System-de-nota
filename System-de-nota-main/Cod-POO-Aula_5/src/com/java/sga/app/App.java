package com.java.sga.app;

import com.java.sga.model.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        int option;

//menu principal com as operações que o usuario desejar 
        do {
            System.out.println("----- MENU PRINCIPAL -----");
            System.out.println("1 - CADASTRAR ALUNOS");
            System.out.println("2 - CADASTRAR NOTAS");
            System.out.println("3 - CADASTRAR MEDIAS");
            System.out.println("4 - INFORMAR SITUACOES");
            System.out.println("5 - INFORMAR DADOS DE UM ALUNO");
            System.out.println("6 - ALTERAR NOTA");
            System.out.println("7 - SAIR");
            System.out.print("Qual operacao deseja realizar? ");
            option = sc.nextInt();
            sc.nextLine();
        }

//esses são os casos baseado no que o usuario escolher no menu
            switch (option) {
                case 1:
                    System.out.println( "\nAluno 1");
                    System.out.println( "Nome: ");
                    a1.setNome(sc.nextLine());
                    System.out.println( "Matricula: ");
                    a1.setMatricula(sc.nextLine());
        
                    System.out.println( "\nAluno 2");
                    System.out.println( "Nome: ");
                    a2.setNome(sc.nextLine());
                    System.out.println( "Matricula: ");
                    a2.setMatricula(sc.nextLine());
            
                    System.out.println( "\nAluno 3");
                    System.out.println( "Nome: ");
                    a3.setNome(sc.nextLine());
                    System.out.println( "Matricula: ");
                    a3.setMatricula(sc.nextLine());
            
                    break;
            
                case 2:
                    float nota1, nota2, nota3;
            
                    System.out.println("\n"+a1.getNome());
                    System.out.println( "Nota 1:");
                    nota1 = sc.nextFloat();
                    float nota1, nota2, nota3;

                    System.out.println("\n" + a1.getNome());
                    System.out.println("Nota 1:");
                    nota1 = sc.nextFloat();
                    System.out.println("Nota 2:");
                    nota2 = sc.nextFloat();
                    System.out.println("Nota 3:");
                    nota3 = sc.nextFloat();

                    a1.setNotas(nota1, nota2, nota3);

                    System.out.println("\n" + a2.getNome());
                    System.out.println("Nota 1:");
                    nota1 = sc.nextFloat();
                    System.out.println("Nota 2:");
                    nota2 = sc.nextFloat();
                    System.out.println("Nota 3:");
                    nota3 = sc.nextFloat();

                    a2.setNotas(nota1, nota2, nota3);

                    System.out.println("\n" + a3.getNome());
                    System.out.println("Nota 1:");
                    nota1 = sc.nextFloat();
                    System.out.println("Nota 2:");
                    nota2 = sc.nextFloat();
                    System.out.println("Nota 3:");
                    nota3 = sc.nextFloat();

                    a3.setNotas(nota1, nota2, nota3);
                    break;

                    case 3:
                        a1.calcularMedia();
                        a2.calcularMedia();
                        a3.calcularMedia();
                    break;

                    case 4:
                        System.out.println("Situacao de " + a1.getNome() + ": ");
                        System.out.println(a1.getSituacao());

                        System.out.println("Situacao de " + a2.getNome() + ": ");
                        System.out.println(a2.getSituacao());

                        System.out.println("Situacao de " + a3.getNome() + ": ");
                        System.out.println(a3.getSituacao());
                    break;

                    case 5:
                        System.out.println("Matricula: ");
                        String matricula = sc.nextLine();

                        if (a1.buscarAluno(matricula)) {
                            System.out.println(a1.toString());
                        } else if (a2.buscarAluno(matricula)) {
                            System.out.println(a2.toString());
                        } else if (a3.buscarAluno(matricula)) {
                            System.out.println(a3.toString());
                        } else {
                            System.out.println("Essa matricula nn esta cadastrada!");
                        }
                    break;

                    case 6:
                        System.out.println("Matricula: ");
                        String matricula = sc.nextLine();

                        Float nota;
                        int codNota;

                        if (a1.buscarAluno(matricula)) {
                            System.out.println("Qual nota deseja alterar?");
                            codNota = sc.nextInt();
                            System.out.println("Quer substituir a nota " + codNota + " por qual valor?");
                            nota = sc.nextFloat();
                            a1.alterarNota(codNota, nota);
                        } else if (a2.buscarAluno(matricula)) {
                            System.out.println("Qual nota deseja alterar?");
                            codNota = sc.nextInt();
                            System.out.println("Quer substituir a nota " + codNota + " por qual valor?");
                            nota = sc.nextFloat();
                            a2.alterarNota(codNota, nota);
                        } else if (a3.buscarAluno(matricula)) {
                            System.out.println("Qual nota deseja alterar?");
                            codNota = sc.nextInt();
                            System.out.println("Quer substituir a nota " + codNota + " por qual valor?");
                            nota = sc.nextFloat();
                            a3.alterarNota(codNota, nota);
                        } else {
                            System.out.println("Essa matricula nn esta cadastrada!");
                        }
                    break;

                    default:
                        break;
                    }

                    } while (option != 7);

                    System.out.println("Finalizando programa ...");

                }
