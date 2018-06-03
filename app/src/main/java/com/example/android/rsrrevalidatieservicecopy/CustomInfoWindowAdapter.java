package com.example.android.rsrrevalidatieservicecopy;


import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {

    private View popup = null;
    private LayoutInflater inflater = null;

    public CustomInfoWindowAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    private void endowWindowText(Marker marker, View view) {
        String title = marker.getTitle();
        TextView tvTitle = view.findViewById(R.id.text_location);

        if (!title.equals("")) {
            tvTitle.setText(title);
        }

        String addressInfo = marker.getTitle();
        TextView tvAddress = view.findViewById(R.id.address_info);

        if (!addressInfo.equals("")) {
            tvAddress.setText(addressInfo);
        }

        String rememberLocation = marker.getTitle();
        TextView tvAddressHint = view.findViewById(R.id.remember_location);

        if (!rememberLocation.equals("")) {
            tvAddressHint.setText(rememberLocation);
        }
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
