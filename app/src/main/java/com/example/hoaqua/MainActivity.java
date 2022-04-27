package com.example.hoaqua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edtTen, edtMota;
    Button btnAdd, btnView, btnUpdate;
    ListView listView;
    database db;
    ArrayList<HoaQua> arrayList;
    HoaQuaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Add();
            }
        });
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtTen.setText(null);
                edtMota.setText(null);
            }
        });
    }

    private void Add() {
        String name = edtTen.getText().toString();
        String mota = edtMota.getText().toString();

        if(name.isEmpty() || mota.isEmpty()){
            Toast.makeText(this,"Du lieu khong hop le",Toast.LENGTH_LONG).show();
        }
        arrayList = new ArrayList<>();
        HoaQua temp = new HoaQua(name, mota);
        arrayList.add(temp);
        adapter = new HoaQuaAdapter(this,R.layout.item,arrayList);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        Toast.makeText(this,"Them thanh cong", Toast.LENGTH_LONG).show();

    }

    private void AnhXa() {
        edtTen = findViewById(R.id.edtName);
        edtMota = findViewById(R.id.edtChitiet);
        btnAdd = findViewById(R.id.btnAdd);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnView = findViewById(R.id.btnView);
        listView = findViewById(R.id.lvTT);

    }
}