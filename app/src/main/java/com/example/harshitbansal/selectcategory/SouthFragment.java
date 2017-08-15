package com.example.harshitbansal.selectcategory;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of family vocabulary words.
 */
public class SouthFragment extends Fragment {

    public SouthFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.family_father, R.string.miwok_family_father, R.drawable.hosp11));
        words.add(new Word(R.string.family_mother, R.string.miwok_family_mother, R.drawable.hosp12));
        words.add(new Word(R.string.family_son, R.string.miwok_family_son, R.drawable.hosp13));
        words.add(new Word(R.string.family_daughter, R.string.miwok_family_daughter, R.drawable.hosp14));
        words.add(new Word(R.string.family_older_brother, R.string.miwok_family_older_brother, R.drawable.hosp15));
        words.add(new Word(R.string.family_younger_brother, R.string.miwok_family_younger_brother, R.drawable.hosp16));
        words.add(new Word(R.string.family_older_sister, R.string.miwok_family_older_sister, R.drawable.hosp17));
        words.add(new Word(R.string.family_younger_sister, R.string.miwok_family_younger_sister, R.drawable.hosp18));
        words.add(new Word(R.string.family_grandmother, R.string.miwok_family_grandmother, R.drawable.hosp19));
        words.add(new Word(R.string.family_grandfather, R.string.miwok_family_grandfather, R.drawable.hosp20));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_south);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                String[] links = getResources().getStringArray(R.array.linksouth);
                Uri uri = Uri.parse(links[position]);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        return rootView;
    }

}
