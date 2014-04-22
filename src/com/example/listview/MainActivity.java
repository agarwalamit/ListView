package com.example.listview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final ListView listview = (ListView) findViewById(R.id.lv);
		String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
				"Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
				"Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
				"OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
				"Android", "iPhone", "WindowsMobile" };

		final ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < values.length; ++i) {
			list.add(values[i]);
		}
		final MyArrayAdapter adapter = new MyArrayAdapter(this,
				android.R.layout.simple_list_item_1, list);
		listview.setAdapter(adapter);
	}

	private class MyArrayAdapter extends ArrayAdapter<String> {
		
		int i=0;
		
		public MyArrayAdapter(Context context, int textViewResourceId,
				List<String> objects) {
			super(context, textViewResourceId, objects);
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent){
			i++;
			System.out.println("getView called-------------"+i);
			return super.getView(position, convertView, parent);
		}
		
		@Override
		public int getCount(){
			System.out.println("getCount called " +super.getCount());
			return super.getCount();
		}
	}
} 
