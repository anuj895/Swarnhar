//package com.example.swarnhar2;
//
//import android.app.Activity;
//import android.app.Dialog;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AlertDialog;
//
//import com.example.swarnhar2.test.OrderData;
//
//import java.util.List;
//
//public class FullDetails extends Activity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.custom_row_view);
//
//        //attaching click listener
//        findViewById(R.id.detailsOrder).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(FullDetails.this);
//               // final Dialog dialog = new Dialog (FullDetails.this);
//                // Include dialog.xml file
//                ViewGroup viewGroup = findViewById(android.R.id.content);
//
//                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.full_details, viewGroup, false);
//                builder.setView(dialogView);
//                AlertDialog alertDialog =
//
//                // set values for custom dialog components - text, image and button
//                builder.create();
//                alertDialog.show();
//                // Set dialog title
//                //calling this method to show our android custom alert dialog
//              //  showCustomDialog();
//            }
//        });
//    }
//
//    private void showCustomDialog() {
//        //before inflating the custom alert dialog layout, we will get the current activity viewgroup
//        ViewGroup viewGroup = findViewById(android.R.id.content);
//
//        //then we will inflate the custom alert dialog xml that we created
//        View dialogView = LayoutInflater.from(this).inflate(R.layout.full_details, viewGroup, false);
//
//
//        //Now we need an AlertDialog.Builder object
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//
//        //setting the view of the builder to our custom view that we already inflated
//        builder.setView(dialogView);
//
//        //finally creating the alert dialog and displaying it
//        AlertDialog alertDialog = builder.create();
//        alertDialog.show();
//    }
//}
