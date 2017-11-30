package pl.edu.agh.fragments.layout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import pl.edu.agh.fragments.News;
import pl.edu.agh.fragments.R;


public class ArticleFragment extends Fragment {

    private String title;

    public final static String TITLE_PARAM = "TITLE_PARAM";

    public static ArticleFragment newInstance(String title) {
        ArticleFragment fragment = new ArticleFragment();
        Bundle args = new Bundle();
        args.putString(TITLE_PARAM, title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            title = getArguments().getString(TITLE_PARAM);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_article, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView titleTextView = view.findViewById(R.id.title);
        TextView contentTextView = view.findViewById(R.id.content);

        if (title != null) {
            titleTextView.setText(title);
            contentTextView.setText(News.getInstance().getContent(title));
        }
    }
}
