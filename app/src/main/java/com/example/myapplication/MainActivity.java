package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDataList[] datalist = new MyDataList[]{
             new MyDataList("Email",R.drawable.baseline_email_24),
                new MyDataList("drive upload",R.drawable.baseline_drive_folder_upload_24),
                new MyDataList("location",R.drawable.baseline_emergency_share_24),
                new MyDataList("Event note",R.drawable.baseline_event_note_24),
                new MyDataList("person",R.drawable.baseline_face_24),
                new MyDataList("fax",R.drawable.baseline_fax_24),
                new MyDataList("Email",R.drawable.baseline_email_24),
                new MyDataList("drive upload",R.drawable.baseline_drive_folder_upload_24),
                new MyDataList("location",R.drawable.baseline_emergency_share_24),
                new MyDataList("Event note",R.drawable.baseline_event_note_24),
                new MyDataList("person",R.drawable.baseline_face_24),
                new MyDataList("fax",R.drawable.baseline_fax_24),
        };

        MyAdapter adapter = new MyAdapter(datalist);
        recyclerView =findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

    }
}