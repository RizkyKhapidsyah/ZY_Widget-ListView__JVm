package com.wilis.listview;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class listview extends ListActivity {
	TextView selection;
	String[] items={"Aceh", "Sumatera Utara", "Sumatera Barat", "Riau", "Jambi",
					"Sumatera Selatan", "Bengkulu", "Lampung", "Bangka Belitung", "Kepulauan Riau",
					"Jakarta", "Jawa Barat", "Jawa Tengah", "Yogyakarta", "Jawa Timur",
					"Banten", "Bali", "Nusa Tenggara Barat", "Nusa Tenggara Timur", "Kalimantan Barat",
					"Kalimantan Tengah", "Kalimantan Selatan", "Kalimantan Timur", "Sulawesi Utara", 
					"Sulawesi Tengah","Sulawesi Selatan","Sulawesi Tenggara","Gorontalo","Sulawesi Barat",
					"Maluku","Maluku Utara","Papua Barat","Papua"};
	
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.main);
		setListAdapter(new ArrayAdapter<String>(this,
												android.R.layout.simple_list_item_1,
												items));
		selection=(TextView)findViewById(R.id.selection);
	}
	
	public void onListItemClick(ListView parent, View v, int position,
																long id) {
	 	selection.setText(items[position]);
	}
}