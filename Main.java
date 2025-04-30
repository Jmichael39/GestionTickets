//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Grupo 2I
// John Michael Posada
// Daniel Escolano Casanova

import java.util.ArrayList;
import java.util.Scanner;

// Encontrar el número más pequeño a la derecha
// Encontrar el número más grande a la izquierda
// Recorrer el array multiplicando cada posición por su valor correspondiente

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numeroTickets = scanner.nextInt();
        int valortotal = 0;

        String ticket = scanner.nextLine();
        int mayor = 0;
        int posicionActual = 0;

        for (int i = 0; i < ticket.length(); i++) {
            numeros.add(Integer.parseInt(String.valueOf(ticket.charAt(i))));
        }

        for (int i = 0; i < numeros.size(); i++) {
            posicionActual = i;
            if (posicionActual % 2 == 1) {
                valortotal += numeros.get(i) * 3;
            } else {
                valortotal += numeros.get(i) * 2;
            }
        }

        System.out.println(valortotal);
    }
}

