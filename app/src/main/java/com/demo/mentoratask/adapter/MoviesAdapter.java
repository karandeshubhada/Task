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
import com.demo.mentoratask.model.MovieModel;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    Context context;
    private List<MovieModel> moviesList;
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, year, genre;
        MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            genre = view.findViewById(R.id.genre);
            year = view.findViewById(R.id.year);
        }
    }
    public MoviesAdapter(Context context,List<MovieModel> moviesList) {
        this.context=context;
        this.moviesList = moviesList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movies_list, parent, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final MovieModel movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());

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
                tv_msg_body.setText(movie.getTitle());

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
        return moviesList.size();
    }
}