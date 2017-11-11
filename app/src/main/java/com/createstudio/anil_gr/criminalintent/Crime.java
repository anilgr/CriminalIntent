package com.createstudio.anil_gr.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by anil_gr on 10-01-2017.
 */
public class Crime {


    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
// Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
