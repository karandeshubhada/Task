package com.demo.mentoratask;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.Chronometer;
import android.widget.Toast;

import com.demo.mentoratask.adapter.FlightAdapter;
import com.demo.mentoratask.adapter.MoviesAdapter;
import com.demo.mentoratask.adapter.TrainAdapter;
import com.demo.mentoratask.model.FlightModel;
import com.demo.mentoratask.model.MovieModel;
import com.demo.mentoratask.model.TrainModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class HomeActivity extends AppCompatActivity {

    private List<MovieModel> movieList = new ArrayList<>();
     private List<FlightModel> flightModels = new ArrayList<>();
     private List<TrainModel> trainModels = new ArrayList<>();
    private MoviesAdapter mAdapter;
    private FlightAdapter flightAdapter;
    private TrainAdapter trainAdapter;

    RecyclerView recyclerView_flight, recyclerView,recyclerView_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        runOnUiThread(new Runnable() {

            @Override
            public void run() {
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //add your code here
                    }
                }, 2 * 60 * 60 * 1000);

            }
        });


        prepareFlightData();
        prepareMovieData();
        prepareBusandTrainData();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView_flight = findViewById(R.id.recyclerView_flight);
        recyclerView_info = findViewById(R.id.recyclerView_info);


        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView_flight.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL, false));
        recyclerView_flight.setItemAnimator(new DefaultItemAnimator());
        recyclerView_info.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL, false));
        recyclerView_info.setItemAnimator(new DefaultItemAnimator());

        mAdapter = new MoviesAdapter(HomeActivity.this,movieList);
        recyclerView.setAdapter(mAdapter);

        flightAdapter = new FlightAdapter(HomeActivity.this,flightModels);
        recyclerView_flight.setAdapter(flightAdapter);

        trainAdapter = new TrainAdapter(HomeActivity.this,trainModels);
        recyclerView_info.setAdapter(trainAdapter);

        Chronometer.OnChronometerTickListener mChronoListener = new Chronometer.OnChronometerTickListener() { // listens to journey timer to initiate time based events
            int breakTime = 20000;

            public void onChronometerTick(Chronometer arg0) {

                long elapsedTime = SystemClock.elapsedRealtime() - arg0.getBase();

                if (elapsedTime > breakTime) {
                    Toast.makeText(HomeActivity.this, "2   HOUR PASSED", Toast.LENGTH_LONG).show();
                }

            }
        };
    }

    private void prepareBusandTrainData() {

        TrainModel trainModel=new TrainModel("Pandharpur","Pune","2.00PM-7.00PM","5 hrs",
                "Pune","Solapur","2.00PM-6.00PM","4 hrs");
        trainModels.add(trainModel);
        trainModel=new TrainModel("Pandharpur","Pune","2.00PM-7.00PM","5 hrs",
                "Pune","Solapur","2.00PM-6.00PM","4 hrs");
        trainModels.add(trainModel);
        trainModel=new TrainModel("Pandharpur","Pune","2.00PM-7.00PM","5 hrs",
                "Pune","Solapur","2.00PM-6.00PM","4 hrs");
        trainModels.add(trainModel);
        trainModel=new TrainModel("Pandharpur","Pune","2.00PM-7.00PM","5 hrs",
                "Pune","Solapur","2.00PM-6.00PM","4 hrs");
        trainModels.add(trainModel);
    }

    private void prepareFlightData() {

        FlightModel flightModel = new FlightModel("DEL", "IXJ", "DIRECT", "STOPS 1 hr 15 mins",
                "GUJ", "1 hr 30 mins", "1 hr 25 mins", "14:55-13:25", "16:55-15:30", "Rs.18350");
        flightModels.add(flightModel);
        flightModel = new FlightModel("DEL", "IXJ", "DIRECT", "STOPS 1 hr 15 mins",
                "GUJ", "1 hr 30 mins", "1 hr 25 mins", "14:55-13:25", "16:55-15:30", "Rs.18350");
        flightModels.add(flightModel);

        flightModel = new FlightModel("DEL", "IXJ", "DIRECT", "STOPS 1 hr 15 mins",
                "GUJ", "1 hr 30 mins", "1 hr 25 mins", "14:55-13:25", "16:55-15:30", "Rs.18350");
        flightModels.add(flightModel);


    }

    private void prepareMovieData() {
        MovieModel movie = new MovieModel("Mad Max: Fury Road", "Action & Adventure", "2015");
        movieList.add(movie);
        movie = new MovieModel("Inside Out", "Animation, Kids & Family", "2015");
        movieList.add(movie);
        movie = new MovieModel("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);
        movie = new MovieModel("Shaun the Sheep", "Animation", "2015");
        movieList.add(movie);
        movie = new MovieModel("The Martian", "Science Fiction & Fantasy", "2015");
        movieList.add(movie);
        movie = new MovieModel("Mission: Impossible Rogue Nation", "Action", "2015");
        movieList.add(movie);
        movie = new MovieModel("Up", "Animation", "2009");
        movieList.add(movie);
        movie = new MovieModel("Star Trek", "Science Fiction", "2009");
        movieList.add(movie);
        movie = new MovieModel("The LEGO MovieModel", "Animation", "2014");
        movieList.add(movie);
        movie = new MovieModel("Iron Man", "Action & Adventure", "2008");
        movieList.add(movie);
        movie = new MovieModel("Aliens", "Science Fiction", "1986");
        movieList.add(movie);
        movie = new MovieModel("Chicken Run", "Animation", "2000");
        movieList.add(movie);
        movie = new MovieModel("Back to the Future", "Science Fiction", "1985");
        movieList.add(movie);
        movie = new MovieModel("Raiders of the Lost Ark", "Action & Adventure", "1981");
        movieList.add(movie);
        movie = new MovieModel("Goldfinger", "Action & Adventure", "1965");
        movieList.add(movie);
        movie = new MovieModel("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        finishAffinity();
                    }
                }).create().show();
    }
}
