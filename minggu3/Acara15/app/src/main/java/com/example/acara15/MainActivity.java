package com.example.acara15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private ArrayList<herolists> herolists;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = findViewById(R.id.listview);
        herolists = setMedsosAndName();
        MahasiswaAdapter mahasiswaAdapter = new MahasiswaAdapter(MainActivity.this,herolists);
        listView.setAdapter(mahasiswaAdapter);
        listView.setOnItemClickListener(this);

    }

    private ArrayList<herolists> setMedsosAndName(){
        herolists = new ArrayList<>();
        
        herolists.add(new herolists(R.drawable.apel, "Apel Fuji"));
        herolists.add(new herolists(R.drawable.jambu, "Jambu Biji"));
        herolists.add(new herolists(R.drawable.kelapa, "Kelapa"));
        herolists.add(new herolists(R.drawable.anggur, "Anggur Merah"));
        herolists.add(new herolists(R.drawable.melon, "Melon"));
        herolists.add(new herolists(R.drawable.rasbe, "Rashberry"));
        herolists.add(new herolists(R.drawable.semangka, "Semangka"));
        herolists.add(new herolists(R.drawable.jeruk, "Jeruk"));
        herolists.add(new herolists(R.drawable.mangga, "Mangga"));
        return herolists;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        herolists list = herolists.get(position);
        Toast.makeText(MainActivity.this, "Social Media Name ..." + list.getName(), Toast.LENGTH_SHORT).show();
    }
}