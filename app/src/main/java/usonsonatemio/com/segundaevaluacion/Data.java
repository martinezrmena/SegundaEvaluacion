package usonsonatemio.com.segundaevaluacion;

import android.graphics.Bitmap;

public class Data {

    private int id;
    private Bitmap img;
    private String Ruta;

    public Data(int id, Bitmap img, String ruta) {
        this.id = id;
        this.img = img;
        Ruta = ruta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bitmap getImg() {
        return img;
    }

    public void setImg(Bitmap img) {
        this.img = img;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String ruta) {
        Ruta = ruta;
    }
}
