package vn.codefresher.translate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showWelcomeToast();
    }

    private void showWelcomeToast(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Context context = MainActivity.this;
                Toast.makeText(context, context.getString(R.string.welcome_text), Toast.LENGTH_LONG)
                        .show();
            }
        }, 3000);
    }
}