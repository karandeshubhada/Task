package com.demo.mentoratask.model;

public class FlightModel {
    String fromFlightName;
    String toFlightName;
    String direct;
    String stops;
    String guj;
    String FTime;
    String TTime;

    public FlightModel(String fromFlightName, String toFlightName, String direct, String stops, String guj, String FTime, String TTime, String fromTime, String toTime, String price) {
        this.fromFlightName = fromFlightName;
        this.toFlightName = toFlightName;
        this.direct = direct;
        this.stops = stops;
        this.guj = guj;
        this.FTime = FTime;
        this.TTime = TTime;
        FromTime = fromTime;
        ToTime = toTime;
        this.price = price;
    }

    String FromTime;
    String ToTime;



    public String getFromFlightName() {
        return fromFlightName;
    }

    public void setFromFlightName(String fromFlightName) {
        this.fromFlightName = fromFlightName;
    }

    public String getToFlightName() {
        return toFlightName;
    }

    public void setToFlightName(String toFlightName) {
        this.toFlightName = toFlightName;
    }

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    public String getStops() {
        return stops;
    }

    public void setStops(String stops) {
        this.stops = stops;
    }

    public String getGuj() {
        return guj;
    }

    public void setGuj(String guj) {
        this.guj = guj;
    }

    public String getFTime() {
        return FTime;
    }

    public void setFTime(String FTime) {
        this.FTime = FTime;
    }

    public String getTTime() {
        return TTime;
    }

    public void setTTime(String TTime) {
        this.TTime = TTime;
    }

    public String getFromTime() {
        return FromTime;
    }

    public void setFromTime(String fromTime) {
        FromTime = fromTime;
    }

    public String getToTime() {
        return ToTime;
    }

    public void setToTime(String toTime) {
        ToTime = toTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    String price;

}
