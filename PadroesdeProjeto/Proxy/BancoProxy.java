package DesignPatterns.Proxy;



public class BancoProxy extends BancoUsuarios implements IBancoUsuarios {
    protected String usuario, senha;
    protected BancoUsuarios auth = null;
    public BancoProxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
        this.auth = new BancoUsuarios();
    }

    @Override
    public void exibirInformacoes() {
        if(temPermissaoDeAcesso()){
            auth.exibirInformacoes();
        }
    }

    @Override
    public String getUsuariosConectados(){
        if(temPermissaoDeAcesso()){
            return auth.getUsuariosConectados();
        }
        return null;
    }

    @Override
    public String getNumeroDeUsuarios(){
        if(temPermissaoDeAcesso()){
            return auth.getNumeroDeUsuarios();
        }
        return null;
    }

    private boolean temPermissaoDeAcesso(){
        return usuario.equals("admin") && senha.equals("admin");
    }
}
