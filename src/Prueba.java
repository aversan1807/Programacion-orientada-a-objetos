public class Prueba {

    public static void main(String[] args) {

        Rectangulo r = new Rectangulo();
        r.base=10;
        r.altura=5;

        System.out.println(r);

        System.out.println("El rectangulo tiene: base " +r.base+ " y altura " + r.altura);

        System.out.println("El area es: " + r.calcularArea());
        System.out.println("El perimetro es: " + r.calcularPerimetro());

        Persona p = new Persona();

        p.nombre="Adrian";

        p.apellidos="Verdu Sanchez";

        p.dni="26524953L";


    }
}
