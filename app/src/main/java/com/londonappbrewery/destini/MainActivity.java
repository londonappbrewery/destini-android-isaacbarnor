package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView storyTextView ;
    Button  mButtonTop      ;
    Button  mButtonBottom   ;
    //int mStoryIndex;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

         storyTextView = (TextView) findViewById(R.id.storyTextView);
         mButtonTop      = findViewById(R.id.buttonTop);
         mButtonBottom   = findViewById(R.id.buttonBottom);
         //mStoryIndex      = 1;

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Changing from Story line when it is T2_Story
                if(storyTextView.getText()== getText(R.string.T2_Story)){

                    //change to T3 storyline
                    storyTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                }

                // Changing from Story line when it is T3_Story
                if(storyTextView.getText()== getText(R.string.T3_Story)){

                    //change to T3 storyline
                    storyTextView.setText(R.string.T6_End);
                    mButtonTop.setText("Not much to do here");
                    mButtonBottom.setText("Not much here too");
                }

                // Changing from Story line when it is T1_Story
                if(storyTextView.getText()== getText(R.string.T1_Story)){

                    //change to T3 storyline
                    storyTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                }



            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Changing from Story line when it is T2_Story
                if(storyTextView.getText()== getText(R.string.T2_Story)){

                    //change to T3 storyline
                    storyTextView.setText(R.string.T4_End);
                    mButtonTop.setText("Not much to do here");
                    mButtonBottom.setText("Not much here too");
                }

                //
                if(storyTextView.getText()== getText(R.string.T1_Story)){

                    //change to T2 storyline
                    storyTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                }

                // Changing from Story line when it is T3_Story
                if(storyTextView.getText()== getText(R.string.T3_Story)){

                    //change to T5 storyline
                    storyTextView.setText(R.string.T5_End);
                    mButtonTop.setText("Not much to do here");
                    mButtonBottom.setText("Not much here too");
                }


            }
        });

    }
}
