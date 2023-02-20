package com.example.ashishapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class Questions extends AppCompatActivity {

   TextView txt_name,txt_questions,txt_score;
   Button btn1;
   RadioButton rb1,rb2,rb3,rb4;
   RadioGroup rg;

   String[] ques={"Which class does not override the equals() and hashCode() methods, inheriting them directly from class Object",
           "Which collection class allows you to grow or shrink its size and provides indexed access to its elements, but whose methods are not synchronized",
           "You need to store elements in a collection that guarantees that no duplicates are stored and all elements can be accessed in natural order. Which interface provides that capability",
           "Which interface does java.util.Hashtable implement",
           "Which interface provides the capability to store objects using a key-value pair",
           "Which collection class allows you to associate its elements with key values, and allows you to retrieve objects in FIFO (first-in, first-out) sequence",
           "Which collection class allows you to access its elements by associating a key with an element's value, and provides synchronization",
           "Which of the following are not Java reserved words",
           "Which of the following will directly stop the execution of a Thread?",
           "Which will contain the body of the thread"
            };

   String[] option={"java.lang.String", "java.lang.Double" , "java.lang.StringBuffer", "java.lang.Character",
              "java.util.HashSet", "java.util.LinkedHashSet","java.util.List", "java.util.ArrayList",
               "java.util.Map" ,	"java.util.Set" ,"java.util.List ","java.util.Collection",
              "Java.util.Map","Java.util.List" ,"Java.util.HashTable" ,"Java.util.Collection",
               "Java.util.Map","Java.util.Set","Java.util.List","Java.util.Collection",
               "java.util.ArrayList" ,"java.util.LinkedHashMap","java.util.HashMap" ,"java.util.TreeMap",
                "java.util.SortedMap","java.util.TreeMap","java.util.TreeSet" ,"java.util.Hashtable",
               "run", "import"   ," default", " implements",
                "wait()","notify()","notifyall()","exits synchronized code",
                "run()","start()","stop()","main()"
       };


    String[] answer={"java.lang.StringBuffer",
           "java.util.ArrayList",
           "java.util.Set",
           "Java.util.Map",
           "java.util.Map",
           "java.util.LinkedHashMap",
            "java.util.Hashtable",
            "run",
            "wait()",
            "run()"
   };
    int flag=0;
    public static int mark=0, correct=0,wrong=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        //binding
        txt_name=(TextView) findViewById(R.id.txt_name);
        txt_questions=(TextView) findViewById(R.id.txt_questions);
        rg= (RadioGroup)findViewById(R.id.rg) ;
        rb1=(RadioButton) findViewById(R.id.rb1);
        rb2=(RadioButton) findViewById(R.id.rb2);
        rb3=(RadioButton) findViewById(R.id.rb3);
        rb4=(RadioButton) findViewById(R.id.rb4);
        btn1=(Button) findViewById(R.id.btn1);
        //get name from main activity
        txt_name.setText(getIntent().getStringExtra("myName"));
        txt_questions.setText(ques[flag]);
        rb1.setText(option[0]);
        rb2.setText(option[1]);
        rb3.setText(option[2]);
        rb4.setText(option[3]);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rg.getCheckedRadioButtonId()==-1){
                    Toast.makeText(Questions.this, "Please select your answer", Toast.LENGTH_SHORT).show();
                    return;
                }
               RadioButton choosenOption= (RadioButton) findViewById(rg.getCheckedRadioButtonId());//here we get the id of choosen option
                String textAns=choosenOption.getText().toString();//here we get the text of answer
                if(textAns.equals(answer[flag])){
                    correct++;
                }
                else{
                    wrong++;
                }
                rg.clearCheck();
                flag++;
                //here set the next question and option
                if(flag<ques.length){
                    txt_questions.setText(ques[flag]);
                    rb1.setText(option[flag*4]);
                    rb2.setText(option[flag*4+1]);
                    rb3.setText(option[flag*4+2]);
                    rb4.setText(option[flag*4+3]);
                }
                else{
                    mark=correct;
                    Intent intent=new Intent(getApplicationContext(), Result.class);
                    startActivity(intent);
                    finish();
                }


            }
        });


    }


}
