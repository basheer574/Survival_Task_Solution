package com.example.survivaltask.ui.viewholders
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.survivaltask.R

class RankViewHolder(viewItem: View) : RecyclerView.ViewHolder(viewItem) {
    val rank: TextView = viewItem.findViewById(R.id.rank)
    val totalMedals: TextView = viewItem.findViewById(R.id.total_medals)
    val teamCode: TextView = viewItem.findViewById(R.id.team_code)
    val teamName: TextView = viewItem.findViewById(R.id.team_name)
    val goldMedals: TextView = viewItem.findViewById(R.id.text_total_gold_medal)
    val silverMedals: TextView = viewItem.findViewById(R.id.text_total_silver_medal)
    val bronzeMedals: TextView = viewItem.findViewById(R.id.text_total_bronze_medal)
    val topThreeMedal: ImageView = viewItem.findViewById(R.id.top_three_midal)
}