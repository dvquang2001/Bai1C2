package com.example;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import com.example.adapter.TruongHocAdapter;
import com.example.bai1c2.R;
import com.example.model.TruongHoc;

import java.util.ArrayList;

public class MyListFragment extends ListFragment implements AdapterView.OnItemClickListener {
    TruongHocAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment,null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        adapter = new TruongHocAdapter(getActivity(),R.layout.item);
        adapter.add(new TruongHoc(R.drawable.bach_khoa,"Bach Khoa University","Số 1, Đại Cồ Việt, Hai Bà Trưng, Hà Nội, Hanoi"));
        adapter.add(new TruongHoc(R.drawable.f_bu,"Dai hoc Tai chinh - Ngan hang","136 Phạm Văn Đồng, Hanoi"));
        adapter.add(new TruongHoc(R.drawable.n_eu,"Dai Hoc Kinh te quoc dan","Số 207 - Đường Giải Phóng - Quận Hai Bà Trưng, Hanoi"));
        adapter.add(new TruongHoc(R.drawable.ngoai_thuong,"Dai hoc Ngoai Thuong"," 91 Chua Lang Street, Dong Da District, Ha Noi City"));
        adapter.add(new TruongHoc(R.drawable.une_ti,"UNETI","218 Linh Nam,Hoang Mai,Hanoi"));
        adapter.add(new TruongHoc(R.drawable.vn_u,"Dai hoc quoc gia Ha Noi"," 144 đường Xuân Thủy, Quận Cầu Giấy, Hà Nội, Việt Nam, Hanoi"));
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(),"Ten: "+adapter.getItem(position).getTen()+"\nDia chi: "+adapter.getItem(position).getDiachi(),Toast.LENGTH_LONG).show();
    }
}
