package com.example.android.brusselsguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ToursFragment extends Fragment {

    public ToursFragment() {
    }

    public static ToursFragment newInstance() {
        ToursFragment fragment = new ToursFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.result_list, container, false);

        final ArrayList<Result> result = new ArrayList<Result>();
        result.add(new Result(R.string.brussels_chocolate, R.string.chocolate_address, R.string.chocolate_contact, R.drawable.brussels_chocolate));
        result.add(new Result(R.string.brussels_hop, R.string.brussels_hop_address, R.string.brussels_hop_contact, R.drawable.brussel_hop));
        result.add(new Result(R.string.brussels_waffle, R.string.waffle_address, R.string.waffle_contact, R.drawable.brussels_waffle));
        result.add(new Result(R.string.food_beer, R.string.food_beer_address, R.string.foor_beer_contact, R.drawable.brussels_beer));
        result.add(new Result(R.string.small_group, R.string.small_group_address, R.string.small_group_contact, R.drawable.small_group));

        ResultAdapter adapter = new ResultAdapter(getActivity(), result, R.color.categoryTours);

        ListView listView = (ListView) rootView.findViewById(R.id.result_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}