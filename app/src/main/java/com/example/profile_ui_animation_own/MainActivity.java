package com.example.profile_ui_animation_own;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

//    private boolean isOpen = false ;
//    private ConstraintSet layout1,layout2;
//    private ConstraintLayout constraintLayout ;
//    private ImageView imageViewPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//
//        Window w = getWindow();
//        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//
//        layout1 = new ConstraintSet();
//        layout2 = new ConstraintSet();
//        imageViewPhoto = findViewById(R.id.photo);
//        constraintLayout = findViewById(R.id.constraint_layout);
//        layout2.clone(this,R.layout.profile_expanded);
//        layout1.clone(constraintLayout);
//
//        imageViewPhoto.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//                if (!isOpen) {
//                    TransitionManager.beginDelayedTransition(constraintLayout);
//                    layout2.applyTo(constraintLayout);
//                    isOpen = !isOpen ;
//                }
//
//                else {
//
//                    TransitionManager.beginDelayedTransition(constraintLayout);
//                    layout1.applyTo(constraintLayout);
//                    isOpen = !isOpen ;
//
//                }
//
//
//
//
//
//
//            }
//        });
    }
}
