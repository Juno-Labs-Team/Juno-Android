package com.junolabs.juno.ui.rides

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.junolabs.juno.databinding.FragmentRidesBinding

class RidesFragment : Fragment() {

    private var _binding: FragmentRidesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val ridesViewModel = ViewModelProvider(this).get(RidesViewModel::class.java)

        _binding = FragmentRidesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textRides
        ridesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}