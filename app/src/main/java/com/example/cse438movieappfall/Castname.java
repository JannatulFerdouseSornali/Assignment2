package com.example.cse438movieappfall;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Castname implements Serializable {
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("cast")
    @Expose
    private List<CastAct> cast = null;
    @SerializedName("crew")
    @Expose
    private List<CastAct> crew = null;
    private final static long serialVersionUID = 1227730618350775398L;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<CastAct> getCast() {
        return cast;
    }

    public void setCast(List<CastAct> cast) {
        this.cast = cast;
    }

    public List<CastAct> getCrew() {
        return crew;
    }

    public void setCrew(List<CastAct> crew) {
        this.crew = crew;
    }
}
