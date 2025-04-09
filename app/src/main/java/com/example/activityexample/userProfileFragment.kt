package com.example.activityexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.activityexample.databinding.FragmentUserProfileBinding

class userProfileFragment : Fragment(R.layout.fragment_user_profile) {

    private var _binding: FragmentUserProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentUserProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = arguments?.getString("name")
        val email = arguments?.getString("email")

        binding.TextView1.text = name
        binding.TextView2.text = email


        binding.backButton.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}
