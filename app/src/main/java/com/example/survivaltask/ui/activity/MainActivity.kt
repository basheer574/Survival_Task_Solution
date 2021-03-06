package com.example.survivaltask.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.survivaltask.Data.DataManager
import com.example.survivaltask.R
import com.example.survivaltask.databinding.ActivityMainBinding
import com.example.survivaltask.ui.adapters.RankAdapter
import com.example.survivaltask.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        openCsv()
        getData()
    }

    private fun getData(){
        val adapter = RankAdapter(DataManager.ranks)
        binding.recyclerView.adapter = adapter
    }
    private fun openCsv(){
        val inputStream = assets.open("tokyo_2021.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val parser = CsvParser()

        buffer.forEachLine {
            val currentRank = parser.parse(it)
            DataManager.addRank(currentRank)
        }
    }
}

