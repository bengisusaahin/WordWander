package com.bengisusahin.wordwander.ui.words

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bengisusahin.wordwander.R
import com.bengisusahin.wordwander.data.model.Word
import com.bengisusahin.wordwander.databinding.WordRecyclerRowBinding

class WordsAdapter(
    private val words: List<Word>,
    private val onWordClickListener: (Word) -> Unit
) : RecyclerView.Adapter<WordsAdapter.WordViewHolder>() {

    class WordViewHolder(private val binding: WordRecyclerRowBinding ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(word: Word ) {
            word.imageResId?.let { binding.wordImageView.setImageResource(it) }
            binding.wordTextView.text = word.word
            binding.meaningTextView.text = word.translations.joinToString(", ") { it.translatedWord }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val binding = WordRecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WordViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val word = words[position]
        holder.bind(word)

        holder.itemView.setOnClickListener {
            onWordClickListener(word)
        }
    }

    override fun getItemCount(): Int = words.size
}