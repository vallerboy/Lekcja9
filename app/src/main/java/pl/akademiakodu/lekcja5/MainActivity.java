package pl.akademiakodu.lekcja5;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemSelected;

public class MainActivity extends Activity{


    @BindView(R.id.frameLayout)
    FrameLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        if(savedInstanceState == null) {
            FragmentManager fragmentManager = this.getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.add(R.id.frameLayout, new BlankFragment());
            ft.commit();


         //   Fragment fragment = fragmentManager.findFragmentById(R.id.frameLayout);
        //    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
         //   fragmentTransaction.remove(fragment);

        //    BlankFragment fragment1 = (BlankFragment) getFragmentManager().findFragmentById(R.id.ourFragment);

         //    if(fragment1 == null || fragment1.isInLayout()) {

        //     }

            //ft.replace();
            //ft.remove();
        }


    }


    }



