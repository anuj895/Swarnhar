package com.example.swarnhar2;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import com.example.swarnhar2.test.OrderData;

import java.util.List;
class CustomAdapter extends BaseAdapter {
    private BottomActivity context;
    private List<OrderData> arrayList;
    CustomAdapter(BottomActivity context, List<OrderData> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size ();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get (position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from (context).inflate (R.layout.custom_row_view, parent, false);
        }
        TextView number, placed, destination, status, detailsOrder;
        number = convertView.findViewById (R.id.number);
        placed = convertView.findViewById (R.id.placed);
        destination = convertView.findViewById (R.id.destination);
        status = convertView.findViewById (R.id.status);
        detailsOrder = convertView.findViewById (R.id.detailsOrder);
        detailsOrder.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                simpleAlert(arrayList.get(position).getDescription ());


        }});
        number.setText(arrayList.get(position).getNumber());
        placed.setText(arrayList.get(position).getPlaced());
        destination.setText(arrayList.get(position).getDestination());
        status.setText(arrayList.get(position).getStatus ());
        return convertView;
    }

    private void finish() {
    }

    private void simpleAlert(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Full_Details..");
        builder.setMessage(message);
        builder.setCancelable(true);
        builder.show();
    }

}

