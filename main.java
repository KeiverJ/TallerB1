import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(2005, 10, 02);
        Persona p = new Persona (fechaNacimiento);
        Cuadrado cuadrado = new Cuadrado (25);
        Circulo circulo = new Circulo(10);
        Triangulo triangulo = new Triangulo (10, 20);
        System.out.println(p.toString());
        System.out.println(cuadrado.toString());
        System.out.println(circulo.toString());
        System.out.println(triangulo.toString());
    }
}
