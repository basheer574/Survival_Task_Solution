package com.example.survivaltask.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.survivaltask.Data.Achievements
import com.example.survivaltask.R
import com.example.survivaltask.ui.viewholders.RankViewHolder

class RankAdapter(val list: List<Achievements>) : RecyclerView.Adapter<RankViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RankViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_rank,parent,false)
        return RankViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RankViewHolder, position: Int) {
        val currentRank = list[position]
        holder.apply {
            teamCode.text = currentRank.noc_code.toString()
            goldMedals.text = currentRank.gold_medal.toString()
            silverMedals.text = currentRank.silver_medal.toString()
            bronzeMedals.text = currentRank.bronze_medal.toString()
            teamName.text = currentRank.team
            totalMedals.text = ("Total Medals ${currentRank.total_medals}").toString()
            rank.text = ("Rank # ${currentRank.rank}").toString()
        }

    }

    override fun getItemCount(): Int = list.size
}