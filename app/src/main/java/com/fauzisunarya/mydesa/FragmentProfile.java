package com.fauzisunarya.mydesa;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentProfile extends Fragment {
    private RecyclerView rvProfile;
    private List<Profile> list = new ArrayList<>();
    private ProfileAdapter profileAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public FragmentProfile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        rvProfile = view.findViewById(R.id.rv_profile);
        layoutManager = new LinearLayoutManager(getActivity());
        rvProfile.setLayoutManager(layoutManager);

        addList();
        Adapter();

        return view;
    }

    private void addList(){
        Profile profile = new Profile();
        profile.setImageProfile(R.drawable.one);
        profile.setNameProfile("Bryant Dwi Muhammad ");
        profile.setDescriptionProfile("5170311145");
        list.add(profile);

        profile = new Profile();
        profile.setImageProfile(R.drawable.two);
        profile.setNameProfile("Jabal Hamas Hisbullah");
        profile.setDescriptionProfile("5170311132");
        list.add(profile);

        profile = new Profile();
        profile.setImageProfile(R.drawable.thre);
        profile.setNameProfile("Ivan Lianta Sirait");
        profile.setDescriptionProfile("5170311065");
        list.add(profile);

        profile = new Profile();
        profile.setImageProfile(R.drawable.four);
        profile.setNameProfile("Maris Ulfah");
        profile.setDescriptionProfile("5170311118");
        list.add(profile);

        profile = new Profile();
        profile.setImageProfile(R.drawable.five);
        profile.setNameProfile("Muhammad nugroho w s");
        profile.setDescriptionProfile("5170311127");
        list.add(profile);
    }

    private void Adapter(){
        profileAdapter = new ProfileAdapter(list, getActivity());
        rvProfile.setAdapter(profileAdapter);
        profileAdapter.notifyDataSetChanged();

    }

}
