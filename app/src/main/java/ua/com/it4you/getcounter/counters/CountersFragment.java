package ua.com.it4you.getcounter.counters;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import ua.com.it4you.getcounter.R;
import ua.com.it4you.getcounter.data.Counter;

/**
 * A placeholder fragment containing a simple view.
 */
public class CountersFragment extends Fragment implements CountersContract.View {

    private CountersContract.Presenter mPresenter;

    public CountersFragment() {
    }

    public static CountersFragment newInstance() {
        return new CountersFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.counters_frag, container, false);
    }

    private static class CountersAdapter extends BaseAdapter {

        private List<Counter> mCounters;
        
    }
}
