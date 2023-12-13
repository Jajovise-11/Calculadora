import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operacion operacion;
        double a, b;
        int opcion;

        do {
            System.out.println("Introduce el primer número:");
            a = scanner.nextDouble();

            System.out.println("Introduce el segundo número:");
            b = scanner.nextDouble();

            operacion = new Operacion(a, b);

            System.out.println("Elige la operación a realizar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + operacion.suma());
                    break;
                case 2:
                    System.out.println("Resultado: " + operacion.resta());
                    break;
                case 3:
                    System.out.println("Resultado: " + operacion.multiplicacion());
                    break;
                case 4:
                    System.out.println("Resultado: " + operacion.division());
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}

class Operacion {
    private double a;
    private double b;

    public Operacion(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double suma() {
        return a + b;
    }

    public double resta() {
        return a - b;
    }

    public double multiplicacion() {
        return a * b;
    }

    public double division() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero.");
            return 0;
        }
    }
}
