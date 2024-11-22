public class Perro extends Animal{

    String raza;

    // Constructor de la subclase Perro
    public Perro(String nombre, int edad, String raza) {
        super(nombre, "Perro", edad, "Desconocido", "Doméstico"); // Llamada al constructor de la superclase
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}
