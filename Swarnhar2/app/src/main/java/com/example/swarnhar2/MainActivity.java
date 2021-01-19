//package com.example.swarnhar2;
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.ListView;
//import android.widget.Spinner;
//import android.widget.TextView;
////import android.widget.Toast;
//import com.example.swarnhar2.test.OrderData;
//import com.example.swarnhar2.test.OrderResponse;
//import com.google.gson.Gson;
////import org.json.JSONArray;
////import org.json.JSONException;
////import org.json.JSONObject;
////import org.w3c.dom.Text;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import static android.R.layout.simple_spinner_dropdown_item;
//public class MainActivity extends AppCompatActivity {
//    //View view;
//    TextView order;
//    ListView listView;
//    ArrayList<OrderData> arrayList;
//    private Button Reset, Filter;
//    //private CustomAdapter adapter1;
//   // private final static String TAG = "MainActivity";
//    //String jsonArray = ("order.json");
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate (savedInstanceState);
//        setContentView (R.layout.activity_main);
//
//        // view= findViewById (R.id.view);
//        Spinner spinner1 = (Spinner) findViewById (R.id.spinner1);
//        Spinner spinner2 = (Spinner) findViewById (R.id.spinner2);
//        Spinner spinner3 = (Spinner) findViewById (R.id.spinner3);
//        Spinner spinner4 = (Spinner) findViewById (R.id.spinner4);
//        Spinner spinner5 = (Spinner) findViewById (R.id.spinner5);
//        //Button
//        Reset = (Button) findViewById (R.id.Reset);
//        //  String Reset = (Button).getText().toString();
//        Filter = (Button) findViewById (R.id.Filter);
//        //  ListView listView = (ListView) findViewById (R.id.listView);
//        // TextView textView = (TextView) findViewById (R.id.textView);
//        //String[] listItem = getResources ().getStringArray (R.array.array_technology);
//            /* final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
//        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                // TODO Auto-generated method stub
//                String value=adapter.getItem(position);
//                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();
//            }
//        });
//*/
//        order=(TextView)findViewById (R.id.order);
//
//        Reset.setOnClickListener (new View.OnClickListener () {
//            @Override
//            public void onClick(View v) {
//            }
//        });
//        Filter.setOnClickListener (new View.OnClickListener () {
//            @Override
//            public void onClick(View v) {
//            }
//        });
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource (this,
//                R.array.Origin, R.layout.simple_spinner_text);
//        adapter.setDropDownViewResource (simple_spinner_dropdown_item);
//        spinner1.setAdapter (adapter);
//
//        adapter = ArrayAdapter.createFromResource (this,
//                R.array.places, R.layout.simple_spinner_text);
//        adapter.setDropDownViewResource (simple_spinner_dropdown_item);
//        spinner2.setAdapter (adapter);
//
//        adapter = ArrayAdapter.createFromResource (this,
//                R.array.Destination, R.layout.simple_spinner_text);
//        adapter.setDropDownViewResource (simple_spinner_dropdown_item);
//        spinner3.setAdapter (adapter);
//
//        adapter = ArrayAdapter.createFromResource (this,
//                R.array.District, R.layout.simple_spinner_text);
//        adapter.setDropDownViewResource (simple_spinner_dropdown_item);
//        spinner4.setAdapter (adapter);
//
//        adapter = ArrayAdapter.createFromResource (this,
//                R.array.order, R.layout.simple_spinner_text);
//        adapter.setDropDownViewResource (simple_spinner_dropdown_item);
//        spinner5.setAdapter (adapter);
////list
//        listView = findViewById (R.id.listView);
//       // arrayList = new ArrayList<> ();
//
//        try {
////            JSONObject object = new JSONObject (readJSON ());
////            Gson gson = new Gson();
////            OrderResponse orderResponse = gson.fromJson(readJSON (), OrderResponse.class);
//            OrderResponse orderResponse=(OrderResponse) readJSON("order.json",OrderResponse.class);
//
////            JSONArray array = object.getJSONArray ("order");
////                for (int i = 0; i < array.length (); i++) {
////                JSONObject jsonObject = array.getJSONObject (i);
////                String number = jsonObject.getString ("number");
////                String placed = jsonObject.getString ("placed");
////                String destination = jsonObject.getString ("destination");
////                String status = jsonObject.getString ("status");
////
////                listModel model = new listModel ();
////                model.setNumber (number);
////                model.setPlaced (placed);
////                model.setDestination (destination);
////                model.setStatus (status);
////                arrayList.add (model);
////            }
//            CustomAdapter customAdapter = new CustomAdapter (this, orderResponse.getOrder());
//            listView.setAdapter(customAdapter);
//        }
//        catch (Exception e) {
//            e.printStackTrace ();
//        }
//    }
//    private Object readJSON(String fileName,Class classType) {
//        Object json = null;
//        try {
//            InputStream inputStream = getAssets ().open (fileName);
//            int size = inputStream.available ();
//            byte[] buffer = new byte[size];
//            inputStream.read (buffer);
//            inputStream.close ();
//            String  jsonValue = new String (buffer, "UTF-8");
//            Gson gson = new Gson();
//            json = gson.fromJson(jsonValue, classType);
//        }
//        catch (IOException e) {
//            e.printStackTrace ();
//
//        }
//        return json;
//    }
//}
//  /*      ArrayList<SearchResults> searchResults = GetSearchResults ();
//        final ListView lv = (ListView) findViewById (R.id.listView);
//        lv.setAdapter (new MyCustomBaseAdapter (this, searchResults));
//        lv.setOnItemClickListener (new AdapterView.OnItemClickListener () {
//            @Override
//            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
//                Object o = lv.getItemAtPosition (position);
//                SearchResults fullObject = (SearchResults) o;
//                Toast.makeText (MainActivity.this, "You have chosen: " + " " + fullObject.getOrder (), Toast.LENGTH_LONG).show ();
//            }
//        });
//    }
//}
//   */
//   /* private ArrayList<SearchResults> GetSearchResults() {
//        ArrayList<SearchResults> results = new ArrayList<SearchResults>();
//
//        SearchResults sr = new SearchResults();
//        sr.setOrder("#Order Number");
//        sr.setPlace("Placed:Dec 10th 2019 9:08 PM ");
//        sr.setDestination("Destination:Uttar Pradesh, Ghaziabad(Full Address)");
//       // sr.setDetail("Full Details");
//        sr.setStatus("Rejected");
//        results.add(sr);
//
//        sr = new SearchResults();
//        sr.setOrder("#Order Number");
//        sr.setPlace("Placed:Dec 10th 2019 9:08 PM");
//        sr.setDestination("Destination:Uttar Pradesh, Ghaziabad(Full Address)");
//       // sr.setDetail("Full Details");
//        sr.setStatus("Delivered");
//        results.add(sr);
//
//        sr = new SearchResults();
//        sr.setOrder("#Order Number");
//        sr.setPlace("Placed:Dec 10th 2019 9:08 PM");
//        sr.setDestination("Destination:Uttar Pradesh, Ghaziabad(Full Address)");
//       // sr.setDetail("Full Details");
//        sr.setStatus("Delivered");
//        results.add(sr);
//        return results;
//    }
//}
//    */
//
