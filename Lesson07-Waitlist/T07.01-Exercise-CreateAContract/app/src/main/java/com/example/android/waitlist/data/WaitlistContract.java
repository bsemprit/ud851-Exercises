package com.example.android.waitlist.data;

import android.provider.BaseColumns;

public class WaitlistContract {



    // k (1) Create an inner class named WaitlistEntry class that implements the BaseColumns interface
    private final static class WaitListEntry implements BaseColumns {
        final static String TABLE_NAME = "waitlist";
        final static String COLUMN_GUEST_NAME = "guestName";
        final static String COLUMN_PARTY_SIZE = "partySize";
        final static String COLUMN_TIMESTAMP = "timestamp";
    }

        // k (2) Inside create a static final members for the table name and each of the db columns
        // TABLE_NAME -> waitlist;
        // COLUMN_GUEST_NAME -> guestName
        // COLUMN_PARTY_SIZE -> partySize
        // COLUMN_TIMESTAMP -> timestamp

}
