package com.example.acara15;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class MahasiswaAdapter extends BaseAdapter {


    private final Context context;
    private final ArrayList<com.example.acara15.herolists> herolists;

    public MahasiswaAdapter(Context context, ArrayList<com.example.acara15.herolists> herolists) {
        this.context = context;
        this.herolists = herolists;
    }

    @Override
    public int getCount() {
        return herolists.size();
    }

    @Override
    public Object getItem(int position) {
        return herolists.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        HolderView holderView;
        if(convertview == null){
            convertview = LayoutInflater.from(context).inflate(R.layout.activity_crdview,parent,false);

            holderView = new HolderView(convertview);
            convertview.setTag(holderView);
        }
        else {
            holderView = (HolderView) convertview.getTag();
        }

        com.example.acara15.herolists list = herolists.get(position);
        holderView.medsos.setImageResource(list.getMedsos());
        holderView.name.setText(list.getName());
        return convertview;
    }

    private static class HolderView{
        private final ImageView medsos;
        private final TextView name;

        public  HolderView(View view){
            medsos = view.findViewById(R.id.medsos);
            name = view.findViewById(R.id.name);
        }
    }
}
