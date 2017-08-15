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
 * {@link Fragment} that displays a list of phrases.
 */
public class WestFragment extends Fragment {

    public WestFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.phrase_where_are_you_going,R.string.miwok_phrase_where_are_you_going,R.drawable.hosp31));
        words.add(new Word(R.string.phrase_what_is_your_name, R.string.miwok_phrase_what_is_your_name,R.drawable.hosp32));
        words.add(new Word(R.string.phrase_my_name_is, R.string.miwok_phrase_my_name_is,R.drawable.hosp33));
        words.add(new Word(R.string.phrase_how_are_you_feeling, R.string.miwok_phrase_how_are_you_feeling,R.drawable.hosp34));
        words.add(new Word(R.string.phrase_im_feeling_good, R.string.miwok_phrase_im_feeling_good,R.drawable.hosp35));
        words.add(new Word(R.string.phrase_are_you_coming, R.string.miwok_phrase_are_you_coming,R.drawable.hosp36));
        words.add(new Word(R.string.phrase_yes_im_coming, R.string.miwok_phrase_yes_im_coming,R.drawable.hosp37));
        words.add(new Word(R.string.phrase_im_coming, R.string.miwok_phrase_im_coming,R.drawable.hosp38));
        words.add(new Word(R.string.phrase_lets_go, R.string.miwok_phrase_lets_go,R.drawable.hosp39));
        words.add(new Word(R.string.phrase_come_here, R.string.miwok_phrase_come_here,R.drawable.hosp40));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_west);

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
                String[] links = getResources().getStringArray(R.array.linkwest);
                Uri uri = Uri.parse(links[position]);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        return rootView;
    }
}
