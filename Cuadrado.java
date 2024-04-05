public class Cuadrado {
    private float lado;

    public Cuadrado() {
        
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float area (){
        float area = this.lado*this.lado;
        return area;
    }

    public float perimetro (){
        float perimetro = this.lado*4;
        return perimetro;
    }


    public String toString() {
        return "El area del cuadrado es: " + area() + ", el perimetro del cuadrado es: " + perimetro();
    }

    
}
