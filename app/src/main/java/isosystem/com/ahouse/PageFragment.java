package isosystem.com.ahouse;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import isosystem.com.ahouse.R;

public class PageFragment extends Fragment {

    private int mFragmentNumber;

    public PageFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page, container, false);
        mFragmentNumber = getArguments().getInt("ordeal");

        TextView tv = (TextView) rootView.findViewById(R.id.hello_label);
        tv.setText(String.valueOf(mFragmentNumber));

        return rootView;

    }
}