import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private LocalDate fechaNacimiento;

    public Persona() {

    }

    public Persona(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
        

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String diasVida () {
        LocalDate fechaActual = LocalDate.now();
        Period vida = Period.between(fechaNacimiento, fechaActual);

        int años = vida.getYears();
        int meses = vida.getMonths();
        int dias = vida.getDays();

        return "Tienes " + años + " años, " + meses + " meses y " + dias + " dias de vida.";
    }

    
    public String toString() {
        return "Persona [Dias de vida = " + diasVida() + "]";
    }
}
