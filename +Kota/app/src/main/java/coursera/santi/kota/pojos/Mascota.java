package coursera.santi.kota.pojos;

/**
 * Created by santi on 24/09/2016.
 */
public class Mascota {

    private int imagen;
    private String nombre;
    private String raquin;

    public Mascota(int imagen, String nombre, String raquin) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.raquin= raquin;

    }

    public String getRaquin() {
        return raquin;
    }

    public void setRaquin(String raquin) {
        this.raquin = raquin;
    }



    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
