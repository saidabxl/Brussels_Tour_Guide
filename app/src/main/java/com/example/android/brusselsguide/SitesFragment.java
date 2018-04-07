package com.example.android.brusselsguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class SitesFragment extends Fragment {
    public SitesFragment() {
    }

    public static SitesFragment newInstance(){
        SitesFragment fragment = new SitesFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.result_list, container, false);

        final ArrayList<Result> result = new ArrayList<Result>();
        result.add(new Result(R.string.grand_place, R.string.grand_place_address, R.string.grand_place_contact, R.drawable.grand_place));
        result.add(new Result(R.string.coudenberg, R.string.coudenberg_address, R.string.coudenberg_contact, R.drawable.coudenberg_brussels));
        result.add(new Result(R.string.mont_arts, R.string.mont_arts_address, R.string.mont_arts_contact, R.drawable.mont_des_arts));
        result.add(new Result(R.string.atomium, R.string.atomium_address, R.string.atomium_contact, R.drawable.automium));
        result.add(new Result(R.string.manneken_pis, R.string.manneken_address, R.string.manneken_contact, R.drawable.mannekenpis));

        ResultAdapter adapter = new ResultAdapter(getActivity(), result, R.color.categorySites);

        ListView listView = (ListView) rootView.findViewById(R.id.result_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}


