package usonsonatemio.com.segundaevaluacion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdaptadorLista extends ArrayAdapter<Data> {

    public AdaptadorLista(Context context, List<Data> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obteniendo el dato
        Data datos_lista = getItem(position);
        //TODO inicializando el layout correspondiente al item (Contacto)
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_seleccionado, parent, false);
        }

        TextView lblId = (TextView) convertView.findViewById(R.id.lblId);
        ImageView img = (ImageView) convertView.findViewById(R.id.imagen);
        TextView lblruta = (TextView) convertView.findViewById(R.id.ruta);

        // mostrar los datos
        lblId.setText((position + 1) + "");
        img.setImageBitmap(datos_lista.getImg());
        lblruta.setText(datos_lista.getRuta());

        // Return la convertView ya con los datos
        return convertView;
    }


}
