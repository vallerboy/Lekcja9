package pl.akademiakodu.lekcja5;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemSelected;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener{


    @BindView(R.id.spinner)
    Spinner spinner;

    List<String> ourList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ourList = new ArrayList<String>();

        spinner.setOnItemSelectedListener(this);

        loadFakeData();

        ArrayAdapter<String> ourAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ourList);
        ourAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinner.setAdapter(ourAdapter);

    }

    private void loadFakeData() {
        ourList.add("Pozycja 1");
        ourList.add("Pozycja 2");
        ourList.add("Pozycja 3");
        ourList.add("Pozycja 4");
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

//    @OnItemSelected(R.id.spinner)
//    public void clickedItem(Spinner spinner, int position){
//
//    }
}
