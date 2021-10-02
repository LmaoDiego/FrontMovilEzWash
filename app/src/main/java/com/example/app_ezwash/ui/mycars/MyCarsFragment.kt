package com.example.app_ezwash.ui.mycars

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.app_ezwash.databinding.FragmentMycarsBinding

class MyCarsFragment : Fragment() {
    private lateinit var mycarsViewModel: MyCarsViewModel
    private var _binding: FragmentMycarsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mycarsViewModel =
            ViewModelProvider(this).get(MyCarsViewModel::class.java)

        _binding = FragmentMycarsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMycars
        mycarsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}