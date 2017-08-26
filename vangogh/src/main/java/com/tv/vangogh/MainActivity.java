package com.tv.vangogh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.tv.vangogh.loader.ImageLoader;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageLoader imageLoader;
    String Url = "https://imgsa.baidu.com/exp/w=480/sign=1ff902bc93529822053338cbe7cb7b3b/b3119313b07eca803ce2079c922397dda04483e1.jpg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageloader_uri);
        imageLoader = new ImageLoader(this);
        imageLoader.bindBitmap(Url,imageView);
    }
}
