package DesignPatterns.Proxy;

/*
*************************************************************************
*                                        Dupla:
*                                     Davy Leonardo
*                                     Rafael Oliveira
**************************************************************************
 */

public class main {
    public static void main(String[] args) {

        System.out.println("Hacker acessando");
        BancoUsuarios banco = new BancoProxy("Hacker" , "1234");
        System.out.println(banco.getListaDeAmigos());
        System.out.println(banco.getSolicitacoes());

        System.out.println("\nEntrando na Rede");
        banco = new BancoProxy("user", " 123");
        System.out.println(banco.getListaDeAmigos());
        System.out.println(banco.getSolicitacoes());

    }
}
