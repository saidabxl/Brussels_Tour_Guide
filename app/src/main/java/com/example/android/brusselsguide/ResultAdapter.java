package com.example.android.brusselsguide;


import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
public class ResultAdapter extends ArrayAdapter<Result> {

    private int mColorResourceId;

    public ResultAdapter(Context context, ArrayList<Result> result, int ColorResourceId) {
        super(context, 0, result);
        mColorResourceId = ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Result currentResult = getItem(position);

        //Locate the TextView
        TextView establishmentNameTextView = (TextView) listItemView.findViewById(R.id.establishment_name);
        establishmentNameTextView.setText(currentResult.getNameOfEstablishment());

        //Location the TextView
        TextView establishmentLocationTextView = (TextView) listItemView.findViewById(R.id.establishment_location);
        establishmentLocationTextView.setText(currentResult.getEstablishmentLocation());

        //Find the contact
        TextView establishmnetContactTextView = (TextView) listItemView.findViewById(R.id.establishment_contact);
        establishmnetContactTextView.setText(currentResult.getEstablishmentContact());

        //Find the image of the establishment in the tEXTvIEW
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentResult.getmImageResourceId());

        //Theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        //Find color for resource id
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        //Set background of text container
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
