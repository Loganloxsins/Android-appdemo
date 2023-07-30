package com.baidu.androidlearn.home

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.baidu.androidlearn.home.components.weather.WeatherComponent
import com.baidu.androidlearn.home.components.weather.WeatherViewModel
import com.baidu.androidlearn.home.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private var weatherComponent: WeatherComponent? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentHomeBinding.inflate(inflater, container, false).apply {
            _binding = this
        }

        // 独立的天气组件
        val weatherViewModel = ViewModelProvider(this).get(WeatherViewModel::class.java)
        weatherComponent = WeatherComponent(viewLifecycleOwner, weatherViewModel, binding.componentWeather)

        val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        // 找到搜索输入框和按钮
        val searchInput = binding.search
        val searchButton = binding.searchButton

        // 设置按钮点击事件
        searchButton.setOnClickListener {
            performSearch()
        }

        // 设置输入框回车事件
        searchInput.setOnKeyListener { v, keyCode, event ->
            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                performSearch()
                return@setOnKeyListener true
            }
            return@setOnKeyListener false
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun performSearch() {
        val searchInput = _binding?.search?.text?.toString()
        if (!searchInput.isNullOrEmpty()) {
            val webView = WebView(requireContext())
            webView.loadUrl("https://www.baidu.com/s?wd=$searchInput")

            // 在这里可以根据需要设置WebView的一些属性
            // 比如可以设置WebViewClient、WebChromeClient等
            // webView.webViewClient = WebViewClient()

            // 将WebView添加到布局中
            _binding?.webViewContainer?.removeAllViews()
            _binding?.webViewContainer?.addView(webView)
        }
    }
}
