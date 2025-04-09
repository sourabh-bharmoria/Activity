package com.example.activityexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.activityexample.databinding.FragmentUserInputBinding


class userInputFragment : Fragment() {
    private var _binding: FragmentUserInputBinding? = null
    private val binding get() = _binding!!
 //   private lateinit var binding: FragmentUserInputBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUserInputBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.submitButton.setOnClickListener {
            val name = binding.EditText1.text.toString()
            val email = binding.EditText2.text.toString()

            val bundle = Bundle().apply {
                putString("name",name)
                putString("email",email)
            }

            val profileFragment = userProfileFragment()
            profileFragment.arguments = bundle

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_view,profileFragment)
                .addToBackStack(null)
                .commit()
            }

        }

}

