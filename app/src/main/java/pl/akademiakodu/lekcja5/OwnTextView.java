package pl.akademiakodu.lekcja5;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class OwnTextView extends TextView {


//  public OwnTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }

    public OwnTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public OwnTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public OwnTextView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context con){
        Typeface font = Typeface.createFromAsset(con.getAssets(), "fonts/arundinab.ttf");
        setTypeface(font);
    }
}
