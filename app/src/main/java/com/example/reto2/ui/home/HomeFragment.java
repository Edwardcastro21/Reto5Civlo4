package com.example.reto2.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.reto2.Favoritos;
import com.example.reto2.R;
import com.example.reto2.ShowMapsActivity;
import com.example.reto2.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_add:
                Toast.makeText(getContext(), "OK", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_show:
                Intent intent2 = new Intent(getContext(), ShowMapsActivity.class);
                intent2.putExtra("type","1");
                getActivity().startActivity(intent2);
                return true;
            case R.id.itemFavoritos:
                Intent intent3 = new Intent(getContext(), Favoritos.class);
                intent3.putExtra("type","1");
                getActivity().startActivity(intent3);

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}