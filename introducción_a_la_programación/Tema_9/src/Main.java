public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.nombre = "Dante";
        cliente1.edad = 21;
        cliente1.telefono = 987654321;
        cliente1.credito = 5000;
        System.out.println(cliente1.nombre + " tiene " + cliente1.edad + " años y su teléfono es " + cliente1.telefono + ", con un crédito aprobado de " + cliente1.credito + " dólares.");

        Trabajador trabajador1 = new Trabajador();
        trabajador1.nombre = "Helen";
        trabajador1.edad = 33;
        trabajador1.telefono = 246813579;
        trabajador1.salario = 1025.9;
        System.out.println(trabajador1.nombre + " tiene " + trabajador1.edad + " años y su teléfono es " + trabajador1.telefono + ", trabaja en una fábrica industrial con un salario de "+ trabajador1.salario + " dólares.");
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}