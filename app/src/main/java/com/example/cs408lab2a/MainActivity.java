package com.example.cs408lab2a;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.cs408lab2a.databinding.ActivityMainBinding;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String[] stringArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // Load the string array from resources
        stringArray = getResources().getStringArray(R.array.stringArray);
    }

    // Button Click
    public void onClick(View view) {
        //Display random string
        binding.displayMessage.setText(getRandomString(stringArray));
    }

    // Method to get a random string from the array
    public static String getRandomString(String[] array) {
        int randomIndex = new Random().nextInt(array.length);
        return array[randomIndex];
    }
}
