package examenlab5p2_joseseron;

import java.util.Date;

/**
 *
 * @author joser
 */
public class Tramite {

    String nombre, descripcion, idSolicitante;
    Date fechaSolicitud;

    public Tramite() {
    }

    public Tramite(String nombre, String descripcion, String idSolicitante, Date fechaSolicitud) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idSolicitante = idSolicitante;
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(String idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    @Override
    public String toString() {
        return "Tramite{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", idSolicitante=" + idSolicitante + ", fechaSolicitud=" + fechaSolicitud + '}';
    }

}
