package com.example.listviewstack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    // declared
    Deque<String> defaultMonthStack = new ArrayDeque<String>();
    Deque<String> newMonthStack = new ArrayDeque<String>();

    String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                        "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // populated
        defaultMonthStack.push("anuary");
        defaultMonthStack.push("ebruary");
        defaultMonthStack.push("arch");
        defaultMonthStack.push("pril");
        defaultMonthStack.push("ay");
        defaultMonthStack.push("une");
        defaultMonthStack.push("uly");
        defaultMonthStack.push("ugust");
        defaultMonthStack.push("eptember");
        defaultMonthStack.push("ctober");
        defaultMonthStack.push("ovember");
        defaultMonthStack.push("ecember");

        Object[] months = defaultMonthStack.toArray();

        // adds 25 "new months"
        for (int i = 0; i < 25; i++)
        {
            // picks a random letter and random month ending for each iteration
            int ranLetterIndex = (int)(Math.floor(Math.random() * 25));
            int ranMonthIndex = (int)(Math.floor(Math.random() * 12));

            // pushes a random letter + random month ending
            newMonthStack.push(letters[ranLetterIndex] + "" + months[ranMonthIndex]);
        } // end for loop for adding new months

        // tests stack, prints to log
        Log.i("test", "newmonths" + newMonthStack);
    } // end onCreate
} // end MainActivity