package com.example.pc.class_arem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetailActivity extends AppCompatActivity {
    //Explicit
    private TextView showTitleTextview , showDetailTextView;
    private ImageView showTrafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        //bind Widget
        bindWidget();

        //show Widget
        showWidget();

    } //onCreate
    private void bindWidget() {
        showTitleTextview = (TextView) findViewById(R.id.txtTitleDetail);
        showDetailTextView = (TextView)findViewById(R.id.txtDetail);
        showTrafficImageView = (ImageView) findViewById(R.id.imvTrafficDetail);
    } //bindWidget


    private void showWidget() {



        //Receive from Intent
        int intClick = getIntent().getIntExtra("click", 0);

        //show Title
        Mydata objMydata = new Mydata();
        String[] strTitle = objMydata.title();
        showTitleTextview.setText(strTitle[intClick]);

        //Show Traffic Image
        int[] intDrawable = objMydata.icon();
        showTrafficImageView.setImageResource(intDrawable[intClick]);



    } //show Widget
}