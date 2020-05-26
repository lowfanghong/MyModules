package sg.edu.rp.c346_18021531.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView tvModuleCode, tvModuleName, tvAcademicYear,tvSemester ,
        tvModuleCredit,tvVenue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvModuleCode = findViewById(R.id.textView3);
        tvModuleName = findViewById(R.id.textView4);
        tvAcademicYear = findViewById(R.id.textView5);
        tvSemester = findViewById(R.id.textView6);
        tvModuleCredit = findViewById(R.id.textView7);
        tvVenue = findViewById(R.id.textView8);
        Intent intentReceived = getIntent();
        String Question[] = intentReceived.getStringArrayExtra("Module");
          tvModuleCode.setText("Module Code: " + Question[0]);
          tvModuleName.setText("Module Name: " + Question[1]);
          tvAcademicYear.setText("Academic Year: " + Question[2]);
          tvSemester.setText("Semester: " + Question[3]);
          tvModuleCredit.setText("Module credit: " + Question[4]);
          tvVenue.setText("Venue: " + Question[5]);
        }


    }

