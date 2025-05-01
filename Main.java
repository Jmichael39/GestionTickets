import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cada dígito en una posición impar se multiplica por 3 y se le suma el menor dígito a su derecha
        // Cada dígito en una posición par se multiplica por 2 y se le suma el mayor dígito a su izquierda
        // 7214
        // (7*3+1) + (2*2+7) + (1*3+4) + (4*2+7) = 55
        /* Entrada de ejemplo:
               3
               7214
               10
               1001

            Salida de ejemplo:
                55
                4
                8
         */

        Scanner sc = new Scanner(System.in);
        int numeroEntradas = Integer.parseInt(sc.nextLine());
        String[] numeros = new String[numeroEntradas];

        for (int i = 0; i < numeroEntradas; i++) {
            numeros[i] = sc.nextLine();
        }

        sc.close();

        for (String numero : numeros) {
            int total = 0;

            for (int i = 0; i < numero.length(); i++) {
                int num = Integer.parseInt(String.valueOf(numero.charAt(i)));
                if (i % 2 == 0) {
                    // Cada dígito en una posición impar se multiplica por 3 y se le suma el menor dígito a su derecha
                    total += (num * 3) + menorDigitoDerecha(numero, i);
                } else {
                    // Cada dígito en una posición par se multiplica por 2 y se le suma el mayor dígito a su izquierda
                    total += (num * 2 + mayorDigitoIzquierda(numero, i));
                }
            }

            System.out.println(total);
        }
    }

    // Recibe una posición en el array y busca el menor dígito a partir de dicha posición
    public static int menorDigitoDerecha(String numero, int position) {
        int menor = 9;

        for (int i = position + 1; i < numero.length(); i++) {
            int actual = Integer.parseInt(String.valueOf(numero.charAt(i)));

            if (actual < menor) {
                menor = actual;
            }
        }

        return menor;
    }

    // Recibe una posición en el array y busca el mayor dígito hasta la posición
    public static int mayorDigitoIzquierda(String numero, int position) {
        int mayor = 0;

        for (int i = 0; i < position; i++) {
            int actual = Integer.parseInt(String.valueOf(numero.charAt(i)));

            if (actual > mayor) {
                mayor = actual;
            }
        }

        return mayor;
    }
}
