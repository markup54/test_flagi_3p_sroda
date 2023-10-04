package pl.zabrze.zs10.testflagi3psroda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int punkty =10;
    private int klikniete =0;
    private TextView textView;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textViewPolecenie);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dobraOdp(v);
                    }
                }
        );
    }

    public void dobraOdp(View view) {
        int idButton = view.getId();
        Button button = findViewById(idButton);
        button.setVisibility(View.INVISIBLE);
        klikniete++;
        if(klikniete == 4){
            textView.setText("Gratulacje, otrzymano flagę Polski oraz"+punkty+" punktów");
        }
    }

    public void zlaOdp(View view) {
        Toast.makeText(MainActivity.this,
                R.string.komunikat,
                Toast.LENGTH_SHORT)
                .show();
        if(punkty>0) {
            punkty = punkty - 5;
        }
    }
}