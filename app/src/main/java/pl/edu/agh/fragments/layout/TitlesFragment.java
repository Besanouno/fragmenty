package pl.edu.agh.fragments.layout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import pl.edu.agh.fragments.News;
import pl.edu.agh.fragments.R;

public class TitlesFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_titles, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ListView news = view.findViewById(R.id.news);
        ArrayAdapter adapter = new ArrayAdapter<>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, News.getInstance().getTitles());
        news.setAdapter(adapter);
        news.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String title = (String) parent.getItemAtPosition(position);
                ArticleFragment articleFragment = ArticleFragment.newInstance(title);
                getFragmentManager()
                        .beginTransaction()
                        .add(R.id.fragment_container, articleFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
