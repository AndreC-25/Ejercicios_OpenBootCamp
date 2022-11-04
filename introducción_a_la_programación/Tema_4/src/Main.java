public class Main {
    public static void main(String[] args) {
        //If
        If condicionalIF = new If();
        condicionalIF.funcionIf();

        //While
        While bucleWhile = new While();
        bucleWhile.Aumentar();

        //DO While
        doWhile bucleDoWhile = new doWhile();
        bucleDoWhile.Aumento2();

        //For
        For bucleFor = new For();
        bucleFor.AumentoFor();

        //Switch
        Switch bucleSwitch = new Switch();
        bucleSwitch.bucleSwitch();
    }
}

class If {
    public int numeroIf = 13;
    public void funcionIf() {
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es igual 0");
        }
    }
}

class While {
    public int numeroWhile = -2;
    public void Aumentar() {
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }
}

class doWhile {
    public int numeroDoWhile = 7;

    public void Aumento2() {
        do {
            System.out.println( numeroDoWhile);
            numeroDoWhile++;
        }
        while (numeroDoWhile < 3);
    }
}

class For {
    public int numeroFor = 0;

    public void AumentoFor() {
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }
}

class Switch {
    public String estacion = "Verano";

    public void bucleSwitch() {
        switch(estacion) {
            case "Verano":
            case "Invierno":
            case "Otoño":
            case "Primavera":
                System.out.println(estacion);
                break;
            default:
                System.out.println("No es una estación del año");
                break;
        }
    }
}
