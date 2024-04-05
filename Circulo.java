public class Circulo {
    private float radio;

    public Circulo() {
        
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float area (){
        float area = (float)Math.PI * (float)Math.pow(radio, 2);
        return area;
    }

    public float perimetro (){
        float perimetro = 2*(float)Math.PI * radio;
        return perimetro;
    }

    public String toString() {
        return "El area del circulo es: " + area() + ", el perimetro de circulo es: " + perimetro();
    }

    
}
