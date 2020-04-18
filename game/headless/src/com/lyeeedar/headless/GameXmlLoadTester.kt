package com.lyeeedar.headless

import com.lyeeedar.Util.XmlData
import java.util.*

class GameXmlLoadTester
{
	companion object
	{
		fun testLoad(xml: XmlData, path: String)
		{
			when (xml.name.toUpperCase(Locale.ENGLISH))
			{
				"QUEST" -> Quest.load(path.split("Quests/")[1]).getCard()
				"CARD" -> Card.load(path).nodes.forEach { it.getCard() }
				"CARDCONTENT" -> CardContent.load(path)
				"LEVEL" -> Level.load(path)
				"HEAD", "BODY", "MAINHAND", "OFFHAND" -> Equipment.load(path).getCard(null, false)
				"CHARACTER" -> Character.load(path.split("Characters/")[1]).getCard()
				"FACTION" -> Faction.load(path.split("Factions/")[1])
				"ORBS", "DATA" -> { }
				"THEME" -> Theme.load(path)
			}
		}
	}
}