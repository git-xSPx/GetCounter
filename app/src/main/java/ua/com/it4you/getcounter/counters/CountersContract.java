package ua.com.it4you.getcounter.counters;

import java.util.List;

import ua.com.it4you.getcounter.BasePresenter;
import ua.com.it4you.getcounter.BaseView;
import ua.com.it4you.getcounter.data.Counter;

/**
 * Created by sergey on 14.12.16.
 */

public interface CountersContract {

    interface View extends BaseView<Presenter> {

        void showCounters(List<Counter> counters);

        void showAddCounter();

        boolean isActive();

    }

    interface Presenter extends BasePresenter {

        void loadCounters(boolean forceUpdate);

        void addNewCounter();

    }
}
