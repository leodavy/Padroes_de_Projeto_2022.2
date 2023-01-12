package DesignPatterns.Proxy;



public class BancoProxy extends BancoUsuarios{


    protected String usuario, senha;

    public BancoProxy(String listaDeAmigos, Integer solicitacoes) {
        super(listaDeAmigos, solicitacoes);
    }


    @Override
    public String getListaDeAmigos() {
        if (temPermissaoDeAcesso()){
            return super.getListaDeAmigos();
        }
        return "Sem permissão";
    }

    @Override
    public Integer getSolicitacoes() {
        if(temPermissaoDeAcesso()) {
            return super.getSolicitacoes();
        }
        return 0;
    }

    private boolean temPermissaoDeAcesso(){
        return usuario == "user" && senha == " 123";

    }
}





