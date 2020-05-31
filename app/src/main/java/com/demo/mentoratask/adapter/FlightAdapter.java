package com.demo.mentoratask.adapter;

import android.content.Context;
import android.content.Intent;
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
import com.demo.mentoratask.model.FlightModel;

import java.util.List;

public class FlightAdapter extends RecyclerView.Adapter<FlightAdapter.MyViewHolder> {
    private List<FlightModel> flightModelList;
    Context context;

    public FlightAdapter(Context context,List<FlightModel> flightModelList) {
        this.context=context;
        this.flightModelList = flightModelList;
    }

    @NonNull
    @Override
    public FlightAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.flight_list_layout, parent, false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull FlightAdapter.MyViewHolder holder, int position) {
        final FlightModel flightModel=flightModelList.get(position);
        holder.from.setText(flightModel.getFromFlightName());
        holder.to.setText(flightModel.getToFlightName());
        holder.direct.setText(flightModel.getDirect());
        holder.stop.setText(flightModel.getStops());
        holder.guj.setText(flightModel.getGuj());
        holder.fTime.setText(flightModel.getFTime());
        holder.tTime.setText(flightModel.getTTime());
        holder.fromTime.setText(flightModel.getFromTime());
        holder.toTime.setText(flightModel.getToTime());

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
                tv_msg_body.setText(flightModel.getToFlightName());

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
        return flightModelList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView from,to,direct,stop,guj,fTime,tTime,fromTime,toTime;
        MyViewHolder(View itemView) {
            super(itemView);
            from=itemView.findViewById(R.id.tv_from);
            to = itemView.findViewById(R.id.tv_to);
            direct = itemView.findViewById(R.id.tv_direct);
            stop = itemView.findViewById(R.id.tv_stop);
            guj = itemView.findViewById(R.id.tv_guj);
            fTime = itemView.findViewById(R.id.tv_fTime);
            tTime = itemView.findViewById(R.id.tv_tTime);
            fromTime = itemView.findViewById(R.id.tv_fromTime);
            toTime = itemView.findViewById(R.id.tv_toTime);
        }
    }


}
