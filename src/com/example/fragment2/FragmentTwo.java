package com.example.fragment2;
import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


@SuppressLint("NewApi")
public class FragmentTwo extends Fragment{
   @Override
   public View onCreateView(LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
      /**
       * Inflate the layout for this fragment
       */
      return inflater.inflate(
      R.layout.fragment_two, container, false);
   }
}
