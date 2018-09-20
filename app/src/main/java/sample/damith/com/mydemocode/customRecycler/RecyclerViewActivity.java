package sample.damith.com.mydemocode.customRecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import sample.damith.com.mydemocode.R;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<Movie> movies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_demo);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        movies = new ArrayList<>();
        movies.add(new Movie("Todd Miller","Project Manager"));
        movies.add(new Movie("Bradley Matthews","Senior Developer"));
        movies.add(new Movie("Harley Gibson","Lead Developer"));
        movies.add(new Movie("Gary Thompson","Lead Developer"));
        movies.add(new Movie("Corey Williamson","UI/UX Developer"));
        movies.add(new Movie("Samuel Jones","Front-End Developer"));
        movies.add(new Movie("Michael Read","Backend Developer"));
        movies.add(new Movie("Robert Phillips","Android Developer"));
        movies.add(new Movie("Albert Stewart","Web Developer"));
        movies.add(new Movie("Wayne Diaz","Junior Developer"));

        mAdapter = new CustomRecyclerAdapter(this, movies);

        recyclerView.setAdapter(mAdapter);
    }
}
