package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Miwok translation, and an image for that word.
 */
public class Word {

    /** Default translation for the word */
    private int mDefaultTranslationId;

    /** Miwok translation for the word */
    private int mMiwokTranslationId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Audio resource ID for the word */
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslationId is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslationId is the word in the Miwok language
     * @param audioResourceId is the audio of the word spoken in Miwok
     */
    public Word(int defaultTranslationId, int miwokTranslationId, int audioResourceId) {
        mDefaultTranslationId = defaultTranslationId;
        mMiwokTranslationId = miwokTranslationId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslationId is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslationId is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * @param audioResourceId is the audio of the word spoken in Miwok
     */

    public Word(int defaultTranslationId, int miwokTranslationId, int imageResourceId, int audioResourceId) {
        mDefaultTranslationId = defaultTranslationId;
        mMiwokTranslationId = miwokTranslationId;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    // Get the default translation of the word.
    public int getdefaultTranslationId() {
        return mDefaultTranslationId;
    }

    // Get the Miwok translation of the word.
    public int getmiwokTranslationId() {
        return mMiwokTranslationId;
    }

    // Return the image resource ID of the word.
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Returns whether or not there is an image for this word.
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    // Returns the raw resource ID of the word.
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}