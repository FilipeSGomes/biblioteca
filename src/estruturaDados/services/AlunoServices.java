package estruturaDados.services;

import estruturaDados.Main;

public class AlunoServices {
    public static Boolean servicesAluno() {
        String escolha = null;
        do {
        System.out.println(opcoesAluno());
        escolha = Main.sc.next();
            if (escolha.contains("1")) {
                LivroServices.consultarLivroPeloNome();
            } else if (escolha.contains("2")) {
                LivroServices.listarLivrosCadastrados();
            } else if (escolha.contains("3")) {
                LivroServices.consultarLivroPeloIsbn();
            }

        } while (!escolha.contains("4"));
        return Boolean.TRUE;

    }
    /**
     * 
     * @return Opcoes que podem ser escolhidas pelo Aluno
     */
    private static String opcoesAluno() {
        return "\n-----------------------------MENU--------------------------\n" + "Escolha uma opção: "
                + "\n1 - Consultar Um Livro pelo nome" + "\n2 - Listar Livros Cadastrados"
                + "\n3 - Consultar um livro pelo ISBN" + "\n4 - Voltar"
                + "\n-----------------------------------------------------------";
    }

}
