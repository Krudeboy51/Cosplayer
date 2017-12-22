package com.example.kking.cosplayer;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Map;


public class AddPlayerFragment extends Fragment implements View.OnClickListener{

    ImageButton dvnt;
    ImageButton sc;
    ImageButton email;
    ImageButton fb;
    ImageButton insta;
    Map<String, String> infoList;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void init(View mview){
        dvnt = mview.findViewById(R.id.dvntrt);
        dvnt.setOnClickListener(this);
        sc = mview.findViewById(R.id.sc);
        sc.setOnClickListener(this);
        email = mview.findViewById(R.id.email);
        email.setOnClickListener(this);
        fb = mview.findViewById(R.id.fb);
        fb.setOnClickListener(this);
        insta = mview.findViewById(R.id.insta);
        insta.setOnClickListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mview = inflater.inflate(R.layout.fragment_add_player, container, false);
        // Inflate the layout for this fragment
        init(mview);

        return mview;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.dvntrt:
                showDialog("Deviant Art");
                break;
            case R.id.fb:
                showDialog("Facebook");
                break;
            case R.id.email:
                showDialog("Email");
                break;
            case R.id.insta:
                showDialog("Instagram");
                break;
            case R.id.sc:
                showDialog("Snapchat");
                break;
        }
    }

    void showDialog(String title) {
//        FragmentTransaction ft = getFragmentManager().beginTransaction();
//        SocialPopup newFragment = SocialPopup.newInstance(title, this);
//        newFragment.show(ft, "dialog");
    }

//    @Override
//    public void onDismiss(String tag, String info) {
//        infoList.put(tag, info);
//    }

}
