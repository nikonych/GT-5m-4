package com.example.gt_5m_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gt_5m_4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding){
            btnCalculate.setOnClickListener {
                tvResult.text = Math().add(etFirstNum.text.toString(), etSecondNum.text.toString())
            }
            btnDivide.setOnClickListener {
                tvResult.text = Math().divide(etFirstNum.text.toString(), etSecondNum.text.toString())
            }
        }
    }
}