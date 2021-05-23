package com.scBPO.bposample.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.scBPO.bposample.R;

public class HistoryAdapter  extends RecyclerView.Adapter<HistoryAdapter.ViewHolder> {
    public HistoryAdapter() {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.history_item, parent, false);
        HistoryAdapter.ViewHolder viewHolder = new HistoryAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 13;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
//        public ImageView tasbee_icon;
//        public ImageView clear;
//        public ImageView reset;
//        public TextView tasbee_count;
//        public Button tap_count;

        public ViewHolder(View itemView) {
            super(itemView);
//            this.tasbee_icon = itemView.findViewById(R.id.tasbee_icon);
//            this.clear = itemView.findViewById(R.id.clear);
//            this.reset = itemView.findViewById(R.id.reset);
//            this.tasbee_count = itemView.findViewById(R.id.tasbee_count);
//            tap_count = itemView.findViewById(R.id.tap_count);
        }
    }
}

