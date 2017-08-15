package com.example.harshitbansal.selectcategory;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, Miwok translation, audio file, and
 * optional image file for that word.
 */
public class Word {

    /** String resource ID for the default translation of the word */
    private int mDefaultHospital;

    /** String resource ID for the Miwok translation of the word */
    private int mDefaultPlace;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(int defaultTranslationId, int miwokTranslationId, int imageResourceId) {
        mDefaultHospital= defaultTranslationId;
        mDefaultPlace = miwokTranslationId;
        mImageResourceId = imageResourceId;

    }

    public int getDefaultHospitalId() {
        return mDefaultHospital;
    }


    public int getDeafultPlaceId() {
        return mDefaultPlace;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}