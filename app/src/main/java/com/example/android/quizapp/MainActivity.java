package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public RadioButton correctAnswer1, correctAnswer2, correctAnswer3,
            correctAnswer4, correctAnswer5, correctAnswer6, correctAnswer7,
            correctAnswer8, correctAnswer9, correctAnswer10, correctAnswer11,
            correctAnswer12, correctAnswer13, correctAnswer14, correctAnswer15,
            correctAnswer16, correctAnswer17, correctAnswer18, correctAnswer19,
            correctAnswer20, correctAnswer21, correctAnswer22, correctAnswer23,
            correctAnswer24, correctAnswer25, correctAnswer26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correctAnswer1 = (RadioButton) findViewById(R.id.q1a);
        correctAnswer2 = (RadioButton) findViewById(R.id.q2b);
        correctAnswer3 = (RadioButton) findViewById(R.id.q3a);
        correctAnswer4 = (RadioButton) findViewById(R.id.q4b);
        correctAnswer5 = (RadioButton) findViewById(R.id.q5b);
        correctAnswer6 = (RadioButton) findViewById(R.id.q6a);
        correctAnswer7 = (RadioButton) findViewById(R.id.q7a);
        correctAnswer8 = (RadioButton) findViewById(R.id.q8a);
        correctAnswer9 = (RadioButton) findViewById(R.id.q9c);
        correctAnswer10 = (RadioButton) findViewById(R.id.q10c);
        correctAnswer11 = (RadioButton) findViewById(R.id.q11c);
        correctAnswer12 = (RadioButton) findViewById(R.id.q12c);
        correctAnswer13 = (RadioButton) findViewById(R.id.q13c);
        correctAnswer14 = (RadioButton) findViewById(R.id.q14c);
        correctAnswer15 = (RadioButton) findViewById(R.id.q15b);
        correctAnswer16 = (RadioButton) findViewById(R.id.q16a);
        correctAnswer17 = (RadioButton) findViewById(R.id.q17b);
        correctAnswer18 = (RadioButton) findViewById(R.id.q18b);
        correctAnswer19 = (RadioButton) findViewById(R.id.q19a);
        correctAnswer20 = (RadioButton) findViewById(R.id.q20a);
        correctAnswer21 = (RadioButton) findViewById(R.id.q21a);
        correctAnswer22 = (RadioButton) findViewById(R.id.q22b);
        correctAnswer23 = (RadioButton) findViewById(R.id.q23c);
        correctAnswer24 = (RadioButton) findViewById(R.id.q24b);
        correctAnswer25 = (RadioButton) findViewById(R.id.q25c);
        correctAnswer26 = (RadioButton) findViewById(R.id.q26b);


    }

 //This method add score when the right answer is checked.
    public void checkAnswers(View view) {
        int score = 0;
        if (correctAnswer1.isChecked()) score += 1;
        if (correctAnswer2.isChecked()) score += 1;
        if (correctAnswer3.isChecked()) score += 1;
        if (correctAnswer4.isChecked()) score += 1;
        if (correctAnswer5.isChecked()) score += 1;
        if (correctAnswer6.isChecked()) score += 1;
        if (correctAnswer7.isChecked()) score += 1;
        if (correctAnswer8.isChecked()) score += 1;
        if (correctAnswer9.isChecked()) score += 1;
        if (correctAnswer10.isChecked()) score += 1;
        if (correctAnswer11.isChecked()) score += 1;
        if (correctAnswer12.isChecked()) score += 1;
        if (correctAnswer13.isChecked()) score += 1;
        if (correctAnswer14.isChecked()) score += 1;
        if (correctAnswer15.isChecked()) score += 1;
        if (correctAnswer16.isChecked()) score += 1;
        if (correctAnswer17.isChecked()) score += 1;
        if (correctAnswer18.isChecked()) score += 1;
        if (correctAnswer19.isChecked()) score += 1;
        if (correctAnswer20.isChecked()) score += 1;
        if (correctAnswer21.isChecked()) score += 1;
        if (correctAnswer22.isChecked()) score += 1;
        if (correctAnswer23.isChecked()) score += 1;
        if (correctAnswer24.isChecked()) score += 1;
        if (correctAnswer25.isChecked()) score += 1;
        if (correctAnswer26.isChecked()) score += 1;

        sumScore(score);


    }
    //This method display 1 of 2 toasts when button CHECK ANSWER is pressed.
    public void sumScore(int score) {
        EditText nameText = (EditText) findViewById(R.id.name_editor);
        String futureDriver = nameText.getText().toString();


        if (score <= 21) {
            Toast.makeText(this, futureDriver + " you failed the driving licence test! You answered correctly at " + score + " questions.", Toast.LENGTH_LONG).show();
            //RadioGroup.clearCheck().
        }

        if (22 <= score && score <= 26) {
            Toast.makeText(this, "Congratulations " + futureDriver + " you passed the driving test! You answered " + score + " questions.", Toast.LENGTH_LONG).show();
            //RadioGroup.clearCheck().
        }

    }
    //This method display right answers.
    private String answers() {

        String rightAnswer = "Question 1 : a";
        rightAnswer += "\nQuestion 2 : b";
        rightAnswer += "\nQuestion 3 : a";
        rightAnswer += "\nQuestion 4 : b";
        rightAnswer += "\nQuestion 5 : b";
        rightAnswer += "\nQuestion 6 : a";
        rightAnswer += "\nQuestion 7 : a";
        rightAnswer += "\nQuestion 8 : a";
        rightAnswer += "\nQuestion 9 : c";
        rightAnswer += "\nQuestion 10 : c";
        rightAnswer += "\nQuestion 11 : c";
        rightAnswer += "\nQuestion 12 : c";
        rightAnswer += "\nQuestion 13 : c";
        rightAnswer += "\nQuestion 14 : c";
        rightAnswer += "\nQuestion 15 : b";
        rightAnswer += "\nQuestion 16 : a";
        rightAnswer += "\nQuestion 17 : b";
        rightAnswer += "\nQuestion 18 : b";
        rightAnswer += "\nQuestion 19 : a";
        rightAnswer += "\nQuestion 20 : a";
        rightAnswer += "\nQuestion 21 : a";
        rightAnswer += "\nQuestion 22 : b";
        rightAnswer += "\nQuestion 23 : c";
        rightAnswer += "\nQuestion 24 : b";
        rightAnswer += "\nQuestion 25 : c";
        rightAnswer += "\nQuestion 26 : b";
        return rightAnswer;
    }
    //This method display right answers.
    public void showAnswers(View view) {
        displayMessage(answers());
    }
    //This method displays the given text on the screen.
    private void displayMessage(String message) {
        TextView orderSummaryTextView = findViewById(R.id.right_answers);
        orderSummaryTextView.setText(message);
    }

}

