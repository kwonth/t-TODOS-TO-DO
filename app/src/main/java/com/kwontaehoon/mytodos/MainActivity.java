package com.kwontaehoon.mytodos;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextID, editTextPassword;
    Button btnNext;
    SharedPreferences sharedPref;
    String packageName = "com.kwontaehoon.mytodos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextID = (EditText) findViewById(R.id.editTextID);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        btnNext = (Button) findViewById(R.id.btnNext);

        sharedPref = this.getSharedPreferences(packageName, Context.MODE_PRIVATE);
        //id라는 키가 존재하면 가져와라, 없으면 빈 칸으로 셋팅해자
        String id = sharedPref.getString("id", "");
        String pw = sharedPref.getString("pw", "");
        editTextID.setText(id);
        editTextPassword.setText(pw);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String correct_id = "null";
                String correct_pw = "097654321";
                String id = editTextID.getText().toString();
                String pw = editTextPassword.getText().toString();

                if(!id.equals(correct_id)){
                    Toast.makeText(getApplicationContext(),
                            "Wrong ID", Toast.LENGTH_SHORT).show();
                } else if(!pw.equals(correct_pw)){
                    Toast.makeText(getApplicationContext(),
                            "Wrong Password", Toast.LENGTH_SHORT).show();
                } else {
                    loginSuccess(correct_id, correct_pw);
                }


            }
        });


    }
    public void loginSuccess(String correct_id, String correct_pw ) {
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("id", correct_id);
        editor.putString("pw", correct_pw);
        editor.commit();

        Activity fromActivity = MainActivity.this;
        Class toActivity = TodoActivity.class;
        Intent intent = new Intent(fromActivity, toActivity);
        intent.putExtra("message", correct_id);
        startActivity(intent);

    }

}
