package com.example.m4104_tdapp;

public class City
{
    private String name;
    private int image;

    public City(String nom, int ressource)
    {
        this.setName(nom);
        this.setImage(ressource);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getImage()
    {
        return image;
    }

    public void setImage(int image)
    {
        this.image = image;
    }


}

