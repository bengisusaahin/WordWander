package com.bengisusahin.wordwander.ui.detail

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.bengisusahin.wordwander.R
import com.bengisusahin.wordwander.databinding.FragmentDetailBinding
import com.bengisusahin.wordwander.databinding.FragmentWordsBinding

class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val word = arguments?.let {
            DetailFragmentArgs.fromBundle(it).word
        }

        // Populate your dialog with word details
        binding.wordTextView.text = word?.word
        binding.meaningTextView.text = word?.translations?.joinToString(", ") { it.translatedWord }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}