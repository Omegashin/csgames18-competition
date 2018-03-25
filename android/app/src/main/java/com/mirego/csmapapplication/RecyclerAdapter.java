package com.mirego.csmapapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gdesi on 3/24/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemHolder> {

    ArrayList<ListItemClass> data = new ArrayList<>();

    @NonNull
    @Override
    public RecyclerAdapter.ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        data.add(new ListItemClass("ff","dd"));
        data.add(new ListItemClass("ff","dd"));
        data.add(new ListItemClass("ff","dd"));
        data.add(new ListItemClass("ff","dd"));
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ItemHolder holder, int position) {
        holder.bindData(data.get(position));
        holder.testView.setText(data.get(position).getName());
        Log.e("Adapter",data.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return 10;
    }
    public class ItemHolder extends RecyclerView.ViewHolder {

        private TextView testView;

        public ItemHolder(View itemView) {
            super(itemView);
            testView = itemView.findViewById(R.id.name);
        }

        public void bindData(final ListItemClass viewModel) {
            testView.setText(viewModel.getName());
        }
    }

}
