package sk.itsovy.android.rockandroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRoll = findViewById(R.id.button_roll);
    }

    public void roll(View view) {
        Random random = new Random();
        int number = random.nextInt(6) + 1;
        // musime dat string, int by hladal medzi resources v triede R
        buttonRoll.setText(String.valueOf(number));
    }
}