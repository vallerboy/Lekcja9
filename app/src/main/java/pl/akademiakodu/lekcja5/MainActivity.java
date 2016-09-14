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


    @BindView(R.id.button2)
    public Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);






    }


    @OnClick(R.id.button2)
    public void onClick(View v) {
        createNotyfication();
    }


    @OnClick(R.id.button3)
    public void onClick1(View v) {
        createNotyficationBig();
    }


    private void createNotyfication(){
        Intent intent = new Intent(this, Main2Activity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);


        Notification notification = new NotificationCompat.Builder(this)
                .setContentTitle("Hello World!")
                .setContentText("Witaj AkademioKodu, przybywam!")
                .setTicker("Przyszła wiadomość...")
                .setSmallIcon(R.mipmap.ic_launcher)
                //.setLargeIcon(R.mipmap.ic_launcher)
                .setAutoCancel(false)

                .setContentIntent(pendingIntent).build();

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification);

        Log.e("noti", "działa!");

    }


    private void createNotyficationBig() {
        Intent intent = new Intent(this, Main2Activity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

        String[] strings = new String[3];
        strings[0] = "Coś nowego";
        strings[1] = "Coś starego";
        strings[2] = "AkademiaKodu.pl";

        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
        inboxStyle.setBigContentTitle("Wiadomości: ");

        for (int i = 0; i < strings.length; i++) {
            inboxStyle.addLine(strings[i]);
        }

        Notification notification = new NotificationCompat.Builder(this)
                .setContentTitle("Hello World!")
                .setContentText("Witaj AkademioKodu, przybywam!")
                .setTicker("Przyszła wiadomość...")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setAutoCancel(false)
                .setStyle(inboxStyle)
                .setContentIntent(pendingIntent).build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(1, notification);


    }

    }



