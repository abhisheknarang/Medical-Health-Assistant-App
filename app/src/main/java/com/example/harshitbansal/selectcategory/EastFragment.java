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
 * {@link Fragment} that displays a list of color vocabulary words.
 */
public class EastFragment extends Fragment {
    public EastFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.color_red, R.string.miwok_color_red,R.drawable.hosp21));
        words.add(new Word(R.string.color_mustard_yellow, R.string.miwok_color_mustard_yellow,R.drawable.hosp22));
        words.add(new Word(R.string.color_dusty_yellow, R.string.miwok_color_dusty_yellow, R.drawable.hosp23));
        words.add(new Word(R.string.color_green, R.string.miwok_color_green, R.drawable.hosp24));
        words.add(new Word(R.string.color_brown, R.string.miwok_color_brown, R.drawable.hosp25));
        words.add(new Word(R.string.color_gray, R.string.miwok_color_gray, R.drawable.hosp26));
        words.add(new Word(R.string.color_black, R.string.miwok_color_black, R.drawable.hosp27));
        words.add(new Word(R.string.color_white, R.string.miwok_color_white, R.drawable.hosp28));
        words.add(new Word(R.string.color_bas, R.string.miwok_color_bas, R.drawable.hosp29));
        words.add(new Word(R.string.color_bas2, R.string.miwok_color_bas2, R.drawable.hosp30));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_east);

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
                String[] links = getResources().getStringArray(R.array.linkeast);
                Uri uri = Uri.parse(links[position]);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        return rootView;
    }

}
