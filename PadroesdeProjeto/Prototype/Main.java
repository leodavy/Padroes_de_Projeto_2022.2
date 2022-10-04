package PadroesdeProjeto.Prototype;

/*
        Dupla: Alysson Gomes e Davy Leonardo

 */

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Livro livro1 = new Livro();

            livro1.titulo = "Título: Encontro Marcado";
            livro1.genero = "Gênero: Romance";
            livro1.autor = "Autor: Fernando Sabino";
            livro1.livro.dedicatoria = "De Fernando Sabino, para Davy <3";

        Livro livro2 = new Livro();

        livro2.titulo = " What we talk about, when we talk about love ";
        livro2.livro.dedicatoria = " De Davy para Alysson xD";


        System.out.println(livro1.titulo + " " + livro1.genero + " " + " \n" +
                            livro1.autor + livro1.livro.dedicatoria + "\n" +

                livro2.titulo + " " + livro2.genero + " " + " \n" +
                livro2.autor + livro2.livro.dedicatoria + "\n" );
        
    }
}



