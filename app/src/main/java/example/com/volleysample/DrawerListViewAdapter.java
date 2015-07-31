package example.com.volleysample;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by sakkeer on 31/7/15.
 */
public class DrawerListViewAdapter extends BaseAdapter {

    List<String> itemList;

    DrawerListViewAdapter(List<String> itemList){
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){

        }


        return null;
    }
}
