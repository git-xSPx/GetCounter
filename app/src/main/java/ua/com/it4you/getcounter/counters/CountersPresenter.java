package ua.com.it4you.getcounter.counters;

import android.support.annotation.NonNull;

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

    }

//    private void loadCounters(boolean forceUpdate, ) {
//
//    }

    @Override
    public void addNewCounter() {
        
    }
}
