package com.example.listviewsecond;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    Button button;
    ListView listView;
    int ans;
    ArrayAdapter<String> aa;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();

        editText = findViewById(R.id.edit1);
        button = findViewById(R.id.btn1);
        listView = findViewById(R.id.list1);
//        aa = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);
//        listView.setAdapter(aa);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        // get the input number from editText
                        String string = editText.getText().toString();

                        // convert it to integer
                        int n = Integer.parseInt(string);

                        // build the logic for table
                        for (int i = 1; i <= 10; i++) {
                            ans = (i * n);

                            String result = String.valueOf(ans);

                            String result1 =   result.toString();
//                            String str  = result.getText().toString();

                            arrayList.add(result1);
                            listView.deferNotifyDataSetChanged();
                        }

                    aa = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);
                    listView.setAdapter(aa);
                }



        });

   }
}