package coursera.santi.kota.activitis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;

import java.util.ArrayList;

import coursera.santi.kota.R;
import coursera.santi.kota.adapters.PetsFavoritosAdapter;
import coursera.santi.kota.pojos.MascotasFavoritas;

public class Main2Activity extends AppCompatActivity {

    ArrayList<MascotasFavoritas> favoritas;
    RecyclerView rvPetsFavoritos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvPetsFavoritos=(RecyclerView)findViewById(R.id.rvPetsfavoritos);

        LinearLayoutManager llmF= new LinearLayoutManager(this);
        llmF.setOrientation(LinearLayoutManager.VERTICAL);
        rvPetsFavoritos.setLayoutManager(llmF);

        llenarFavoritas();
        IniciarAdtadorFavoritas();


    }


    public void llenarFavoritas(){
        favoritas = new ArrayList<MascotasFavoritas>();

        favoritas.add(new MascotasFavoritas(R.drawable.favorita1,"Lucas","35"));
        favoritas.add(new MascotasFavoritas(R.drawable.favorita2,"Burro","32"));
        favoritas.add(new MascotasFavoritas(R.drawable.favorita3,"Boggy","30"));
        favoritas.add(new MascotasFavoritas(R.drawable.favorita4,"Berta","29"));
        favoritas.add(new MascotasFavoritas(R.drawable.favorita5,"Dory","27"));

    }

    public void IniciarAdtadorFavoritas(){
        PetsFavoritosAdapter favoritosAdapter= new PetsFavoritosAdapter(favoritas);
        rvPetsFavoritos.setAdapter(favoritosAdapter);
    }


}
