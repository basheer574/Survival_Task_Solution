package com.example.survivaltask.util

import com.example.survivaltask.Data.Achievements

class CsvParser {

    fun parse(line: String): Achievements {
        val tokens = line.replace("\"Hong Kong, China\"","\"Hong Kong China\"").split(",")
        return Achievements(
            rank = tokens[Constants.CoulmnIndex.RANK].toInt(),
            team = tokens[Constants.CoulmnIndex.TEAM],
            gold_medal = tokens[Constants.CoulmnIndex.GOLD_MEDAL].toInt(),
            silver_medal = tokens[Constants.CoulmnIndex.SILVER_MEDAL].toInt(),
            bronze_medal = tokens[Constants.CoulmnIndex.BRONZE_MEDAL].toInt(),
            total_medals = tokens[Constants.CoulmnIndex.TOTAL_MEDALS].toInt(),
            noc_code = tokens[Constants.CoulmnIndex.NOC_CODE]
        )
    }
}