package com.fauzisunarya.mydesa;

import android.content.Context;
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
import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.CardViewHolder> {

    private List<Profile> listProfile;
    private Context mContext;

    public ProfileAdapter(List<Profile> list, Context context) {
        super();
        listProfile = list;
        mContext = context;
    }


    @NonNull
    @Override
    public ProfileAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_profile, viewGroup, false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder holder, int position) {
        Profile profile = listProfile.get(position);
        ((CardViewHolder) holder).img1.setImageResource(profile.getImageProfile());
        ((CardViewHolder) holder).tvName1.setText(profile.getNameProfile());
        ((CardViewHolder) holder).tvDescription.setText(profile.getDescriptionProfile());
    }

    @Override
    public int getItemCount() {
        return listProfile.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder{
        ImageView img1;
        TextView tvName1, tvDescription;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            img1 = (ImageView) itemView.findViewById(R.id.img1);
            tvName1 = (TextView) itemView.findViewById(R.id.tv_name1);
            tvDescription = (TextView) itemView.findViewById(R.id.tv_item_description);

        }
    }
}
