package coursera.santi.kota.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import coursera.santi.kota.pojos.Mascota;
import coursera.santi.kota.R;

/**
 * Created by santi on 24/09/2016.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascota>mascotas;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas,Activity activity) {
        this.mascotas = mascotas;
        this.activity=activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_mascota, parent , false);

        return new MascotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder holder, int position) {

        Mascota mascota = mascotas.get(position);

        holder.imgMascota.setImageResource(mascota.getImagen());
        holder.tvNombre.setText(mascota.getNombre());
        holder.tvNumerolike.setText(mascota.getRaquin());


        holder.imgVotar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NumeroMegusta= (String) holder.tvNumerolike.getText();
                int numeroMegusta=Integer.parseInt(NumeroMegusta)+1;
                String NumeroMegustaFinal=Integer.toString(numeroMegusta);
                holder.tvNumerolike.setText(NumeroMegustaFinal);

            }
        });

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        ImageView imgMascota,imgRaquin,imgVotar;
        TextView tvNombre,tvNumerolike;

        public MascotaViewHolder(View itemView) {
            super(itemView);

            imgMascota = (ImageView)itemView.findViewById(R.id.imgMascota);
            imgRaquin = (ImageView)itemView.findViewById(R.id.imgRaquin);
            imgVotar = (ImageView)itemView.findViewById(R.id.imgBotonVotar);

            tvNombre = (TextView)itemView.findViewById(R.id.tvNombre);
            tvNumerolike=(TextView)itemView.findViewById(R.id.numeroMegusta);
        }
    }
}
