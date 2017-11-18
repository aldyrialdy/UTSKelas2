package sttg.inf.utskelas2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {

    WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        browser=(WebView)findViewById(R.id.about_apps);
        //Use same layout and manifest of previous example
        browser.loadData("" +
                "<html>" +
                "   <body>" +
                "  <title>About Aplikasi </title>" +
                "<p>" +
                "Aplikasi ini dibuat oleh :<br/>" +
                "Anggota 1<br/>" +
                "Anggota 2<br/>" +
                "Anggota 3<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html","UTF-8");

    }
}
