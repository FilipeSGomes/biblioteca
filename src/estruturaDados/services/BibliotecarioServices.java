package estruturaDados.services;

import estruturaDados.Main;

public class BibliotecarioServices {

    public static Boolean servicesBibliotecario() {
        System.out.println(opcoesBibliotecario());
        
        
        String escolha = Main.sc.next();
        if(escolha.equals("13")){
            return (Main.opcaoVoltar = Boolean.TRUE);
        }
        
        return (Main.opcaoVoltar = Boolean.FALSE);
    }

    /**
     * 
     * @return Opcoes que podem ser escolhidas pelo Bibliotecario
     */
    private static String opcoesBibliotecario() {
        return "\n-----------------------------MENU--------------------------\n"
                + "Escolha uma opção: \n1  - Cadastrar Aluno" + "\n2  - Consultar Aluno Cadastrado"
                + "\n3  - Cadastrar Livro" + "\n4  - Consultar Livro Cadastrado" + "\n5  - Listar Alunos Cadastrados"
                + "\n6  - Listar Livros Cadastrados" + "\n7  - Remover Aluno Cadastrado"
                + "\n8  - Remover Livro Cadastrado" + "\n9  - Criar Emprestimo de Livro"
                + "\n10 - Listar Emprestimos Vencidos" + "\n11 - Listar Alunos que Emprestaram um Determinado Livro"
                + "\n12 - Remover Emprestimo"
                + "\n13 - Voltar" + "\n-----------------------------------------------------------";
    }

}
