package com.example.plantcareandroidapp1;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.widget.ArrayAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ProjectsAdapter extends ArrayAdapter<ProjectsModel> {
    private Context context;
    public ProjectsAdapter(@NonNull Context context, ArrayList<ProjectsModel> projectModelArrayList) {
        super(context, 0, projectModelArrayList);
         this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listitemView = convertView;

        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.

            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.card_item, parent, false);
        }

        ProjectsModel courseModel = getItem(position);
        TextView courseTV = listitemView.findViewById(R.id.idTVCourse);
//        ImageView courseIV = listitemView.findViewById(R.id.idIVcourse);

        courseTV.setText(courseModel.getProject_name());
        final Button detailBtn = listitemView.findViewById(R.id.button);
        detailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return listitemView;
    }
}
