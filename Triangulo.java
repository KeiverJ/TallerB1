public class Triangulo {
    private float base;
    private float altura;

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float area (){
        float area = (base*altura)/2; 
        return area;
    }

    public float perimetro (){
        float perimetro = base+base+base;
        return perimetro;
    }


    public String toString() {
        return "El area del triangulo es: " + area() + ", el perimetro del triangulo es: " + perimetro() + ", y la hipotenusa es: " + base;
    }

    
}
