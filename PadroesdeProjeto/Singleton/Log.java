package PadroesdeProjeto.Singleton;

// Dupla:
//Alysson Gomes e Davy Leonardo.

public final class Log {
    private static Log log;
    private String historico = "";
    private Log() {

    }

    public synchronized static Log getInstance( ) {
        if (log == null) {
            log = new Log();
        }

        return log;
    }

    public void excluirLog(){
        log = null;
    }

    public void setLog(String str){
        historico+= str+"\n";
    }
    public static String getLog(){
        if(log != null) {
            return log.historico;
        }else{
            return "Log inexistente.";
        }
    }

}





