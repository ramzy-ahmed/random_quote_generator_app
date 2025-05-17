package com.random.quote.generator;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView quoteTextView,authorTextView;
    private ImageButton newQuoteButton,shareButton;
    private ImageView imageQuotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageQuotes =findViewById(R.id.imageQuote);
        quoteTextView = findViewById(R.id.quoteTextView);
        authorTextView = findViewById(R.id.authorTextView);
        newQuoteButton = findViewById(R.id.newQuoteButton);
        shareButton = findViewById(R.id.shareButton);

        newQuoteButton.setOnClickListener(v -> showNewQuote());
        shareButton.setOnClickListener(v -> shareQuote());
        showNewQuote();
    }

    private void showNewQuote() {
        Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        // نبدأ بعمل fade out للنص الحالي
        quoteTextView.startAnimation(fadeOut);
        authorTextView.startAnimation(fadeOut);
        imageQuotes.startAnimation(fadeOut);

        fadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationEnd(Animation animation) {
                // بعد ما يخلص fade out، نحدّث النص ونبدأ fade in
                Quote quote = QuoteProvider.getRandomQuote();
                quoteTextView.setText(quote.getText());
                authorTextView.setText(quote.getAuthor());
                imageQuotes.startAnimation(fadeIn);
                quoteTextView.startAnimation(fadeIn);
                authorTextView.startAnimation(fadeIn);
            }

            @Override public void onAnimationStart(Animation animation) {}
            @Override public void onAnimationRepeat(Animation animation) {}
        });
    }
    private void shareQuote() {
        String fullQuote = "“ "+quoteTextView.getText()+ " ”" + "\n \n" + authorTextView.getText();
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, fullQuote);
        startActivity(Intent.createChooser(shareIntent, "Share Quote"));
    }
}