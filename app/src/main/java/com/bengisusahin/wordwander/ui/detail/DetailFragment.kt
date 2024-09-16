package com.bengisusahin.wordwander.ui.detail

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.bengisusahin.wordwander.databinding.FragmentDetailBinding

class DetailFragment : DialogFragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        _binding = FragmentDetailBinding.inflate(layoutInflater)

        val word = arguments?.let {
            DetailFragmentArgs.fromBundle(it).word
        }

        if (word != null) {
            binding.textViewWord.text = word.word
            binding.textViewMeanings.text = word.translations.joinToString(", ") { it.translatedWord }
        }


        val dialog = AlertDialog.Builder(requireContext())
            .setView(binding.root)
            .setCancelable(true)
            .create()

        return dialog
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}

/*
class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val word = arguments?.let {
            DetailFragmentArgs.fromBundle(it).word
        }

        if (word != null) {
            binding.textViewWord.text = word.word
            binding.textViewMeanings.text = word.translations.joinToString(", ") { it.translatedWord }
        }

//        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
//            findNavController().popBackStack()
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
 */