package com.example.learningrecyclerview.detail;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.learningrecyclerview.R;

public class DetailPemesanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = findViewById(R.id.img_detail_pemesanan);
        TextView tvNameFood = findViewById(R.id.tv_name_food_pemesanan);
        TextView tvJmlFood = findViewById(R.id.tv_jml_pemesanan);

        Glide.with(this).load(getIntent().getStringExtra("img")).into(imageView);
        tvNameFood.setText(getIntent().getStringExtra("name_food"));
        tvJmlFood.setText(getIntent().getStringExtra("jumlah"));

        Button button = findViewById(R.id.btn_pesan);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showStruck(getIntent().getStringExtra("name_buyer"),
                        getIntent().getStringExtra("name_food"),
                        Integer.parseInt(getIntent().getStringExtra("jumlah")),
                        Integer.parseInt(getIntent().getStringExtra("price_food")));
            }
        });
    }

    public void showStruck(String nameBuyer,String nameFood,int jml,int price){
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(DetailPemesanan.this);
        alertBuilder.setTitle("Struk Pembelian");

        TextView txtNameBuyer = new TextView(DetailPemesanan.this);
        txtNameBuyer.setTop(20);
        txtNameBuyer.setText("Nama Pembeli "+nameBuyer);

        TextView txtNameFood = new TextView(DetailPemesanan.this);
        txtNameFood.setTop(20);
        txtNameFood.setText("Nama Makanan "+nameFood);

        TextView txtJmlFood = new TextView(DetailPemesanan.this);
        txtJmlFood.setText("jumlah dipesan "+String.valueOf(jml));

        String resultPrice = String.valueOf(price * jml);

        TextView tvResult = new TextView(DetailPemesanan.this);
        tvResult.setText("total harga "+resultPrice);

        LinearLayout layout = new LinearLayout(DetailPemesanan.this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(16,16,16,16);

        layout.addView(txtNameBuyer);
        layout.addView(txtNameFood);
        layout.addView(txtJmlFood);
        layout.addView(tvResult);

        alertBuilder.setView(layout);
        AlertDialog alertDialog = alertBuilder.create();
        alertDialog.show();
    }
}
