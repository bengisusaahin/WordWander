package com.bengisusahin.wordwander.ui.words

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.bengisusahin.wordwander.databinding.FragmentWordsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WordsFragment : Fragment() {

    private val viewModel: WordsViewModel by viewModels()
    private var _binding: FragmentWordsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWordsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.wordsRecyclerView.layoutManager = LinearLayoutManager(context)

        viewModel.words.observe(viewLifecycleOwner) { words ->
            binding.wordsRecyclerView.adapter = WordsAdapter(words)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}