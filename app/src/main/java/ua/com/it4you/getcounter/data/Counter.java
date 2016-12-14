package ua.com.it4you.getcounter.data;

import android.support.annotation.NonNull;

import com.google.common.base.Objects;
import com.google.common.base.Strings;

import java.util.UUID;

/**
 * Created by sergey on 14.12.16.
 */

public final class Counter {

    @NonNull
    private final String mId;

    @NonNull
    private final String mTitle;

    @NonNull
    private final CoutersType mType;

    private final String mDescription;

    private final int mLastCount;

    // Use this constructor to create new Counter
    public Counter(@NonNull String title, @NonNull CoutersType type,
                   String description) {
        this(UUID.randomUUID().toString(), title, type, description, 0);
    }

    public Counter(@NonNull String id, @NonNull String title, @NonNull CoutersType type,
                   String description, int lastCount) {
        this.mId = id;
        this.mTitle = title;
        this.mType = type;
        this.mLastCount = lastCount;
        this.mDescription = description;
    }

    @NonNull
    public String getId() {
        return mId;
    }

    @NonNull
    public String getTitle() {
        return mTitle;
    }

    @NonNull
    public CoutersType getType() {
        return mType;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getLastCount() {
        return mLastCount;
    }

    public boolean isEmpty(){
        return Strings.isNullOrEmpty(mTitle);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counter counter = (Counter) o;
        return Objects.equal(mId, counter.mId) &&
                Objects.equal(mTitle, counter.mTitle) &&
                Objects.equal(mType, counter.mType) &&
                Objects.equal(mDescription, counter.mDescription) &&
                Objects.equal(mLastCount, counter.mLastCount);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mId, mTitle, mType);
    }

    @Override
    public String toString() {
        return "Counter with title " + mTitle;
    }
}
