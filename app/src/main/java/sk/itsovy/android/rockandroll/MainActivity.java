package sk.itsovy.android.rockandroll;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonRoll;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRoll = findViewById(R.id.button_roll);
        mediaPlayer = MediaPlayer.create(this, R.raw.sound);
        //mediaPlayer.setLooping(true);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.release();
    }

    public void roll(View view) {
        Random random = new Random();
        int number = random.nextInt(6) + 1;
        // musime dat string, int by hladal medzi resources v triede R
        buttonRoll.setText(String.valueOf(number));
    }

    public void rock(View view) {
        mediaPlayer.start();
    }
}