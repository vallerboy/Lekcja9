package pl.akademiakodu.lekcja5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by O on 2016-09-14.
 */
public class BroadcastSMS extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Przyszło do mnie coś!", Toast.LENGTH_LONG).show();
    }
}

