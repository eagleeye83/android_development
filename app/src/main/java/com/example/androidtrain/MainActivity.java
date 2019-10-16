package com.example.androidtrain;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    public int k=0;
    public int i= R.drawable.bgyellow5;
    public int j= R.drawable.bgred5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RelativeLayout rlayout = findViewById(R.id.layout1);
        final ImageView train1 = findViewById(R.id.train1);
        final ImageView train2 = findViewById(R.id.train2);
        final ImageView man = findViewById(R.id.man);

        System.out.println("i am runing");
        rlayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                rlayout.setBackgroundResource(j);
                k=i;
                i=j;
                j=k;

            }
        });

        ObjectAnimator myanimation1 = new ObjectAnimator().ofFloat(train1,"x",1200,-1200);
        myanimation1.setDuration(10000);
        myanimation1.setRepeatCount(ObjectAnimator.INFINITE);
        myanimation1.setRepeatMode(ObjectAnimator.RESTART);
//        AnimatorSet myanimationset
        myanimation1.start();
//





    }
}
