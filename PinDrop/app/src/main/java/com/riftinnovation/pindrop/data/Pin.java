package com.riftinnovation.pindrop.data;


import java.io.Serializable;

import com.google.android.gms.maps.model.LatLng;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.types.DateTimeType;

/**
 * Created by anton on 6/13/2017.
 */

public class Pin implements Serializable {

    /**
     *  Model class for teacher_details database table
     */
    private static final long serialVersionUID = -222864131214757024L;

    @DatabaseField(columnName = "latitude")
    private float lat;

    @DatabaseField(columnName = "longitude")
    private float lng;

    @DatabaseField(columnName = "pin_type")
    private String type;

    //@DatabaseField(columnName = "timestamp")
    //private DateTimeType timestamp;

    //@DatabaseField(columnName = "global_id")
    //private String global_id;

    //Default constructor
    public Pin(){

    }

    public Pin(final float lat,final float lng,final String type){
        this.lat = lat;
        this.lng = lng;
        this.type = type;
    }

}
