package Alura.Aula03.Desafios.Animal;
import Alura.Aula03.Desafios.Animal.Modelos.Gato;
import Alura.Aula03.Desafios.Animal.Modelos.Cachorro;
import Alura.Aula03.Desafios.Animal.Modelos.Animal;
public class Principal {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Gato g1 = new Gato();
        Cachorro c1 = new Cachorro();
        a1.emitirSom();
        g1.emitirSom();
        g1.arranharMoveis();
        c1.emitirSom();
        c1.abanarRabo();
    }
}