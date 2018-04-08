package com.example.android.brusselsguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment() {
    }

    public static RestaurantsFragment newInstance() {
        RestaurantsFragment fragment = new RestaurantsFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.result_list, container, false);

        final ArrayList<Result> result = new ArrayList<Result>();
        result.add(new Result(R.string.fin_de_siecle, R.string.fin_siecle_address, R.string.fin_siecle_contact, R.drawable.finde_siecle));
        result.add(new Result(R.string.sea_grill, R.string.sea_grill_address, R.string.sea_gril_contact, R.drawable.sea_grill));
        result.add(new Result(R.string.pasta_divina, R.string.divina_address, R.string.divina_contact, R.drawable.pasta_divina));
        result.add(new Result(R.string.chez_soi, R.string.chezsoi_address, R.string.chezsoi_contact, R.drawable.comme_chezsoi));
        result.add(new Result(R.string.toukoul, R.string.toukoul_address, R.string.toukoul_contact, R.drawable.toukoul));

        ResultAdapter adapter = new ResultAdapter(getActivity(), result, R.color.categoryRestaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.result_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
