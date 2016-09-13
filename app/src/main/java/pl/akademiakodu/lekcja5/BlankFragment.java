package pl.akademiakodu.lekcja5;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class BlankFragment extends Fragment {

    @BindView(R.id.button)
    Button button;


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        ButterKnife.bind(this, v);

        return v;
    }

    @OnClick(R.id.button)
    public void onClick(View v){
        Toast.makeText(this.getActivity(), "Działa", Toast.LENGTH_LONG).show();
    }

}
