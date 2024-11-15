package ru.netology.toast;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void buttonClicked1(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Привет, я Коржик", Toast.LENGTH_LONG);
        myToast.show();
    }

    public void buttonClicked2(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Привет, я Карамелька", Toast.LENGTH_LONG);
        myToast.show();
    }

    public void buttonClicked3(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Привет, я Компот", Toast.LENGTH_LONG);
        myToast.show();
    }
}