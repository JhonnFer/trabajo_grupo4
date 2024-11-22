public class Gato  extends  Animal{

    String raza;

    // Constructor de la subclase Gato
    public Gato(String nombre, int edad, String raza) {
        super(nombre, "Gato", edad, "Desconocido", "Doméstico"); // Llamada al constructor de la superclase
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla.");
    }
}
