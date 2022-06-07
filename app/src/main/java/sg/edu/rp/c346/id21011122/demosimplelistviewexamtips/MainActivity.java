package sg.edu.rp.c346.id21011122.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    String[] exampTipArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);

        exampTipArray = new String[5];
        exampTipArray[0] = "Don't just read the code, code it as much as possible during each practical session";
        exampTipArray[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        exampTipArray[2] = "Prepare your template source code for each topic";
        exampTipArray[3] = "Create a few empty Android projects to speed up your coding during the exam";
        exampTipArray[4] = "Ensure that your Android Studio is up and running before the exam";

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, exampTipArray);

        lvExamTips.setAdapter(adapter);
    }
}