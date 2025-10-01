package com.example.ddwalton_emotilog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.ddwalton_emotilog.databinding.EmojiLogPageBinding;

public class EmojiLogPageFragment extends Fragment {
    EmojiLogger emojiLogger;
    EmojiLogPageBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = EmojiLogPageBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
