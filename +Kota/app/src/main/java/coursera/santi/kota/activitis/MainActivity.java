package coursera.santi.kota.activitis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

import coursera.santi.kota.pojos.Mascota;
import coursera.santi.kota.R;
import coursera.santi.kota.adapters.MascotaAdaptador;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota>mascotas;
    RecyclerView rvMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         rvMascotas = (RecyclerView)findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotas.setLayoutManager(llm);

        llenarLista();
        InicializarAdaptador();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.action_view,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.mFavoritos:
                Toast.makeText(this,"Favoritos",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(this,Main2Activity.class);
                startActivity(intent);

            break;
        }

        return super.onOptionsItemSelected(item);
    }


    public  void InicializarAdaptador(){

        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador(mascotas,this);
        rvMascotas.setAdapter(mascotaAdaptador);
    }


    public void llenarLista(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.cat,"Panchito","20"));
        mascotas.add(new Mascota(R.drawable.cuyo,"Clementino","15"));
        mascotas.add(new Mascota(R.drawable.perro,"Timoteo","13"));
        mascotas.add(new Mascota(R.drawable.pes,"Gordo","10"));
        mascotas.add(new Mascota(R.drawable.pig,"Piggy","8"));

    }
}
