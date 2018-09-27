package net.ivanvega.audiolibrosv22018;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        Aplicacion app = (Aplicacion) getApplication();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //recyclerView.setAdapter(app.getAdaptador());
        //layoutManager = new LinearLayoutManager(this);
        AdaptadorLibros adp = app.getAdaptador();
        adp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Elemento seleccioando: " +
                recyclerView.getChildAdapterPosition(view), Toast.LENGTH_LONG).show();
            }
        });
        recyclerView.setAdapter(adp);
        layoutManager = new GridLayoutManager(this,2, GridLayoutManager.HORIZONTAL , false);
        recyclerView.setLayoutManager(layoutManager);

    }
}
