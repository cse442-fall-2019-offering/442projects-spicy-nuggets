package com.example.androidsurvey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Questions Question = new Questions();

    private TextView QuestionView;
    private Button Back;
    private Button Button1;
    private Button Button2;
    private Button Button3;
    private Button Button4;
    public int QuestionNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QuestionView = (TextView)findViewById(R.id.question);
        Button1 = (Button)findViewById(R.id.answer1);
        Button2 = (Button)findViewById(R.id.answer2);
        Button3 = (Button)findViewById(R.id.answer3);
        Button4 = (Button)findViewById(R.id.answer4);
        Back = (Button)findViewById(R.id.Back);
        QuestionView.setText(Question.getQuestion(QuestionNum));
        Button1.setText(Question.getAnswer(QuestionNum,0));
        Button2.setText(Question.getAnswer(QuestionNum,1));
        Button3.setText(Question.getAnswer(QuestionNum,2));
        Button4.setText(Question.getAnswer(QuestionNum,3));

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextQuestion(QuestionNum);
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextQuestion(QuestionNum);
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextQuestion(QuestionNum);
            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextQuestion(QuestionNum);
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lastQuestion();
            }
        });
    }

    private void nextQuestion(int a){
        QuestionNum++;
        a++;
        if(a !=4){
            QuestionView.setText(Question.getQuestion(a));
            Button1.setText(Question.getAnswer(a, 0));
            Button2.setText(Question.getAnswer(a, 1));
            Button3.setText(Question.getAnswer(a, 2));
            Button4.setText(Question.getAnswer(a, 3));
        }
        else {
            finish();
        }
    }
    private void lastQuestion(){
        if(QuestionNum != 0){
            QuestionNum--;
            QuestionView.setText(Question.getQuestion(QuestionNum));
            Button1.setText(Question.getAnswer(QuestionNum,0));
            Button2.setText(Question.getAnswer(QuestionNum,1));
            Button3.setText(Question.getAnswer(QuestionNum,2));
            Button4.setText(Question.getAnswer(QuestionNum,3));
        }else {
            finish();
        }


    }
}


