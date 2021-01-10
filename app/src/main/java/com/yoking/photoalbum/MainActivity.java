    package com.yoking.photoalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
            private final Integer img_id[]={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five};
            int click=0;
        public Integer getImageId(int click){
            return img_id[click];
        }
        public void onNextClick(View view){
            ImageView img=findViewById(R.id.slides);
            click++;
            if(click==5)
                click=0;
            int rid=getImageId(click);
            img.setImageResource(rid);
        }
        public void onPrevClick(View view){
            ImageView img=findViewById(R.id.slides);
            if(click==0)
                click=5;
            click--;
            int rid=getImageId(click);
            img.setImageResource(rid);
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}