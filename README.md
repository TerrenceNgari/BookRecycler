# BookstoreApp (RecyclerView)

## Overview
BookstoreApp is a mobile application designed for Android that presents a visually appealing grid of popular books. The app features an enhanced RecyclerView that displays book covers, titles, and a "More Details" button in a 2x2 grid format. Users can click on "More Details" to view additional information about a book.

## Features
- Displays a 2x2 grid of popular books using RecyclerView.
- Each book item includes a cover image, title, and a "More Details" button.
- Clicking "More Details" opens a detailed view of the selected book.
- The detail page shows the book's cover, title, author, description, price, and availability.

## Project Setup
1. **Create a New Android Studio Project**
   - Name: `BookstoreApp`
   - Minimum SDK: Choose an appropriate version based on requirements.

2. **Design Main Activity Layout**
   - Implement a `RecyclerView` in the main activity layout (`activity_main.xml`).
   - Configure it to display book items in a 2x2 grid.

3. **Define Data Model (BookModel.java)**
   ```java
   public class BookModel {
       private String title;
       private String author;
       private String description;
       private int coverImageResource;
       private double price;
       private boolean availability;
   }
   ```

4. **Create Sample Data**
   - Populate a list with at least 5 book entries.

5. **Set Up RecyclerView in MainActivity**
   - Configure `RecyclerView` to display books in a `GridLayoutManager` with 2 columns.

6. **Create a Custom Adapter (BookAdapter.java) & ViewHolder (BookViewHolder.java)**
   - `BookAdapter` binds book data to `RecyclerView`.
   - `BookViewHolder` manages individual item layouts.

7. **Modify Adapter for Clickable "More Details" TextView**
   - Add a click listener for the "More Details" text.

8. **Implement Click Listener**
   - Handle item clicks to open the book details activity.

9. **Create BookDetailActivity**
   - Display additional book details in a new activity.

10. **Design BookDetailActivity Layout**
   - Add an `ImageView` for the book cover.
   - Add `TextViews` for the title, author, description, price, and availability.

11. **Pass Data from MainActivity to BookDetailActivity**
   - Use `Intent` to send book details.

12. **Retrieve and Display Book Details**
   - Extract data from `Intent` and display it in `BookDetailActivity`.

13. **Test the Application**
   - Ensure clicking "More Details" opens `BookDetailActivity` with correct book details.

