package com.example.mybasicapplicaiton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Button variable
    Button buttonPressed;

    Button btn_clear;

    // Text view variables
    TextView text;

    EditText Textfield1 , Textfield2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the id from the textview
        text = findViewById(R.id.text);

        // set text to whatever you like
        text.setText("Input 1");


        // find the buttton id
        buttonPressed= findViewById(R.id.button);
        buttonPressed.setOnClickListener(this);

        btn_clear = findViewById(R.id.button1);
        btn_clear.setOnClickListener(this);

        Textfield1 = findViewById(R.id.input1);
        Textfield2 = findViewById(R.id.input2);
        result = findViewById(R.id.result);


    }
    @Override
    public void onClick(View v) {

       if(v.getId()==R.id.button){
           // find the buttton id
           buttonPressed= findViewById(R.id.button);

           // get the id from the textview
           Textfield1 = findViewById(R.id.input1);
           Textfield2 = findViewById(R.id.input2);


           double num1 = Double.parseDouble(Textfield1.getText().toString());
           double num2 = Double.parseDouble(Textfield2.getText().toString());


           double add = num1+ num2;

           result.setText(""+ add);


       }
       else if (v.getId()==R.id.button1) {
           AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
           alertDialog.setTitle("Alert Dialog");
           alertDialog.setMessage("You can now input new value.");


           alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int which) {
                   Toast.makeText(getApplicationContext(), "You clicked on OK", Toast.LENGTH_SHORT).show();
               }
           });

           alertDialog.show();
           result.setText("");
           Textfield1.setText("");
           Textfield2.setText("");




       }
    }
}