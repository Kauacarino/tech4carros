import model.Carro;

public class App {
    public static void main(String[] args) {
        Carro gol = new Carro("ASB4234", 1234); // <- Construtor

        //Método Alternativo (Encapsulamento):
        //gol.setPlaca("ASB4234");
        //gol.setNumChassi(1234);
        
        // Print de formato. 
        System.out.printf("Carro contém a placa %s e o número de chassi %d", gol.getPlaca(), gol.getNumChassi());
        // %s é String. %d é int. Os gets após definem o %s e %d em ordem.
    }
}