package com.example.ddwalton_emotilog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class EmojiLoggingPageFragment extends Fragment {

    private FragmentEmojiLoggingPageBinding binding;
    private TextView showCountTextView;

    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = EmojiLoggingPageBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        // Inflate the layout for this fragment
        View EmojiLoggingPageLayout = inflater.inflate(R.layout.emoji_logging_page_layout, container, false);

        String[] emojiArray = {"😁", "😢", "😠", "😍", "😱", "😳", "😴", "🤤", "🤯"};
        GridLayout emojiGridLayout = binding.emoji_grid_layout;

        for (String emoji : emojiArray) {
            Button emojiButton = (Button) inflater.inflate(R.layout.emoji_button_layout, emojiGridLayout, false);
            emojiButton.setText(emoji);
            emojiButton.setOnClickListener(v -> {
                // Handle emoji button click
            });
            emojiGridLayout.addView(emojiButton);
        }

        return EmojiLoggingPageLayout;

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
