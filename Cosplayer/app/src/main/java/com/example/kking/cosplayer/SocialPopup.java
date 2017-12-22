package com.example.kking.cosplayer;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.DrawableRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SocialPopup#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SocialPopup extends DialogFragment{



    public static SocialPopup newInstance(String title) {
        SocialPopup frag = new SocialPopup();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }

    private @DrawableRes int getIcon(String title){
        switch(title){
            case "Deviant Art":
                return R.drawable.ic_deviantart;
            case "Facebook":
                return R.drawable.ic_facebook;
            case "Email":
                return R.drawable.ic_gmail;
            case "Instagram":
                return R.drawable.ic_instagram;
            case "Snapchat":
                return R.drawable.ic_snapchat;
            default:
                return 0;
        }
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String title = getArguments().getString("title");

        return new AlertDialog.Builder(getActivity())
                .setIcon(getIcon(title))
                .setTitle(title)
                .setPositiveButton(R.string.alert_dialog_ok,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                ((SocialPopup)getActivity()).doPositiveClick();
                            }
                        }
                )
                .setNegativeButton(R.string.alert_dialog_cancel,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                ((FragmentAlertDialog)getActivity()).doNegativeClick();
                            }
                        }
                )
                .create();
    //old below
//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "title";
//
//    // TODO: Rename and change types of parameters
//    private String title;
//    private EditText info;
//    TextView tv_Title;
//    Button cxl_btn;
//    Button submit_btn;
//    ImageView mainImg;
//    private static mDialogReturn returnD;
//
//    public SocialPopup() {
//        // Required empty public constructor
//    }
//
//    public static SocialPopup newInstance(String title, mDialogReturn r) {
//        SocialPopup fragment = new SocialPopup();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, title);
//        fragment.setArguments(args);
//        returnD = r;
//        return fragment;
//    }
//
//
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            title = getArguments().getString(ARG_PARAM1);
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View mview = inflater.inflate(R.layout.social_popup, container, false);
//
//        info = mview.findViewById(R.id.pop_et_info);
//        tv_Title = mview.findViewById(R.id.pop_tv_title);
//        cxl_btn = mview.findViewById(R.id.pop_btn_cxl);
//        submit_btn = mview.findViewById(R.id.pop_btn_submit);
//        mainImg = mview.findViewById(R.id.mainImage);
//        tv_Title.setText(title);
//
////        mainImg.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                Toast.makeText(getContext(), "Image tapped", Toast.LENGTH_SHORT).show();
////            }
////        });
//
//        cxl_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                dismiss();
//            }
//        });
//
//        submit_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//        return mview;
//    }
//
//    @Override
//    public void onDismiss(DialogInterface dialog) {
//        super.onDismiss(dialog);
//        if(info.getText().toString() != "")
//            returnD.onDismiss(title, info.getText().toString());
//    }
//
//    public interface mDialogReturn{
//        void onDismiss(String tag,String info);
//    }

}
