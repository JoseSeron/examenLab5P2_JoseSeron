package examenlab5p2_joseseron;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author joser
 */
public class Civil extends Usuario {

    ArrayList<Tramite> tramites;

    public Civil() {
        super();
    }

    public Civil(ArrayList<Tramite> tramites) {
        this.tramites = tramites;
    }

    public Civil(ArrayList<Tramite> tramites, String nombre, String apellido, String password, String departamento, Date fechaNacimiento) {
        super(nombre, apellido, password, departamento, fechaNacimiento);
        this.tramites = tramites;
    }

  
    public ArrayList<Tramite> getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList<Tramite> tramites) {
        this.tramites = tramites;
    }

    @Override
    public String toString() {
        return super.toString() + "Civil{" + "tramites=" + tramites + '}';
    }

}
