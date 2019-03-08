package android.example.labaratory1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class ListActivity2 extends AppCompatActivity {

    ArrayList<ImageText> massInfo = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
        ListView listPrint = findViewById(R.id.list_print);
        ImageTextAdapter adapt = new ImageTextAdapter(this, R.layout.list_item, massInfo);

        listPrint.setAdapter(adapt);
        for (int i=1;i <= 1000000; i++)
        {

            if ((i%2)==1) {

                ImageText obg = new ImageText("#CCCCCC", "Нечёт", R.drawable.ak);
                massInfo.add(obg);
            }
            else {
                ImageText obg = new ImageText("#FFFFFF", "Чёт", R.drawable.pist);
                massInfo.add(obg);
            }

        }
    }
}
