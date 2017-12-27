package com.example.seongsunoh.vuforianavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.seongsunoh.vuforianavigation.SampleApplication.SampleApplicationControl;
import com.example.seongsunoh.vuforianavigation.SampleApplication.SampleApplicationException;
import com.vuforia.State;

public class MainActivity extends AppCompatActivity implements SampleApplicationControl{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean doInitTrackers() {
        return false;
    }

    @Override
    public boolean doLoadTrackersData() {
        return false;
    }

    @Override
    public boolean doStartTrackers() {
        return false;
    }

    @Override
    public boolean doStopTrackers() {
        return false;
    }

    @Override
    public boolean doUnloadTrackersData() {
        return false;
    }

    @Override
    public boolean doDeinitTrackers() {
        return false;
    }

    @Override
    public void onInitARDone(SampleApplicationException e) {

    }

    @Override
    public void onVuforiaUpdate(State state) {

    }

    @Override
    public void onVuforiaResumed() {

    }

    @Override
    public void onVuforiaStarted() {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
