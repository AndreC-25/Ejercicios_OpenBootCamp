public class Main {
    public static void main(String[] args) {
        var resultado = suma(13, 21, 17);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 0;

    public void AumentarPuertas() {
        this.puertas++;
    }
}