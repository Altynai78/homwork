package com.example.homwork.ui.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.homwork.R
import com.example.homwork.databinding.FragmentOnBoardBinding
import com.example.homwork.ui.adapter.OnBoardingAdapter

class OnBoardFragment : Fragment() {
    private lateinit var binding: FragmentOnBoardBinding
    private val adapter = OnBoardingAdapter(this::onStartClick, this::onNextClick)
    private lateinit var pref: Pref
    private fun setIndicator() {
        val indicator: CircleIndicator3 = this.binding.indicator
        val viewPager = binding.viewPager
        indicator.setViewPager(viewPager)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewPager.adapter = adapter
        setIndicator()
        pref = Pref(requireContext())
    }

    private fun onStartClick() {
        pref.saveSeen()
        findNavController().navigateUp()

    }

    private fun onNextClick() {
        binding.viewPager.setCurrentItem(getItem(1), true)
    }

    private fun getItem(i: Int): Int {
        return this.binding.viewPager.currentItem + i
    }


}

