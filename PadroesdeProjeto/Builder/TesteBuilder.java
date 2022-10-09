package PadroesdeProjeto.Builder;

public class TesteBuilder {
    public static void main(String[] args) {

        Foguete foguete1 = new Foguete.FogueteBuilder().

                modelo("Modelo 1").
                motor("4 motores").
                tipocombustivel("Querosene").
                assentos(3).
                velmax(28000).
                criarFoguete();

        Foguete foguete2 = new Foguete.FogueteBuilder().

                modelo("Modelo 2").
                motor("10 motores").
                tipocombustivel("Querosene").
                assentos(10).
                velmax(30000).
                criarFoguete();

        System.out.println(foguete1 + "\n" + "***********" +
                " \n" +
                foguete2);
    }
}
