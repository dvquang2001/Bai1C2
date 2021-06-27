package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.bai1c2.R;
import com.example.model.TruongHoc;

public class TruongHocAdapter extends ArrayAdapter<TruongHoc> {
    Activity context;
    int resource;
    public TruongHocAdapter(@NonNull Activity context, int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = this.context.getLayoutInflater().inflate(this.resource,null);
        ImageView imgHinh = view.findViewById(R.id.imgHinh);
        TextView txtTen = view.findViewById(R.id.txtTenTruong);
        TextView txtDiaChi = view.findViewById(R.id.txtDiaChi);
        TruongHoc truongHoc = getItem(position);
        imgHinh.setImageResource(truongHoc.getHinh());
        txtDiaChi.setText(truongHoc.getDiachi());
        txtTen.setText(truongHoc.getTen());
        return view;
    }
}
