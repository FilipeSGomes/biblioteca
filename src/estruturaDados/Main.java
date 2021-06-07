package estruturaDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import estruturaDados.domain.Aluno;
import estruturaDados.domain.Livro;
import estruturaDados.domain.Perfil;
import estruturaDados.services.AlunoServices;
import estruturaDados.services.BibliotecarioServices;

public class Main {

    public static List<Aluno> alunos = new ArrayList<Aluno>();
    public static List<Livro> livros = new ArrayList<Livro>();
    public static Scanner sc;
    public static Boolean opcaoVoltar = true;

    public static void main(String[] args) {
        
        Livro livro1 = new Livro(123, "Harry potter e a Pedra Filosofal", "Tempo", 2010);
        Livro livro2 = new Livro(124, "Cronicas de Narnia o Aprendiz do Mago", "Tempo", 2010);
        
        livros.add(livro1);
        livros.add(livro2);

        while (opcaoVoltar = Boolean.TRUE) {
            sc = new Scanner(System.in);
            System.out.println(saudacoes());
            String opcaoPerfil = sc.next();
            if (opcaoPerfil.contains("3")) {
                opcaoVoltar = Boolean.FALSE;
                break;
            } else {
                Perfil perfil = opcaoPerfil.contains("1") ? Perfil.BIBLIOTECARIO : Perfil.ALUNO;
                System.out.println("Perfil escolhido: " + perfil);

                if (perfil.name().toUpperCase().contains("ALUNO")) {
                    opcaoVoltar = AlunoServices.servicesAluno();
                } else {
                    opcaoVoltar = BibliotecarioServices.servicesBibliotecario();
                }
            }
        }
    }

    /**
     * 
     * @return Saudacoes para usuario
     */
    public static String saudacoes() {

        return "\n-----------------------------SAUDAÇÔES--------------------------\n"
                + "Seja Bem Vindo Ao Sistema da Biblioteca\n" + "Escolha o perfil de acesso\n" + "\n1 - Bibliotecário"
                + "\n2 - Aluno" + "\n3 - Sair" + "\n-----------------------------------------------------------"
                + "\nObs.: Digitando qualquer outro caractere será considerado com perfil Aluno";

    }

}
