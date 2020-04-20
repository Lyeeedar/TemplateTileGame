package com.lyeeedar.Game

import com.lyeeedar.ScreenEnum
import com.lyeeedar.Util.Settings
import com.lyeeedar.Util.Statics

fun save() {

}

fun newGame() {
	Statics.settings = Settings()

	Statics.game.switchScreen(ScreenEnum.EXAMPLE)

	Statics.analytics.tutorialBegin()
}

fun load(): Boolean {
	return false
}