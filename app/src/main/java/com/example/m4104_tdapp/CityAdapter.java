package com.example.m4104_tdapp;

import android.content.Context;
import android.view.LayoutInflater;

import java.util.ArrayList;

public class CityAdapter
{
    private Context context;
    private LayoutInflater inflater;
    private ArrayList<City> cityList = null;

    public CityAdapter(Context aContext)
    {
        super();

        context = aContext;
        inflater = LayoutInflater.from(context);
        cityList = new ArrayList<>();
        cityList.add(new City("Paris", 0));
        cityList.add(new City("Rome", 0));
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public LayoutInflater getInflater() {
        return inflater;
    }

    public void setInflater(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }

}
