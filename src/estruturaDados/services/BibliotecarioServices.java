package estruturaDados.services;

import estruturaDados.Main;

public class BibliotecarioServices {

    public static Boolean servicesBibliotecario() {
        String escolha;
        do {
            System.out.println(opcoesBibliotecario());
            escolha = Main.sc.next();
            if (escolha.contains("1")) {
                System.out.println("Função em desenvolvimento");
            } else if (escolha.contains("2")) {
                System.out.println("Função em desenvolvimento");
            } else if (escolha.contains("3")) {
                System.out.println("Função em desenvolvimento");
            }

            else if (escolha.contains("4")) {
                LivroServices.consultarLivroPeloNome();
            } else if (escolha.contains("5")) {
                LivroServices.consultarLivroPeloIsbn();
            } else if (escolha.contains("7")) {
                LivroServices.listarLivrosCadastrados();
            } else if (escolha.contains("6")) {
                System.out.println("Função em desenvolvimento");
            } else if (escolha.contains("8")) {
                System.out.println("Função em desenvolvimento");
            } else if (escolha.contains("9")) {
                System.out.println("Função em desenvolvimento");
            }

            else if (escolha.contains("10")) {
                System.out.println("Função em desenvolvimento");
            } else if (escolha.contains("11")) {
                System.out.println("Função em desenvolvimento");
            } else if (escolha.contains("12")) {
                System.out.println("Função em desenvolvimento");
            } else if (escolha.contains("13")) {
                System.out.println("Função em desenvolvimento");
            }
        } while (!escolha.equals("14"));
        return Boolean.TRUE;
    }

    /**
     * 
     * @return Opcoes que podem ser escolhidas pelo Bibliotecario
     */
    private static String opcoesBibliotecario() {
        return "\n-----------------------------MENU--------------------------\n" + "Escolha uma opção: "
                + "\n1  - Cadastrar Aluno" + "\n2  - Consultar Aluno Cadastrado" + "\n3  - Cadastrar Livro"
                + "\n4  - Consultar Livro Cadastrado pelo nome" + "\n5  - Consultar Livro Cadastrado pelo ISBN"
                + "\n6  - Listar Alunos Cadastrados" + "\n7  - Listar Livros Cadastrados"
                + "\n8  - Remover Aluno Cadastrado" + "\n8  - Remover Livro Cadastrado"
                + "\n10  - Criar Emprestimo de Livro" + "\n11 - Listar Emprestimos Vencidos"
                + "\n12 - Listar Alunos que Emprestaram um Determinado Livro" + "\n13 - Remover Emprestimo"
                + "\n14 - Voltar" + "\n-----------------------------------------------------------";
    }

}
