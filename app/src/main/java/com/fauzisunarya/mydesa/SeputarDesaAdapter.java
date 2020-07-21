package com.fauzisunarya.mydesa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class SeputarDesaAdapter extends RecyclerView.Adapter<SeputarDesaAdapter.SeputarViewHolder> {

    private ArrayList<Desa> listDesa;

    public SeputarDesaAdapter(ArrayList<Desa> list) {
        this.listDesa = list;
    }


    @NonNull
    @Override
    public SeputarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_seputar_desa, viewGroup, false);
        return new SeputarDesaAdapter.SeputarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final SeputarViewHolder holder, int position) {
        Desa hero = listDesa.get(position);
        Glide.with(holder.itemView.getContext())
                .load(listDesa.get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.img1);

        holder.tvName1.setText(hero.getName());
        holder.tvDescription.setText(hero.getDescription());
    }

    @Override
    public int getItemCount() {
        return listDesa.size();
    }

    public class SeputarViewHolder extends RecyclerView.ViewHolder{
        ImageView img1;
        TextView tvName1, tvDescription;
        public SeputarViewHolder(@NonNull View itemView) {
            super(itemView);
            img1 = itemView.findViewById(R.id.img1);
            tvName1 = itemView.findViewById(R.id.tv_name1);
            tvDescription = itemView.findViewById(R.id.tv_item_description);

        }
    }


}
