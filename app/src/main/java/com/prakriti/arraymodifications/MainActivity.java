package com.prakriti.arraymodifications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView OriginalArrayValues, ModifiedArrayValues,
            OriginalArrayElement, ModifiedArrayElement, ElementBeforeMod;
    private String[] myArray = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView OriginalArrayValues = findViewById(R.id.OriginalArrayValues);
        TextView ModifiedArrayValues = findViewById(R.id.ModifiedArrayValues);
        TextView OriginalArrayElement = findViewById(R.id.OriginalArrayElement);
        TextView ModifiedArrayElement = findViewById(R.id.ModifiedArrayElement);
        TextView ElementBeforeMod = findViewById(R.id.ElementBeforeMod);

        printOriginalArray(OriginalArrayValues);
        modifyTheArray(ModifiedArrayValues);
        printOriginalElement(5, OriginalArrayElement);
        modifyTheElement(5, ModifiedArrayElement);
        printElementBeforeMod(5, ElementBeforeMod);

    }

    public void printOriginalArray(TextView myTextView) {
        String line = "";
        for(String value : myArray) {
            line = line+value+"\n";
        }
        myTextView.setText(line);

    }

    public void modifyTheArray(TextView myTextView) {
        String line="";
        for(String value : myArray) {
            line=line+"$"+value+" #\n";
        }
        myTextView.setText(line);
    }

    public void printOriginalElement(int index, TextView myTextView) {
        myTextView.setText(myArray[index]);
    }

    public void modifyTheElement(int index, TextView myTextView) {
        String elem="#"+myArray[index]+"%";
        myTextView.setText(elem);
    }

    public void printElementBeforeMod(int index, TextView myTextView) {
        myTextView.setText(myArray[index]+"\n");
    }
}