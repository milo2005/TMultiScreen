package movil.tmultiscreen.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import movil.tmultiscreen.R;
import movil.tmultiscreen.databinding.FragmentDetailBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

    String[] colors;
    int[] colorsValue;

    FragmentDetailBinding binding;

    int color;

    public DetailFragment() {}

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        colors = context.getResources().getStringArray(R.array.colors);
        colorsValue = context.getResources().getIntArray(R.array.color_valor);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(getLayoutInflater(null));
        binding.setColor(colorsValue[color]);
        binding.setColorName(colors[color]);
        return binding.getRoot();
    }

    public void setColor(int color){
        this.color = color;
        if(binding != null){
            binding.setColor(colorsValue[color]);
            binding.setColorName(colors[color]);
        }
    }

}
