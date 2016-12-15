package ua.com.it4you.getcounter.data.source;

import android.support.annotation.NonNull;

import java.util.List;

import ua.com.it4you.getcounter.data.Counter;

/**
 * Created by sergey on 14.12.16.
 */

public interface CountersDataSource {

    interface LoadCountersCallback {

        void onCountersLoaded(List<Counter> counters);

//        void onDataNotAvailable();
    }

    interface GetCounterCallback {

        void onCounterLoaded(Counter counter);

//        void onDataNotAvailable();
    }

    void getCounters(@NonNull LoadCountersCallback callback);

    void getCounter(@NonNull String counterId, @NonNull GetCounterCallback callback);

    void saveCounter(@NonNull Counter counter);

    void refreshCounters();

    void deleteAllCounters();

    void deleteCounter(@NonNull String CounterId);

}
