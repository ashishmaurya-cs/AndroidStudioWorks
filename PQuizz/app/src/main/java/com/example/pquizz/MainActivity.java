package com.example.pquizz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1,answer2,answer3,answer4;
    TextView score,question,mfinalScore;

    private Questions mQuestions=new Questions();

    private String mAnswer;
    public static  int  mscore=0;
    private int questionlength=mQuestions.mQuestions.length;
    private int mQuestionsLength=questionlength/questionlength-1;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        r=new Random();
        answer1=(Button)findViewById(R.id.answer1);
        answer2=(Button)findViewById(R.id.answer2);
        answer3=(Button)findViewById(R.id.answer3);
        answer4=(Button)findViewById(R.id.answer4);

        score=(TextView) findViewById(R.id.score);
        question=(TextView) findViewById(R.id.question);
        mfinalScore=(TextView)  findViewById(R.id.finalScore);
        score.setText("score: "+mscore);
        updateQuestion(mQuestionsLength);
        if(mQuestionsLength<questionlength){
            answer1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(answer1.getText()==mAnswer){
                        mscore++;
                        mQuestionsLength++;
                        score.setText("score: "+mscore);
                        updateQuestion(mQuestionsLength);
                    }else
                    {
                        gameOver();
                    }
                }
            });

            answer2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(answer2.getText()==mAnswer){
                        mscore++;
                        mQuestionsLength++;
                        score.setText("score: "+mscore);
                        updateQuestion(mQuestionsLength);
                    }else
                    {
                        gameOver();
                    }
                }
            });

            answer3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(answer3.getText()==mAnswer){
                        mscore++;
                        mQuestionsLength++;
                        score.setText("score: "+mscore);
                        updateQuestion(mQuestionsLength);
                    }else
                    {
                        gameOver();
                    }
                }
            });

            answer4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(answer4.getText()==mAnswer){
                        mscore++;
                        mQuestionsLength++;
                        score.setText("score: "+mscore);
                        updateQuestion(mQuestionsLength);
                    }else
                    {
                        gameOver();
                    }
                }
            });

        }
        else{
//            Intent intent =new Intent(this,Welcome.class);
//            intent.putExtra("score",mscore);
//            startActivity(intent);`
//            finish();
                mfinalScore.setText(mscore);
        }
    }

    private void updateQuestion(int num){
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer=mQuestions.getCorrectAnswer(num);
    }

    private void gameOver()
    {
        AlertDialog.Builder alterDialogBuilder=new AlertDialog.Builder(MainActivity.this);
        alterDialogBuilder
                .setTitle("Quizz")
                .setMessage("Game over!Your Score is"+mscore+"points")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            }
                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });

    }
}
