
package sgbd_abd;

import java.util.ArrayList;

public class Base_de_datos {
    private String nombreBD;
    private String descripcion;
    private ArrayList tablas;

    public String getNombreBD() {
        return nombreBD;
    }

    public void setNombreBD(String nombreBD) {
        this.nombreBD = nombreBD;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripción) {
        this.descripcion = descripción;
    }

    public ArrayList getTablas() {
        return tablas;
    }

    public void setTablas(ArrayList tablas) {
        this.tablas = tablas;
    }
    
}
