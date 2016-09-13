package pl.akademiakodu.lekcja5;

import android.util.Log;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by O on 2016-09-13.
 */
public class WebInterface {


    private MainActivity activity;

    public WebInterface(MainActivity activity){
        this.activity = activity;
    }

    @JavascriptInterface
    public void showToast(String text){
        Toast.makeText(activity, text, Toast.LENGTH_LONG).show();
    }

    @JavascriptInterface
    public void changeText(String text){
        activity.changeText(text);
        Log.e("handler", "odpałiło changeText");
    }




}
