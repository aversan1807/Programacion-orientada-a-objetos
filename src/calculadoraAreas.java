public class calculadoraAreas {

    class CalculadoraAreas {
        void imprimirArea(double r) {
            double area = Math.PI * r * r;
            System.out.println(
                    "El área del círculo de radio " + r +
                            " es " + area
            );
        }
        void imprimirArea(double base, double altura) {
            double area = base * altura;
            System.out.println(
                    "El área del rectángulo de base " + base +
                            " y altura " + altura + " es " + area
            );
        }
        void imprimirArea(double base1, double base2,
                          double altura) {
            double area = (base1 + base2) / 2 * altura;
            System.out.println(
                    "El área del trapecio de bases " + base1 +
                            " y " + base2 + " con altura " + altura +
                            " es " + area
            );
        }
    }

    // src/PrincipalCalculadoraAreas.java
    public class PrincipalCalculadoraAreas {
        public void main(String[] args) {
            CalculadoraAreas calc = new CalculadoraAreas();
            calc.imprimirArea(10);
            calc.imprimirArea(10, 5);

        }
    }
}
