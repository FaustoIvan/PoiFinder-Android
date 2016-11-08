package edu.unsam.algo3.poifinder.service;
import java.util.List;

import edu.unsam.algo3.poifinder.model.Poi;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Laboratorio on 01/11/2016.
 */
public interface Servicio {

        @GET("/pois")
        void getPois(Callback<List<Poi>> callback);

        @GET("/pois/:id")
        void getPoi(@retrofit.http.Path("id") String id, Callback<Poi> callback);
    }

    /*private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/

//}
