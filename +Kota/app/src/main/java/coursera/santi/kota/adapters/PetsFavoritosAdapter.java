package coursera.santi.kota.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import coursera.santi.kota.R;
import coursera.santi.kota.pojos.MascotasFavoritas;

/**
 * Created by santi on 25/09/2016.
 */
public class PetsFavoritosAdapter extends RecyclerView.Adapter<PetsFavoritosAdapter.PetsFavoritosViewHolder> {

    ArrayList<MascotasFavoritas>favoritas;

    public PetsFavoritosAdapter(ArrayList<MascotasFavoritas> favoritas) {
        this.favoritas = favoritas;
    }

    @Override
    public PetsFavoritosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_mascota, parent ,false);

        return new PetsFavoritosViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final PetsFavoritosViewHolder holder, int position) {
       MascotasFavoritas mascotasFavoritas = favoritas.get(position);

        holder.imgMascotaF.setImageResource(mascotasFavoritas.getImagen());
        holder.tvNombreF.setText(mascotasFavoritas.getNombre());
        holder.tvNumerolikeF.setText(mascotasFavoritas.getRaquin());

        holder.imgVotarF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NumeroMegusta= (String) holder.tvNumerolikeF.getText();

                int numeroMegustaF=Integer.parseInt(NumeroMegusta)+1;
                String NumeroMegustaFinalF=Integer.toString(numeroMegustaF);

                holder.tvNumerolikeF.setText(NumeroMegustaFinalF);

            }
        });

    }

    @Override
    public int getItemCount() {
        return favoritas.size();
    }

    public static class PetsFavoritosViewHolder extends RecyclerView.ViewHolder {

        ImageView imgMascotaF,imgRaquinF,imgVotarF;
        TextView tvNombreF,tvNumerolikeF;

        public PetsFavoritosViewHolder(View itemView) {
            super(itemView);

            imgMascotaF = (ImageView)itemView.findViewById(R.id.imgMascota);
            imgRaquinF = (ImageView)itemView.findViewById(R.id.imgRaquin);
            imgVotarF = (ImageView)itemView.findViewById(R.id.imgBotonVotar);

            tvNombreF = (TextView)itemView.findViewById(R.id.tvNombre);
            tvNumerolikeF=(TextView)itemView.findViewById(R.id.numeroMegusta);
        }
    }
}
