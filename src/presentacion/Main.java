package presentacion;

import dominio.Videojuego2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proyecto Java preparado.");

        ArrayList<Videojuego2> miLudoteca1 = new ArrayList<>();

        miLudoteca1.add(new Videojuego2("The Legend of Zelda: Breath of the Wild", "Nintendo Switch", 97, 120));
        miLudoteca1.add(new Videojuego2("The Witcher 3: Wild Hunt", "PC", 93, 200));
        miLudoteca1.add(new Videojuego2("Red Dead Redemption 2", "PlayStation 4", 96, 150));
        miLudoteca1.add(new Videojuego2("Super Mario Odyssey", "Nintendo Switch", 97, 80));
        miLudoteca1.add(new Videojuego2("God of War", "PlayStation 4", 94, 100));

        System.out.println("Lista de videojuegos:");
        for (Videojuego2 videojuego : miLudoteca1) {
            System.out.println(videojuego);
        }
        
        System.out.println("\nNúmero total de juegos en la ludoteca: " + miLudoteca1.size());
    }
}