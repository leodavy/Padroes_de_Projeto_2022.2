package DesignPatterns.Proxy;

import java.util.Objects;

public class BancoUsuarios implements IBancoUsuarios {
    public BancoUsuarios() {}

    @Override
    public void exibirInformacoes() {
        System.out.println("Bem vindo administrador\n" + getUsuariosConectados() + "\n" + getNumeroDeUsuarios());
    }

    public String getUsuariosConectados(){
        return "Os usuários atualmente logados são: Marcos Aurélio, Dionisio, Socrátes";
    }

    public String getNumeroDeUsuarios(){
        return "Existem 4223 cadastrados usuários no sistema";
    }
}

