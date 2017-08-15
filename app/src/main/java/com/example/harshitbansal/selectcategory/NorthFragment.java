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
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class NorthFragment extends Fragment {

    public NorthFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.number_one, R.string.miwok_number_one, R.drawable.hosp1));
        words.add(new Word(R.string.number_two, R.string.miwok_number_two, R.drawable.hosp2));
        words.add(new Word(R.string.number_three, R.string.miwok_number_three, R.drawable.hosp3));
        words.add(new Word(R.string.number_four, R.string.miwok_number_four, R.drawable.hosp4));
        words.add(new Word(R.string.number_five, R.string.miwok_number_five, R.drawable.hosp5));
        words.add(new Word(R.string.number_six, R.string.miwok_number_six, R.drawable.hosp6));
        words.add(new Word(R.string.number_seven, R.string.miwok_number_seven, R.drawable.hosp7));
        words.add(new Word(R.string.number_eight, R.string.miwok_number_eight, R.drawable.hosp8));
        words.add(new Word(R.string.number_nine, R.string.miwok_number_nine, R.drawable.hosp9));
        words.add(new Word(R.string.number_ten, R.string.miwok_number_ten, R.drawable.hosp10));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_north);

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
                String[] links = getResources().getStringArray(R.array.linknorth);
                Uri uri = Uri.parse(links[position]);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
