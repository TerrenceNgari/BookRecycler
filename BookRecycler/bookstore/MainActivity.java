package com.example.bookstore;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookstore.BookAdapter;
import com.example.bookstore.R;
import com.example.bookstore.BookModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<com.example.bookstore.BookModel> bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        // Sample books
        bookList = new ArrayList<>();
        bookList.add(new com.example.bookstore.BookModel("Will", "Will Smith", "Will's Life.", R.drawable.book1, 19.99, true));
        bookList.add(new com.example.bookstore.BookModel("Trevor Noah", "Trevor Noah", "Trevor's Life", R.drawable.book2, 24.99, true));
        bookList.add(new com.example.bookstore.BookModel("Denzel Washington", "Denzel Washington", "Denzel's Life", R.drawable.book3, 29.99, false));
        bookList.add(new com.example.bookstore.BookModel("Java", "Nathan Clark", "Beginner's guide to Java.", R.drawable.book4, 19.99, true));
        bookList.add(new com.example.bookstore.BookModel("Python ", "Mark Reed", "Comprehensive Python guide.", R.drawable.book5, 24.99, true));
        bookList.add(new com.example.bookstore.BookModel("C", "Darrel", "Learn C with ease.", R.drawable.book6, 29.99, false));
        BookAdapter adapter = new BookAdapter(this, bookList);
        recyclerView.setAdapter(adapter);
    }
}
