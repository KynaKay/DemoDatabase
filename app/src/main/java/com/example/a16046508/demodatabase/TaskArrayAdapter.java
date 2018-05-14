package com.example.a16046508.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TaskArrayAdapter extends ArrayAdapter<Task> {

    ArrayList<Task> a1;
    Context context;
    int resource;
    TextView tvID, tvDesc, tvDate;

    public TaskArrayAdapter (Context context, int resource,
                             ArrayList<Task> objects) {
        super(context, resource, objects);
        this.context = context;
        this.a1 = objects;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(resource, parent,
                false);

        tvID = (TextView)
                rowView.findViewById(R.id.tvID);
        tvDesc = (TextView)
                rowView.findViewById(R.id.tvDesc);
        tvDate = (TextView)
                rowView.findViewById(R.id.tvDate);

        Task data = a1.get(position);
        tvID.setText("" + data.getId());
        tvDesc.setText(data.getDescription());
        tvDate.setText(data.getDate());

        return rowView;
    }
}
