package com.example.abc.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

public class MainActivity extends AppCompatActivity {

    ExpandableListView listView;
    String[] languages = { "Java","JavaScript","jQuery" };
    String[] product = {"14.2","5","19","47.5"};
    String[] test;
    com.example.abc.testproject.AutoCompleteTextView godown_edittext, product_edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ExpandableListView) findViewById(R.id.employeeListview);
        godown_edittext = (com.example.abc.testproject.AutoCompleteTextView)findViewById(R.id.godown_edittext);
        product_edittext = (com.example.abc.testproject.AutoCompleteTextView)findViewById(R.id.product_edittext);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, languages);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, product);
        //Find TextView control

        //Set the number of characters the user must type before the drop down list is shown
        godown_edittext.setThreshold(1);
        //Set the adapter
        godown_edittext.setAdapter(adapter);
        product_edittext.setAdapter(adapter1);

    }

    public class CustomAdapter extends BaseExpandableListAdapter {

        @Override
        public int getGroupCount() {
            return 0;
        }

        @Override
        public int getChildrenCount(int i) {
            return 0;
        }

        @Override
        public Object getGroup(int i) {
            return null;
        }

        @Override
        public Object getChild(int i, int i1) {
            return null;
        }

        @Override
        public long getGroupId(int i) {
            return 0;
        }

        @Override
        public long getChildId(int i, int i1) {
            return 0;
        }

        @Override
        public boolean hasStableIds() {
            return false;
        }

        @Override
        public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
            return null;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            return null;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return false;
        }
    }
}
