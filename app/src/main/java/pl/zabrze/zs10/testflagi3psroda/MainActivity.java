package pl.zabrze.zs10.testflagi3psroda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dobraOdp(View view) {
        int idButton = view.getId();
        Button button = findViewById(idButton);
        button.setVisibility(View.INVISIBLE);
    }
}