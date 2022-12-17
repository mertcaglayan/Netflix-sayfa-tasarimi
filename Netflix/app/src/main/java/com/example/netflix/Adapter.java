package com.example.netflix;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.netflix.databinding.CardTasarimBinding;

import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Filmler> filmlerListesi;

    public Adapter(Context mContext, List<Filmler> filmlerListesi) {
        this.mContext = mContext;
        this.filmlerListesi = filmlerListesi;
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding =
                CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Filmler film = filmlerListesi.get(position);
        CardTasarimBinding t = holder.binding;

        t.imageView.setImageResource
                (mContext.getResources().getIdentifier(film.getResimad(),"drawable",mContext.getPackageName()));
    }

    @Override
    public int getItemCount() {
        return filmlerListesi.size();
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
    private CardTasarimBinding binding;
    public CardTasarimTutucu(CardTasarimBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
}

