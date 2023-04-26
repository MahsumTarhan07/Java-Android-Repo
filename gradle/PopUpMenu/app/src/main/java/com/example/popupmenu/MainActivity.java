package com.example.popupmenu;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonMenuAc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMenuAc = findViewById(R.id.buttonMenuAc);

        buttonMenuAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(MainActivity.this,buttonMenuAc);
                popup.getMenuInflater().inflate(R.menu.pop_menu,popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch (item.getItemId()){
                            case R.id.action_sil:
                                Toast.makeText(MainActivity.this, "Silindi", Toast.LENGTH_SHORT).show();
                                return  true;
                            case R.id.action_düzenle:
                                Toast.makeText(MainActivity.this, "Düzenle", Toast.LENGTH_SHORT).show();
                                return  true;
                            default:
                                return  false;

                        }
                    }
                });
                popup.show();
            }
        });
    }
}