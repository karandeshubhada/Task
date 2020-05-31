package com.demo.mentoratask.model;

public class TrainModel {
    String BusFrom;
    String BusTo;
    String BusFromTime;
    String BusTotal;


    String TrainFrom;
    String TrainTo;
    String TrainFromTime;
    String TrainTotal;
     public TrainModel(String busFrom, String busTo, String busFromTime, String busTotal, String trainFrom, String trainTo, String trainFromTime, String trainTotal) {
        BusFrom = busFrom;
        BusTo = busTo;
        BusFromTime = busFromTime;
        BusTotal = busTotal;
        TrainFrom = trainFrom;
        TrainTo = trainTo;
        TrainFromTime = trainFromTime;
        TrainTotal = trainTotal;
    }
    public String getBusFrom() {
        return BusFrom;
    }

    public void setBusFrom(String busFrom) {
        BusFrom = busFrom;
    }

    public String getBusTo() {
        return BusTo;
    }

    public void setBusTo(String busTo) {
        BusTo = busTo;
    }

    public String getBusFromTime() {
        return BusFromTime;
    }

    public void setBusFromTime(String busFromTime) {
        BusFromTime = busFromTime;
    }

    public String getBusTotal() {
        return BusTotal;
    }

    public void setBusTotal(String busTotal) {
        BusTotal = busTotal;
    }

    public String getTrainFrom() {
        return TrainFrom;
    }

    public void setTrainFrom(String trainFrom) {
        TrainFrom = trainFrom;
    }

    public String getTrainTo() {
        return TrainTo;
    }

    public void setTrainTo(String trainTo) {
        TrainTo = trainTo;
    }

    public String getTrainFromTime() {
        return TrainFromTime;
    }

    public void setTrainFromTime(String trainFromTime) {
        TrainFromTime = trainFromTime;
    }

    public String getTrainTotal() {
        return TrainTotal;
    }

    public void setTrainTotal(String trainTotal) {
        TrainTotal = trainTotal;
    }



}
