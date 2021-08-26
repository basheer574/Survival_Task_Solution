package com.example.survivaltask.Data

object DataManager {
    private val rankList = mutableListOf<Achievements>()
    val ranks : List<Achievements>
    get() = rankList

    private var rankIndex = 0

    fun addRank(achievements: Achievements){
        rankList.add(achievements)
    }
    fun getCurrentRank() : Achievements = rankList[rankIndex]

    fun getNextRank() : Achievements {
        rankIndex++
        if(rankIndex==rankList.size)
            rankIndex = 0
        return rankList[rankIndex]
    }
    fun getPreviousRank() : Achievements {
        rankIndex--
        if(rankIndex==-1)
            rankIndex = rankList.size - 1
        return rankList[rankIndex]
    }
}