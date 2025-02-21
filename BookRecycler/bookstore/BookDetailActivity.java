package com.example.bookstore;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bookstore.R;

public class BookDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);

        com.example.bookstore.BookModel book = (com.example.bookstore.BookModel) getIntent().getSerializableExtra("book");

        //Displays book details
        ((ImageView) findViewById(R.id.detail_cover)).setImageResource(book.getCoverImageResource());
        ((TextView) findViewById(R.id.detail_title)).setText(book.getTitle());
        ((TextView) findViewById(R.id.detail_author)).setText(book.getAuthor());
        ((TextView) findViewById(R.id.detail_description)).setText(book.getDescription());
        ((TextView) findViewById(R.id.detail_price)).setText("Price: $" + book.getPrice());
        ((TextView) findViewById(R.id.detail_availability)).setText(book.isAvailable() ? "Available" : "Out of Stock");
    }
}
