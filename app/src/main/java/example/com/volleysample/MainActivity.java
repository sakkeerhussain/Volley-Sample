package example.com.volleysample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private NetworkImageView imageView;
    private ListView drawerListView;


    ArrayList<String> arrayList = new ArrayList<String>();
    ArrayList<String> urlList = new ArrayList<String>();
    private ImageLoader imageLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        arrayList.add(0, "natureImageUrl");
        arrayList.add(1, "whiteTigerImageUrl");
        arrayList.add(2, "suprbhaathamImageUrl");
        arrayList.add(3, "volleyIndiaVSEgypth");
//        arrayList.add(1, "whiteTigerImageUrl");

        String natureImageUrl = "http://bestinspired.com/wp-content/uploads/2015/03/4-Nature-Wallpapers-2014-1.jpg";
        String whiteTigerImageUrl = "http://www.hdwallpapersimages.com/wp-content/uploads/2014/01/Winter-Tiger-Wild-Cat-Images.jpg";
        String suprbhaathamImageUrl = "http://www.hdwallpapersinn.com/wp-content/uploads/2014/07/Yellow-Nature-HD-Wallpapers-1-2.jpg";
        String volleyIndiaVSEgypth = "http://www.fivb.org/Vis2009/Images/GetImage.asmx?type=press&no=30925";

        urlList.add(0, natureImageUrl);
        urlList.add(1, whiteTigerImageUrl);
        urlList.add(2, suprbhaathamImageUrl);
        urlList.add(3, volleyIndiaVSEgypth);
//        arrayList.add(1, "whiteTigerImageUrl");

        drawerListView.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_list_view_layout, R.id.textView, arrayList));
        imageLoader = ApplicationSingleton.getInstance().getImageLoader();

        imageView.setImageUrl("http://www.nicehdwallpaper.com/wp-content/uploads/2013/11/Sachin-tendulkar-hd-wallpaper-free-download-for-desktop.jpg", imageLoader);

        setListeners();
    }

    private void setListeners() {
        drawerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                imageView.setImageUrl(urlList.get(position), imageLoader);
            }
        });
    }

    private void initViews() {
        imageView = (NetworkImageView) findViewById(R.id.networkImageView);
        drawerListView = (ListView) findViewById(R.id.drawerListView);
    }
}
