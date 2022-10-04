package PadroesdeProjeto.Singleton;

// Dupla:
//Alysson Gomes e Davy Leonardo.

public class Main {
    public static void main(String[] args) {
            Log n1 =  Log.getInstance();
            Log n2 =  Log.getInstance();


            n1.setLog ("teste");
            n2.setLog("teste2");


            System.out.println(Log.getLog());
        }
    }

