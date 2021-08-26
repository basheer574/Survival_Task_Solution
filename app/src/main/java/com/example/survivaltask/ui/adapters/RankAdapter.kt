package com.example.survivaltask.ui.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
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

            if(position==0){
                topThreeMedal.background.setTint(holder.itemView.resources.getColor(R.color.gold_color))
                topThreeMedal.visibility = View.VISIBLE
            }

            else if(position==1){
                topThreeMedal.background.setTint(holder.itemView.resources.getColor(R.color.silver_color))
                topThreeMedal.visibility = View.VISIBLE
            }

            else if(position==2){
                topThreeMedal.background.setTint(holder.itemView.resources.getColor(R.color.bronze_color))
                topThreeMedal.visibility = View.VISIBLE
            }
            else
                topThreeMedal.visibility = View.GONE
        }

    }

    override fun getItemCount(): Int = list.size
}