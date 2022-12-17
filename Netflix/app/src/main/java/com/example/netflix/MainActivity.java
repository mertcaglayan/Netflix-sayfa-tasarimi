package com.example.netflix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.netflix.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rv.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));
        ArrayList<Filmler> filmlerlistesi = new ArrayList<>();
        Filmler f1 = new Filmler(1,"kurtlar vadisi","kurtlarvadisi");
        Filmler f2 = new Filmler(2,"Witcher","thewitcher");
        Filmler f3 = new Filmler(3,"Narcos","narcoss");
        Filmler f4 = new Filmler(4,"Extraction","extraction");
        Filmler f5 = new Filmler(5,"Queens Qambit","queens_gambitt");

        filmlerlistesi.add(f1);
        filmlerlistesi.add(f2);
        filmlerlistesi.add(f3);
        filmlerlistesi.add(f4);
        filmlerlistesi.add(f5);

        binding.rv2.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));
        ArrayList<Filmler> filmlerlistesi2 = new ArrayList<>();
        Filmler f11 = new Filmler(11,"Cennet Mahallesi","cennet");
        Filmler f6 = new Filmler(6,"Arcane","arcane");
        Filmler f7 = new Filmler(7,"Dark","dark");
        Filmler f8 = new Filmler(8,"The Last Kingdom","kingdom");
        Filmler f9 = new Filmler(9,"Wednesday","wednesday");
        Filmler f10 = new Filmler(10,"1899","bin");
        filmlerlistesi2.add(f11);
        filmlerlistesi2.add(f6);
        filmlerlistesi2.add(f7);
        filmlerlistesi2.add(f8);
        filmlerlistesi2.add(f9);
        filmlerlistesi2.add(f10);

        Adapter adapter = new Adapter(this,filmlerlistesi);
        binding.rv.setAdapter(adapter);
        Adapter adapter1 = new Adapter(this,filmlerlistesi2);
        binding.rv2.setAdapter(adapter1);

    }
}