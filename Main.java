public class Main {
    public static void main(String[] args) {
        Generador generador = new Generador();
        Ordenador burbuja = new Ordenador();

        generador.generartxt();
        System.out.println("txt generado con exito ✔️");

        burbuja.ordenartxt();
        System.out.println("txt ordenado mediante burbuja con exito ✔️");

    }
}
