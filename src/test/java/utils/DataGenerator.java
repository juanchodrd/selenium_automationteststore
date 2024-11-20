package utils;

import java.util.Random;
import java.util.UUID;

public class DataGenerator {

    public static String generateRandomFirstName() {
        String[] nombres = {"Juan", "Maria", "Luis", "Ana", "Carlos", "Lucia"};
        return nombres[new Random().nextInt(nombres.length)];
    }

    public static String generateRandomLastName() {
        String[] apellidos = {"Perez", "Gomez", "Fernandez", "Lopez", "Martinez"};
        return apellidos[new Random().nextInt(apellidos.length)];
    }

    public static String generateRandomEmail() {
        String uuid = UUID.randomUUID().toString().substring(0, 5); // Subcadena para hacerlo más corto
        return "user_" + uuid + "@test.com";
    }

    public static String generateRandomPhone() {
        Random random = new Random();
        int numero = random.nextInt(900000000) + 100000000;
        return String.valueOf(numero);
    }
}
