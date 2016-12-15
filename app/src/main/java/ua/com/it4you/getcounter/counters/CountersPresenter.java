package ua.com.it4you.getcounter.counters;

import android.support.annotation.NonNull;

import java.util.List;

import ua.com.it4you.getcounter.data.Counter;
import ua.com.it4you.getcounter.data.source.CountersDataSource;

/**
 * Created by sergey on 14.12.16.
 */

public class CountersPresenter implements CountersContract.Presenter {

    private final CountersDataSource mCountersRepository;

    private final CountersContract.View mCountersView;

    private boolean mFirstLoad;

    public CountersPresenter(@NonNull CountersDataSource countersRepository, @NonNull CountersContract.View countersView) {
        mCountersRepository = countersRepository;
        mCountersView = countersView;

        mCountersView.setPresenter(this);
    }

    @Override
    public void Start() {
        loadCounters(false);
    }

    @Override
    public void loadCounters(boolean forceUpdate) {

        if (forceUpdate) {
            mCountersRepository.refreshCounters();
        }

        mCountersRepository.getCounters(new CountersDataSource.LoadCountersCallback() {
            @Override
            public void onCountersLoaded(List<Counter> counters) {
                mCountersView.showCounters(counters);
            }
        });
    }

//    private void loadCounters(boolean forceUpdate, ) {
//
//    }

//    @Override
//    public void addNewCounter() {
//
//    }
}
