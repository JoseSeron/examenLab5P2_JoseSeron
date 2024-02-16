package examenlab5p2_joseseron;

import java.util.Date;

/**
 *
 * @author joser
 */
public class Empleado extends Usuario {

    String carrera, puesto, aniosEmpleados;

    public Empleado() {
        super();
    }

    public Empleado(String carrera, String puesto, String aniosEmpleados) {
        this.carrera = carrera;
        this.puesto = puesto;
        this.aniosEmpleados = aniosEmpleados;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getAniosEmpleados() {
        return aniosEmpleados;
    }

    public void setAniosEmpleados(String aniosEmpleados) {
        this.aniosEmpleados = aniosEmpleados;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "carrera=" + carrera + ", puesto=" + puesto + ", aniosEmpleados=" + aniosEmpleados + '}';
    }

}
