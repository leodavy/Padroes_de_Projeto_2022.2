package DesignPatterns.Proxy;

/*
*******************************
*            Dupla:           *
*        Davy Leonardo        *
*        Rafael Oliveira      *
*******************************
 */

public class main {
    public static void main(String[] args) {
        System.out.println("Hacker acessando");
        BancoUsuarios banco = new BancoProxy("Hacker", "1234");
        System.out.println(banco.getNumeroDeUsuarios());
        System.out.println(banco.getUsuariosConectados());

        System.out.println("\nAdministrador acessando");
        banco = new BancoProxy("admin", "admin");
        System.out.println(banco.getNumeroDeUsuarios());
        System.out.println(banco.getUsuariosConectados());
    }
}
