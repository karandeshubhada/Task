package com.demo.mentoratask.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.demo.mentoratask.R;
import com.demo.mentoratask.model.TrainModel;

import java.util.List;

public class TrainAdapter extends RecyclerView.Adapter<TrainAdapter.MyViewHolder> {
    Context context;
    private List<TrainModel> trainModelList;

    public TrainAdapter(Context context,List<TrainModel> trainModelList) {
        this.context=context;
        this.trainModelList = trainModelList;
    }

    @NonNull
    @Override
    public TrainAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bus_and_train_layout, parent, false);
        return new TrainAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TrainAdapter.MyViewHolder holder, int position) {
        final TrainModel trainModel=trainModelList.get(position);
        holder.bus_from.setText(trainModel.getBusFrom());
        holder.bus_to.setText(trainModel.getBusTo());
        holder.bus_fromTime.setText(trainModel.getBusFromTime());
        holder.bus_total.setText(trainModel.getBusTotal());
        holder.train_from.setText(trainModel.getTrainFrom());
        holder.train_to.setText(trainModel.getTrainTo());
        holder.train_fromTime.setText(trainModel.getTrainFromTime());
        holder.train_total.setText(trainModel.getTrainTotal());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(context);
                AlertDialog.Builder builder=new AlertDialog.Builder(context);
                View view=LayoutInflater.from(context).inflate(R.layout.custom_dialog_detail_pop_up,null);
                builder.setView(view);
                builder.setCancelable(false);

                final androidx.appcompat.app.AlertDialog alertDialog = builder.create();
                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.show();

                TextView btn_ok = view.findViewById(R.id.btn_ok);
                TextView tv_msg_body = view.findViewById(R.id.tv_msg_body);
                tv_msg_body.setText(trainModel.getBusFrom());

                btn_ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        alertDialog.dismiss();
                    }
                });
            }
        });

    }

    @Override
    public int getItemCount() {
        return trainModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView bus_from,bus_to,bus_fromTime,bus_total,train_from,train_to,train_fromTime,train_total;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            bus_from=itemView.findViewById(R.id.bus_from);
            bus_to=itemView.findViewById(R.id.bus_to);
            bus_fromTime=itemView.findViewById(R.id.bus_fromTime);
            bus_total=itemView.findViewById(R.id.bus_total);
            train_from=itemView.findViewById(R.id.train_from);
            train_to=itemView.findViewById(R.id.train_to);
            train_fromTime=itemView.findViewById(R.id.train_fromTime);
            train_total=itemView.findViewById(R.id.train_total);
        }
    }
}
