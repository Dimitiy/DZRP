package com.android.shiz.commander.dzrp;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OldMan on 29.03.2016.
 */
public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    private List<Model> modelList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView cell1, cell2, cell3, cell4;

        public MyViewHolder(View view) {
            super(view);
            cell1 = (TextView) view.findViewById(R.id.cellView1);
            cell2 = (TextView) view.findViewById(R.id.cellView2);
            cell3 = (TextView) view.findViewById(R.id.cellView3);
            cell4 = (TextView) view.findViewById(R.id.cellView4);
        }
    }


    public RecycleViewAdapter(List<Model> moviesList) {
        this.modelList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Model model = modelList.get(position);
        holder.cell1.setText(model.getCell1());
        holder.cell2.setText(model.getCell2());
        holder.cell3.setText(model.getCell3());
        holder.cell4.setText(model.getCell4());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public void clearAllItems() {
        modelList.clear(); //clear list
        notifyDataSetChanged();
    }
    public void addAllItem(List<Model> viewModels) {
//        modelList.addAll(viewModels); //clear list
        Log.d("adapter", viewModels.toString());
        notifyDataSetChanged();
    }
}