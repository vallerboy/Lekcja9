package pl.akademiakodu.lekcja5;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemSelected;

public class MainActivity extends Activity{


    @BindView(R.id.webView)
    WebView webView;

    @BindView(R.id.textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() {
            @Override
            public boolean handleMessage(Message msg) {
                if(msg.what == 0) {
                 
                }
                return false;
            }
        });


        webView.addJavascriptInterface(new WebInterface(this), "Android");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://projekt.techloft.pl/akademiakodu/");



    }


    public void changeText(String text){



      //  textView.setText(text);
    }


}
