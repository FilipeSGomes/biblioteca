package estruturaDados.services;

import java.util.List;
import java.util.stream.Collectors;

import estruturaDados.Main;
import estruturaDados.domain.Livro;

public class LivroServices {

    public static void listarLivrosCadastrados() {

    };

    public static void consultarLivroPeloIsbn() {
        System.out.println("\nDigite o número do ISBN: ");
        String isbn = Main.sc.next();
        imprimeLivro(Main.livros.stream().filter(l -> l.getIsbn() == Integer.parseInt(isbn)).collect(Collectors.toList()));
    }

    public static void consultarLivroPeloNome() {
        System.out.println("\nDigite o nome do seu Livro que iremos" + " procurar todos na nossa lista: ");
        String nome = Main.sc.next();
        imprimeLivro(Main.livros.stream().filter(l -> l.getTitulo().toLowerCase().contains(nome.toLowerCase()))
                .collect(Collectors.toList()));
    }

    private static void imprimeLivro(List<Livro> livros) {
        livros.forEach(l -> {
            System.out.println(l.toString());
        });
    }
}