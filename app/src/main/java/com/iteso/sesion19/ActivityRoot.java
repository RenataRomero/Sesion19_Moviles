package com.iteso.sesion19;

import android.support.v7.app.AppCompatActivity;

import com.iteso.sesion19.Tools.ConnectionDectector;

public class ActivityRoot extends AppCompatActivity{

    protected boolean isConnected(){

        if(new ConnectionDectector().isConnectionDetector()){

            return true;

        }else{
            //enable connectivity
            return false;

        }

    }

}
