package com.example.learningrecyclerview.detail;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.learningrecyclerview.R;

public class DetailActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView imageView = findViewById(R.id.img_detail);
        TextView textViewNameDetail = findViewById(R.id.txt_name_detail);
        TextView textViewDescDetail = findViewById(R.id.txt_detail_desc);
        TextView textViewPriceDetail = findViewById(R.id.txt_price_detail);

        Glide.with(this).load(getIntent().getStringExtra("image")).into(imageView);
        textViewNameDetail.setText(getIntent().getStringExtra("name"));
        textViewDescDetail.setText(getIntent().getStringExtra("desc"));
        textViewPriceDetail.setText("Rp. "+getIntent().getStringExtra("price"));

        final Button button = findViewById(R.id.btn_pesan_detail);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createLayoutAlert();
            }
        });
    }

    public void createLayoutAlert(){
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(DetailActivity.this);
        LinearLayout layout = new LinearLayout(DetailActivity.this);
        layout.setPadding(16,16,16,16);
        layout.setOrientation(LinearLayout.VERTICAL);
        final EditText edtNama = new EditText(DetailActivity.this);
        edtNama.setHint("Masukan Nama pembeli");
        final EditText edtJml = new EditText(DetailActivity.this);
        edtJml.setHint("Masukan jumlahnya");
        edtJml.setInputType(InputType.TYPE_CLASS_NUMBER);
        layout.addView(edtNama);
        layout.addView(edtJml);
        alertDialog.setTitle("Form Pembelian");
        alertDialog.setView(layout);
        alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(DetailActivity.this,DetailPemesanan.class);
                intent.putExtra("img",getIntent().getStringExtra("image"));
                intent.putExtra("name_food",getIntent().getStringExtra("name"));
                intent.putExtra("price_food",getIntent().getStringExtra("price"));
                intent.putExtra("name_buyer",edtNama.getText().toString());
                intent.putExtra("jumlah",edtJml.getText().toString());
                startActivity(intent);
            }
        });
        alertDialog.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog1 = alertDialog.create();
        alertDialog1.show();
    }
}
