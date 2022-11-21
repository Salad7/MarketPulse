package com.example.marketpulse.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.marketpulse.R
import com.example.marketpulse.ViewModels.DashboardFragmentViewModel
import com.example.marketpulse.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {
    lateinit var viewModel: DashboardFragmentViewModel
    lateinit var binding: FragmentDashboardBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var inflate = layoutInflater.inflate(R.layout.fragment_dashboard,null)
        viewModel = DashboardFragmentViewModel()
        binding = FragmentDashboardBinding.bind(inflate)
        return binding.root

    }
}