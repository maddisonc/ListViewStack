package com.example.listviewstack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    // declaring stacks, arr, and arrlist
    Deque<String> defaultMonthStack = new ArrayDeque<String>();
    Deque<String> newMonthStack = new ArrayDeque<String>();

    String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                        "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    ArrayList<String> newMonthStrings = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // configuring listView
        listView = findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (this, R.layout.activity_list_view, R.id.textView, newMonthStrings);
        listView.setAdapter(arrayAdapter);

        // populated month endings
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

        // object arr for random month ending
        Object[] months = defaultMonthStack.toArray();

        // populating 75 "new months"
        for (int i = 0; i < 75; i++)
        {
            // picks a random letter and random month ending for each iteration
            int ranLetterIndex = (int)(Math.floor(Math.random() * 25));
            int ranMonthIndex = (int)(Math.floor(Math.random() * 12));

            // pushes a random letter + random month ending
            newMonthStack.push(letters[ranLetterIndex] + "" + months[ranMonthIndex]);
        } // end for loop for adding new months

        // tests stack, prints to log
        Log.i("test", "newmonths" + newMonthStack);

        // creates an iterator to go through the stack - adds each value to a string arrList for displaying in listView
        Iterator value = newMonthStack.iterator();
        // while there is a next value, add to str arrList
        while (value.hasNext())
        {
            // spaces for readability
            newMonthStrings.add("     " + value.next());
        } // end while

    } // end onCreate
} // end MainActivity