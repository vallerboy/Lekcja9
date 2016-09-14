package pl.akademiakodu.lekcja5;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemSelected;

public class MainActivity extends Activity {




    private IntentFilter filter = new IntentFilter("android.provider.Telephony.SMS_RECRIVED");

    private BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
          @Override
          public void onReceive(Context context, Intent intent) {
              Toast.makeText(context, "Przyszło do mnie coś!", Toast.LENGTH_LONG).show();
          }
      };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        // Zarejestruj broadcasta
        registerReceiver(broadcastReceiver, filter);


        // Wyślij powiadomienie
        Intent i = new Intent();
        i.setAction("showToastAkademiaKodu");
        sendBroadcast(i);

    }


    @Override
    public void onStop(){
        super.onStop();

        // Nie zapomnij odrejestrować!
        unregisterReceiver(broadcastReceiver);
    }

    @Override
    public void onStart(){
        super.onStart();
    }


    }










