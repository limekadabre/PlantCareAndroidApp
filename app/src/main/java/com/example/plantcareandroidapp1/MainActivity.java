package com.example.plantcareandroidapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
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

        courseModelArrayList.add(new ProjectsModel("abc123", "Project 1"));
        courseModelArrayList.add(new ProjectsModel("abc567", "Project 2"));

        ProjectsAdapter adapter = new ProjectsAdapter(this, courseModelArrayList);
//        projectsGV.setAdapter(adapter);
        projectsGV.setAdapter(adapter);
    }

            public void navigateToDetailPage(View view) {
                Log.i("navigate", "navigateToDetailPage: ");
            }
        }