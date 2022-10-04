package PadroesdeProjeto.Prototype;

public class Livro implements Cloneable{
    String titulo, autor, genero;


    Livroded livro = new Livroded();

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}
