package com.example.hoaqua;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HoaQuaAdapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<HoaQua> arrayList;

    public HoaQuaAdapter(Context context, int layout, ArrayList<HoaQua> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(layout,viewGroup,false);
        TextView txtName = view.findViewById(R.id.txtName);
        TextView txtMota = view.findViewById(R.id.txtMota);
        ImageView img = view.findViewById(R.id.img);
        CheckBox checkBox = view.findViewById(R.id.ckButton);
        HoaQua temp = arrayList.get(i);

        txtName.setText(temp.getName());
        txtMota.setText(temp.getMota());

        return view;
    }
}
