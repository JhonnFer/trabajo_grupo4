public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Rex", 5, "Labrador");
        Gato gato = new Gato("Whiskers", 3, "Siames");

        System.out.println(perro.nombre + " es un " + perro.especie + " de raza " + perro.raza);
        perro.hacerSonido();

        System.out.println(gato.nombre + " es un " + gato.especie + " de raza " + gato.raza);
        gato.hacerSonido();
    }
}
