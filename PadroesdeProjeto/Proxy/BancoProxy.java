package DesignPatterns.Proxy;

public class BancoProxy extends BancoUsuarios{

    protected String usuario, senha;

    public BancoProxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    @Override
    public String getNumeroDeUsuarios() {
        if(temPermissaoDeAcesso()) {
            return super.getNumeroDeUsuarios();
        }
        return null;
    }

    @Override
    public String getUsuariosConectados() {
        return super.getUsuariosConectados();
    }

    private boolean temPermissaoDeAcesso() {
        return usuario == "admin" && senha == "admin";
    }



}
