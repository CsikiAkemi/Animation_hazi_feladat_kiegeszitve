package hu.szoftie.a20211206;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView kep = findViewById(R.id.imgView);
        Button btnBlink = findViewById(R.id.btnBlink);
        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink);
                kep.startAnimation(animation);
            }
        });

        Button btnRotate = findViewById(R.id.btnRotate);
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                kep.startAnimation(animation);
            }
        });

        Button btnMove = findViewById(R.id.btnMove);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.move);
                kep.startAnimation(animation);
            }
        });
        Button btnSlide = findViewById(R.id.btnSlide);
        btnSlide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide);
                kep.startAnimation(animation);
            }
        });
        Button btnZoom = findViewById(R.id.btnZoom);
        btnZoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom);
                kep.startAnimation(animation);
            }
        });
        Button btnStop = findViewById(R.id.btnStop);
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                kep.clearAnimation();
            }
        });

         Button btnFadeIn =findViewById(R.id.btnFadeIn);
         btnFadeIn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Animation animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                 kep.startAnimation(animFadeIn);
             }
         });
        Button btnFadeOut =findViewById(R.id.btnFadeOut);
        btnFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
                kep.startAnimation(animFadeOut);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom);
        //MainActivity.this.startAnimation(animation);
    }
}