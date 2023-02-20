package com.example.ashishapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class WebViewActivity extends AppCompatActivity {
WebView wv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        //binding
        wv=(WebView) findViewById(R.id.wv);

        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("https://www.google.com");
         btn= (Button) findViewById(R.id.btn);//bindin button
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //binding menu item
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_item:
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_item2:
                Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_item3:
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }

    }

    public void showMenu(View view) {
        PopupMenu popupMenu=new PopupMenu(this,btn);
        popupMenu.getMenuInflater().inflate(R.menu.main_menu,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(WebViewActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        popupMenu.show();

    }
}
