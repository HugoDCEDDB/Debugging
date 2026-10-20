public class Main {
    public static void main(String[] args) {
        double precioA = 80.0;
        double descuentoPorcentajeA = 25.0;

        double descuentoA = calcularDescuento(precioA, descuentoPorcentajeA);
        double precioFinalA = precioA - descuentoA;

        System.out.println("ARTICULO A");
        System.out.println("Precio original: " + precioA);
        System.out.println("Descuento: " + descuentoA);
        System.out.println("Precio final: " + precioFinalA);
        System.out.println();

        double precioB = 50.0;
        double descuentoPorcentajeB = 10.0;

        double descuentoB = calcularDescuento(precioB, descuentoPorcentajeB);
        double precioFinalB = precioB - descuentoB;

        System.out.println("ARTICULO B");
        System.out.println("Precio original: " + precioB);
        System.out.println("Descuento: " + descuentoB);
        System.out.println("Precio final: " + precioFinalB);
    }

    public static double calcularDescuento(double precio, double porcentaje) {
        return (precio * porcentaje) / 100.0;
    }
}
