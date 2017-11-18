package sttg.inf.utskelas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String[] mobileArray = {"Lari", "Futsal", "Basket", "Bulutangkis", "Tenis"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.item_olahraga, mobileArray);
        ListView listView = (ListView) findViewById(R.id.olahraga_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pilihOl = adapterView.getItemAtPosition(i).toString();
                Intent intdetail = new Intent(ListActivity.this, DetailOlahActivity.class);
                intdetail.putExtra("olahraga",pilihOl);
                startActivity(intdetail);
            }
        });

    }
}
