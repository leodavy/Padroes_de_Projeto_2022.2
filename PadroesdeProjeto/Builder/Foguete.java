package PadroesdeProjeto.Builder;

public class Foguete {

    private final String modelo, motor, tipocombustivel;
    private final Integer assentos, velmax;


    private Foguete(String modelo, String motor, String tipocombustivel, Integer assentos, Integer velmax) {
        this.modelo = modelo;
        this.motor = motor;
        this.tipocombustivel = tipocombustivel;
        this.assentos = assentos;
        this.velmax = velmax;
    }
    public static class FogueteBuilder{

        private String modelo, motor, tipocombustivel;
        private Integer assentos, velmax;


    public FogueteBuilder(){

    }
    public FogueteBuilder modelo(String modelo){
        this.modelo = modelo;
        return this;
    }
    public FogueteBuilder motor(String motor){
        this.motor = motor;
        return this;

    }
    public FogueteBuilder tipocombustivel(String tipocombustivel){
        this.tipocombustivel = tipocombustivel;
        return this;

    }
    public FogueteBuilder assentos(Integer assentos){
        this.assentos = assentos;
        return this;

    }
    public FogueteBuilder velmax(Integer velmax){
        this.velmax = velmax;
        return this;

    }
    public Foguete criarFoguete(){
        return new Foguete(modelo,motor,tipocombustivel,assentos,velmax);

        }

    }

    @Override
    public String toString() {
        return "Foguete: " + "\n" +
                "Modelo: " + modelo + '\n' +
                "Motor: " + motor + '\n' +
                "Combustível: " + tipocombustivel + '\n' +
                "Assentos: " + assentos + "\n" +
                "Velocidade máxima: " + velmax + "Km/h";
    }
}
