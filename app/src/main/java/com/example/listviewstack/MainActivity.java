package com.example.listviewstack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayDeque;
import java.util.Deque;

public class MainActivity extends AppCompatActivity {

    // declared
    Deque<String> defaultMonthStack = new ArrayDeque<String>();
    Deque<String> newMonthStack = new ArrayDeque<String>();


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

        // adds 25 "new months"
        for (int i = 0; i < 25; i++)
        {
            newMonthStack.push("" + defaultMonthStack.peek());
        } // end for loop for adding new months

    } // end onCreate
} // end MainActivity