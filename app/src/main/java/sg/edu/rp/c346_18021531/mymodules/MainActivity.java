package sg.edu.rp.c346_18021531.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC346, tvC349;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   tvC346 = findViewById(R.id.textView);
   tvC349 = findViewById(R.id.textView2);
    String[] array1 = {"C346","Android Programming","2020","1","4","W66M"};

    tvC346.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String[] array1 = {"C346","Android Programming","2020","1","4","W66M"};
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("Module", array1);

            startActivity(intent);
        }
    });
        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] array2 = {"C349","IPad programming","2020","1","4","E63B"};
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("Module", array2);

                startActivity(intent);
            }
        });


    }
}
