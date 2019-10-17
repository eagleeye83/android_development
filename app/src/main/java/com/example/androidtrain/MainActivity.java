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
        final ImageView cloud1 = findViewById(R.id.cloud1);
        final ImageView cloud2 = findViewById(R.id.cloud2);
        final ImageView cloud3 = findViewById(R.id.cloud3);
        final ImageView man1 = findViewById(R.id.man1);
        final ImageView man2 = findViewById(R.id.man2);
        final ImageView man3= findViewById(R.id.man3);
        final ImageView man4= findViewById(R.id.man4);

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
        myanimation1.setDuration(30000);
        myanimation1.setRepeatCount(ObjectAnimator.INFINITE);
        myanimation1.setRepeatMode(ObjectAnimator.RESTART);
        ObjectAnimator myanimation2 = new ObjectAnimator().ofFloat(train2,"x",-1000,1000);
        myanimation2.setDuration(20000);
        myanimation2.setRepeatCount(ObjectAnimator.INFINITE);
        myanimation2.setRepeatMode(ObjectAnimator.RESTART);
        ObjectAnimator myanimation3 = new ObjectAnimator().ofFloat(cloud1,"x",800,-800);
        myanimation3.setDuration(30000);
        myanimation3.setRepeatCount(ObjectAnimator.INFINITE);
        myanimation3.setRepeatMode(ObjectAnimator.RESTART);
        ObjectAnimator myanimation4 = new ObjectAnimator().ofFloat(cloud2,"x",1000,-1000);
        myanimation4.setDuration(40000);
        myanimation4.setRepeatCount(ObjectAnimator.INFINITE);
        myanimation4.setRepeatMode(ObjectAnimator.RESTART);
        ObjectAnimator myanimation5 = new ObjectAnimator().ofFloat(man1,"x",-600,600);
        myanimation5.setDuration(10000);
        myanimation5.setRepeatCount(ObjectAnimator.INFINITE);
        myanimation5.setRepeatMode(ObjectAnimator.RESTART);
        ObjectAnimator myanimation6 = new ObjectAnimator().ofFloat(man2,"x",900,-900);
        myanimation6.setDuration(10000);
        myanimation6.setRepeatCount(ObjectAnimator.INFINITE);
        myanimation6.setRepeatMode(ObjectAnimator.RESTART);
        ObjectAnimator myanimation7 = new ObjectAnimator().ofFloat(man3,"x",-800,800);
        myanimation7.setDuration(10000);
        myanimation7.setRepeatCount(ObjectAnimator.INFINITE);
        myanimation7.setRepeatMode(ObjectAnimator.RESTART);
        ObjectAnimator myanimation8 = new ObjectAnimator().ofFloat(man4,"x",600,-600);
        myanimation8.setDuration(10000);
        myanimation8.setRepeatCount(ObjectAnimator.INFINITE);
        myanimation8.setRepeatMode(ObjectAnimator.RESTART);
        ObjectAnimator myanimation9 = new ObjectAnimator().ofFloat(cloud3,"x",800,-800);
        myanimation9.setDuration(70000);
        myanimation9.setRepeatCount(ObjectAnimator.INFINITE);
        myanimation9.setRepeatMode(ObjectAnimator.RESTART);
        AnimatorSet myanimationset =new AnimatorSet();
        myanimationset.playTogether(myanimation1,myanimation2,myanimation3,myanimation4,myanimation5,myanimation6,myanimation7,myanimation8,myanimation9);
//        myanimationset.setDuration(10000);
        myanimationset.start();
//





    }
}
