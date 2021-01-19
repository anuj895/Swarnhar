package com.example.swarnhar2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.swarnhar2.test.OrderResponse;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;

import static android.R.layout.simple_spinner_dropdown_item;


public class ClosedOrderfragment extends Fragment {
    private ListView listView;
    private Button Reset, Filter;
    Spinner spinner1, spinner2, spinner3, spinner4, spinner5;

    static ClosedOrderfragment newInstance() {
        ClosedOrderfragment fragment = new ClosedOrderfragment ();
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate (R.layout.fragment_open_order, container, false);


    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {


        Spinner spinner1 = (Spinner) view.findViewById (R.id.spinner1);
        Spinner spinner2 = (Spinner) view.findViewById (R.id.spinner2);
        Spinner spinner3 = (Spinner) view.findViewById (R.id.spinner3);
        Spinner spinner4 = (Spinner) view.findViewById (R.id.spinner4);
        Spinner spinner5 = (Spinner) view.findViewById (R.id.spinner5);


        Reset = (Button) view.findViewById (R.id.Reset);
        //  String Reset = (Button).getText().toString();
        Filter = (Button) view.findViewById (R.id.Filter);

        Reset.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

            }
        });

        Filter.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

            }
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource (getActivity (),
                R.array.Origin, R.layout.simple_spinner_text);
        adapter.setDropDownViewResource (simple_spinner_dropdown_item);
        spinner1.setAdapter (adapter);

        adapter = ArrayAdapter.createFromResource (getActivity (),
                R.array.places, R.layout.simple_spinner_text);
        adapter.setDropDownViewResource (simple_spinner_dropdown_item);
        spinner2.setAdapter (adapter);


        adapter = ArrayAdapter.createFromResource (getActivity (),
                R.array.Destination, R.layout.simple_spinner_text);
        adapter.setDropDownViewResource (simple_spinner_dropdown_item);
        spinner3.setAdapter (adapter);

        adapter = ArrayAdapter.createFromResource (getActivity (),
                R.array.District, R.layout.simple_spinner_text);
        adapter.setDropDownViewResource (simple_spinner_dropdown_item);
        spinner4.setAdapter (adapter);


        adapter = ArrayAdapter.createFromResource (getActivity (),
                R.array.order, R.layout.simple_spinner_text);
        adapter.setDropDownViewResource (simple_spinner_dropdown_item);
        spinner5.setAdapter (adapter);

        listView = (ListView) view.findViewById(R.id.listView);



        OrderResponse orderResponse=(OrderResponse) readJSON("order.json",OrderResponse.class);

        CustomAdapter customAdapter = new CustomAdapter ((BottomActivity) getActivity (), orderResponse.getOrder());
        listView.setAdapter(customAdapter);


    }
    private Object readJSON(String fileName,Class classType) {
        Object json = null;
        try {
            InputStream inputStream = getActivity ().getAssets().open (fileName);
            int size = inputStream.available ();
            byte[] buffer = new byte[size];
            inputStream.read (buffer);
            inputStream.close ();
            String  jsonValue = new String (buffer, "UTF-8");
            Gson gson = new Gson();
            json = gson.fromJson(jsonValue, classType);
        }
        catch (IOException e) {
            e.printStackTrace ();

        }
        return json;
    }


}
