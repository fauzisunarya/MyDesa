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

public class DesaWisataAdapter extends RecyclerView.Adapter<DesaWisataAdapter.GridViewHolder> {

    private ArrayList<Desa> listDesa;

    public DesaWisataAdapter(ArrayList<Desa> list) {
        this.listDesa = list;
    }


    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_desa_wisata, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
        Desa hero = listDesa.get(position);
        Glide.with(holder.itemView.getContext())
                .load(listDesa.get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.img1);
        holder.tvName1.setText(hero.getName());
    }

    @Override
    public int getItemCount() {
        return listDesa.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder{
        ImageView img1, img2;
        TextView tvName1, tvName2;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            img1 = itemView.findViewById(R.id.img1);
            tvName1 = itemView.findViewById(R.id.tv_name1);

        }
    }
}
