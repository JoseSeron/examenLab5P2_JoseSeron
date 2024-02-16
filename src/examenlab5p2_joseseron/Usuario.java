package examenlab5p2_joseseron;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author joser
 */
public class Usuario {

    String nombre, apellido, password, departamento, sexo, numeroIdentidad;
    Date fechaNacimiento;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String password, String departamento, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.departamento = departamento;
        this.sexo = sexo;

        this.fechaNacimiento = fechaNacimiento;
        this.fechaNacimiento = fechaNacimiento;

    }

    public String crearID(String departamento) {
        Random random = new Random();
        String ID = null;
        if (departamento.equalsIgnoreCase("Francisco Morazan")) {
            ID += 01;
            ID += random.nextInt(01, 29);

        } else if (departamento.equalsIgnoreCase("Cortes")) {
            ID += 02;
            ID += random.nextInt(01, 13);
        } else if (departamento.equalsIgnoreCase("Comayagua")) {
            ID += 03;
            ID += random.nextInt(01, 22);
        }

        ID += this.fechaNacimiento.getYear() + 1900;
        ID += random.nextInt(00000, 100000);

        return ID;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(String numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", password=" + password + ", departamento=" + departamento + ", sexo=" + sexo + ", numeroIdentidad=" + numeroIdentidad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
