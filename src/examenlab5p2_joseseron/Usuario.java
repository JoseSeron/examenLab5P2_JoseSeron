package examenlab5p2_joseseron;

import java.util.Date;

/**
 *
 * @author joser
 */
public class Usuario {

    String nombre, apellido, password, departamento, sexo, numeroIdentidad;
    Date fechaNacimiento;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String password, String departamento, String sexo, String numeroIdentidad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.departamento = departamento;
        this.sexo = sexo;
        this.numeroIdentidad = numeroIdentidad;
        this.fechaNacimiento = fechaNacimiento;
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
