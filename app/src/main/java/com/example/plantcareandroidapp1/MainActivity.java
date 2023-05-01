package com.example.plantcareandroidapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView projectsGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            Amplify.configure(getApplicationContext());
            Log.i("MyAmplifyApp", "Initialized Amplify");
        } catch (AmplifyException error) {
            Log.e("MyAmplifyApp", "Could not initialize Amplify", error);
        }
        projectsGV = findViewById(R.id.idProjects);
        ArrayList<ProjectsModel> courseModelArrayList = new ArrayList<ProjectsModel>();

        courseModelArrayList.add(new ProjectsModel("abc123", "Strawberry Plant"));
        courseModelArrayList.add(new ProjectsModel("abc567", "Mushroom Plant"));

        ProjectsAdapter adapter = new ProjectsAdapter(this, courseModelArrayList);
//        projectsGV.setAdapter(adapter);
        projectsGV.setAdapter(adapter);


    }
}