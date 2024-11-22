public class Animal {
    String nombre;
    String especie;
    int edad;
    String color;
    String habitat;  // Atributo general que no todas las subclases usan

    // Constructor de la superclase
    public Animal(String nombre, String especie, int edad, String color, String habitat) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.color = color;
        this.habitat = habitat;
    }

    // Método que puede ser común para todos los animales
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
