package kr.ac.ssu.kjminn.mirimratingbartest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar1, ratingBar2, ratingBar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar1 = findViewById(R.id.rating_bar1);
        ratingBar2 = findViewById(R.id.rating_bar2);
        ratingBar3 = findViewById(R.id.rating_bar3);
        Button btnIncr = findViewById(R.id.btn_incr);
        Button btnDecr = findViewById(R.id.btn_decr);
        btnIncr.setOnClickListener(btnListener);
        btnDecr.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_incr:
                    ratingBar1.setRating(ratingBar1.getRating() + ratingBar1.getStepSize());
                    ratingBar2.setRating(ratingBar2.getRating() + ratingBar2.getStepSize());
                    ratingBar3.setRating(ratingBar3.getRating() + ratingBar3.getStepSize());
                    break;
                case R.id.btn_decr:
                    ratingBar1.setRating(ratingBar1.getRating() - ratingBar1.getStepSize());
                    ratingBar2.setRating(ratingBar2.getRating() - ratingBar2.getStepSize());
                    ratingBar3.setRating(ratingBar3.getRating() - ratingBar3.getStepSize());
                    break;
            }
        }
    };
}