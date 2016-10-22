package com.example.atul.sunshine_weatherapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

/**
 * A placeholder fragment containing a simple view.
 */


public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container, false);

        listView = (ListView) view.findViewById(R.id.listview_forecast);

        String [] forecastArray= {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/40",
                "Wed - Sunny - 88/63",
                "Thus - Foggy - 73/41",
                "Fri - Foggy - 70/42",
        };

        List<String> weekforecast = new ArrayList<String>(Arrays.asList(forecastArray));

        ArrayAdapter<String> ad = new ArrayAdapter<String>(getContext(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                forecastArray);

        listView.setAdapter(ad);

        return view;
    }
}
