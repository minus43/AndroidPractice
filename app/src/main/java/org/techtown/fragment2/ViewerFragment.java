package org.techtown.fragment2;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;

public class ViewerFragment extends Fragment{
    ImageView imageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_viewer, container, false);

        imageView =(ImageView) rootView.findViewById(R.id.imageView);

        return rootView;
    }

    public void setImage(int index){
        if(index==0){
            imageView.setImageResource(R.drawable.dream01);
        } else if(index==1){
            imageView.setImageResource(R.drawable.dream02);
        }else if(index==2){
            imageView.setImageResource(R.drawable.dream03);
        }
    }
    }
