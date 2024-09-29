package com.example.masaladosa;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder>
{

    private List<Item> items;
    private Context context;

    public ItemAdapter(List<Item> itemList, Context context) {
        items = itemList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =
    LayoutInflater.from(context).inflate(R.layout.details_card, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = items.get(position);
        TextView itemTitleTextView = holder.itemView.findViewById(R.id.text_title);
        itemTitleTextView.setText(item.name);
        TextView itemRatingTextView = holder.itemView.findViewById(R.id.item_rating);
        itemRatingTextView.setText("("+item.rating+")");
        TextView priceTextView = holder.itemView.findViewById(R.id.text_subtitle);
        priceTextView.setText(item.price);

        CardView dosabutton = (CardView) holder.itemView.findViewById(R.id.card_dosa);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginToMainIntent = new Intent(context, masaladosa2.class);
                context.startActivity(loginToMainIntent);
            }
        };
        dosabutton.setOnClickListener(listener);

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View view) {
            super(view);
        }

        public void bind(Item item) {

        }


    }
}