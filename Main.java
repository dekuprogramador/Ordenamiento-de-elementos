public class Main {
    public static void main(String[] args) {
        Generador generador = new Generador();
        Ordenador burbuja = new Ordenador();

        System.out.println("Se empieza a generar el txt...");
        generador.generartxt();
        System.out.println("txt generado con exito ✔️");

        System.out.println("Se empieza a ordenar el txt...");
        burbuja.ordenartxt();
        System.out.println("txt ordenado mediante burbuja con exito ✔️");

    }
}
