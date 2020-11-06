package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> hargaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getDataFromInternet();
    }


    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan,hargaMakanan, infoMakanan,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        namaMakanan.add("Ayam Goreng ");
        fotoMakanan.add("https://img.kurio.network/Q3sZiqbMpr4A7tBW3y5CWiVH23s=/400x400/filters:quality(80):format(jpeg)/https://kurio-img.kurioapps.com/20/08/06/617a2a95-4ed0-4578-b22e-53c7a42107ee.jpg");
        infoMakanan.add("Ayam goreng dengan taburan kremes dengan sambal dan lalapan");
            hargaMakanan.add("RP. 16.000");

        namaMakanan.add("Bakso ");
        fotoMakanan.add("https://www.gannett-cdn.com/-mm-/a0a28bd666af6d80b33247a358069ae6b7ce0cc4/c=0-108-2121-1306/local/-/media/2017/04/03/Reno/RGJ/636267838115758642-GettyImages-507260308.jpg");
        infoMakanan.add("Bakso sapi dengan campuran seperti mie dan kubis\n " );
        hargaMakanan.add("RP. 10.000");

        namaMakanan.add("Bandeng Presto ");
        fotoMakanan.add("https://stgrindah.files.wordpress.com/2020/06/resep-bandeng-presto.jpg");
        infoMakanan.add("Bandeng Presto dengan sambal dan lalapan\n");
        hargaMakanan.add("RP. 15.000");

        namaMakanan.add("Bebek Goreng ");
        fotoMakanan.add("https://www.masakapahariini.com/wp-content/uploads/2019/03/bebek-goreng-780x440.jpg");
        infoMakanan.add("Bebek Goreng dengan taburan kremes serta sambal dan lalapan");
        hargaMakanan.add("RP. 18.000");

        namaMakanan.add("Nasi Goreng ");
        fotoMakanan.add("https://images.summitmedia-digital.com/yummyph/images/2019/11/26/nasigorengrecipe2.jpg");
        hargaMakanan.add("RP. 12.000");
        infoMakanan.add("Nasi goreng dengan telur dan lalapn " );

        namaMakanan.add("Tahu Gejrot ");
        fotoMakanan.add("https://blog.tokowahab.com/wp-content/uploads/2020/06/Resep-Tahu-Gejrot-Khas-Cirebon.jpg");
        hargaMakanan.add("RP. 15.000");
        infoMakanan.add("Tahu Gejrot khas Cirebon dengan sambal khasnya");



        prosesRecyclerViewAdapter();
    }
}