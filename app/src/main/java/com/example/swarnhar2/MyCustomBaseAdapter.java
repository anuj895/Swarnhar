/*package com.example.swarnhar2;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.swarnhar2.R;

import java.util.ArrayList;

public class MyCustomBaseAdapter extends BaseAdapter {
    private static ArrayList<SearchResults> searchArrayList;

    private LayoutInflater mInflater;

    public MyCustomBaseAdapter(Context context, ArrayList<SearchResults> results) {
        searchArrayList = results;
        mInflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return searchArrayList.size();
    }

    public Object getItem(int position) {
        return searchArrayList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.custom_row_view, null);
            holder = new ViewHolder ();
            holder.txtOrder = (TextView) convertView.findViewById(R.id.order);
            holder.txtPlace = (TextView) convertView
                    .findViewById(R.id.placed);
           // holder.txtDetail = (TextView) convertView.findViewById(R.id.Detail);
            holder.txtStatus = (TextView) convertView.findViewById(R.id.status);
            holder.txtDestination=(TextView)convertView.findViewById (R.id.Destination);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtPlace.setText(searchArrayList.get(position).getPlace());
        holder.txtStatus.setText(searchArrayList.get(position)
                .getStatus ());
       // holder.txtDetail.setText(searchArrayList.get(position)
               // .getDetail ());
        holder.txtDestination.setText(searchArrayList.get(position).getDestination ());

        return convertView;
    }

    static class ViewHolder {
        public TextView txtOrder;
        public TextView number;
        public TextView placed;
        public TextView destination;
        public TextView status;

        //TextView txtDetail;
    }

}

 */