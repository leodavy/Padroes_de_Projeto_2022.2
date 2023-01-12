package DesignPatterns.Proxy;

public class BancoUsuarios {

    private String listaDeAmigos;
    private Integer solicitacoes;

    public BancoUsuarios(String listaDeAmigos, Integer solicitacoes) {
        this.listaDeAmigos = "Ana, Leo, Spock, e mais 50";
        this.solicitacoes = 50;
    }

    public String getListaDeAmigos() {
        return new String("Amigos conectados: " + listaDeAmigos);
    }
    public Integer getSolicitacoes() {
        return  solicitacoes;
    }
}

