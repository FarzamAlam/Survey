package com.example.android.survey;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import static android.R.attr.id;
import static android.R.attr.onClick;
import static android.R.id.message;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button send=(Button)findViewById(R.id.submit);


      send.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                EditText editTextMessage=(EditText)findViewById(R.id.Answer5);
                String message=editTextMessage.getText().toString();


                String to="chorinsan53@gmail.com";
                String subject="Bussiness Survey";


                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);

                //need this to prompts email client only
                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "Choose an Email client :"));

            }

        });

    }


    public void answerTwo(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()){
            case R.id.Answer2_a:
                if (checked) {

                    String message = "Very Satisfied";
                }
                    case R.id.Answer2_b:
                        if (checked) {
                            String message = "Very Satisfied";
                        }
                            case R.id.Answer2_c:
                                if (checked) {
                                    String message = "Very Satisfied";
                                }
                                    case R.id.Answer2_d:
                                        if (checked) {
                                            String message = "Very Satisfied";
                                        }



        }
    }
    public void answerThree(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()){
            case R.id.Answer3_a:
                if (checked) {

                    String message = "Very Satisfied";
                }
            case R.id.Answer3_b:
                if (checked) {
                    String message = "Very Satisfied";
                }
            case R.id.Answer3_c:
                if (checked) {
                    String message = "Very Satisfied";
                }
            case R.id.Answer3_d:
                if (checked) {
                    String message = "Very Satisfied";
                }



        }
    }

    public void answerFour(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()){
            case R.id.Answer4_a:
                if (checked) {

                    String message = "Very Satisfied";
                }
            case R.id.Answer4_b:
                if (checked) {
                    String message = "Very Satisfied";
                }
            case R.id.Answer4_c:
                if (checked) {
                    String message = "Very Satisfied";
                }
            case R.id.Answer4_d:
                if (checked) {
                    String message = "Very Satisfied";
                }



        }
    }
}
