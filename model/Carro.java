package model;
public class Carro {
    private String placa;
    private int numChassi;

    // Função construtor.
    public Carro(String placa, int numChassi){
        setPlaca(placa);
        this.numChassi = numChassi;
    }

    // Função construtor vazia alternativa.
    public Carro(){

    }

    public void acelerar(){

    }
    public boolean frear(){
        return false;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        if(placa != null && placa.length()==7 && placa.matches("[A-Z]{3}\\d{4}")){
            this.placa = placa;
        }else{
            this.placa = "ERRO!!!";
        }
    }

    public int getNumChassi() {
        return numChassi;
    }
    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }
}
