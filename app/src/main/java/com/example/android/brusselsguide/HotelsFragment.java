package com.example.android.brusselsguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {
    public HotelsFragment() {
    }

    public static HotelsFragment newInstance() {
        HotelsFragment fragment = new HotelsFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.result_list, container, false);

        final ArrayList<Result> result = new ArrayList<Result>();
        result.add(new Result(R.string.sablon_hotel, R.string.sablon_address, R.string.sablon_contact, R.drawable.hotel_brussels));
        result.add(new Result(R.string.noga_hotel, R.string.noga_address, R.string.noga_contact, R.drawable.noga));
        result.add(new Result(R.string.parkinn_hotel, R.string.parkinn_address, R.string.parkinn_contact, R.drawable.park_inn));
        result.add(new Result(R.string.holidayinn_hotel, R.string.holidayinn_address, R.string.holidayinn_contact, R.drawable.holiday_inn));
        result.add(new Result(R.string.crowneplaza_hotel, R.string.crowneplaza_address, R.string.crowneplaza_contact, R.drawable.crowne_plaza));

        ResultAdapter adapter = new ResultAdapter(getActivity(), result, R.color.categoryHotels);

        ListView listView = (ListView) rootView.findViewById(R.id.result_list);

        listView.setAdapter(adapter);

        return rootView;

    }
}
