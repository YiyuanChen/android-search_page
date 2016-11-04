package com.fuppy.fuppyandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.mg2.petfinder.schemaobjects.Shelter;

import java.util.concurrent.ExecutionException;

public class ShelterInfoActivity extends AppCompatActivity {

    private Shelter shelter;
    private TextView shelterId,shelterName;
    private String shelter_Id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter_info);

        Intent intent = getIntent();
        shelter_Id = intent.getStringExtra("shelterId");

        Log.d("testsh",shelter_Id);
        shelterId = (TextView)findViewById(R.id.shelter_id);
        shelterName = (TextView)findViewById(R.id.shelter_name);

        shelterId.setText(shelter_Id);
        shelterName.setText("unknown");
//for now, the GetShelterTask does not work well
//        try {
//            shelter = new GetShelterTask().execute(shelterId).get();
//            Log.e("shelter",shelter.getName());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
    }
}
