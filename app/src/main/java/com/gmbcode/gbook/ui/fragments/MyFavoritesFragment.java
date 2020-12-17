package com.gmbcode.gbook.ui.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmbcode.gbook.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MyFavoritesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyFavoritesFragment extends Fragment {

    public MyFavoritesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_favorites, container, false);
    }
}