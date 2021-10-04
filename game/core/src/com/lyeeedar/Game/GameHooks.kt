package com.lyeeedar.Game

import com.lyeeedar.Screens.ScreenEnum
import com.lyeeedar.Util.Settings
import com.lyeeedar.Util.Statics

actual fun save() {

}

actual fun newGame() {
	Statics.settings = Settings()

	Statics.game.switchScreen(ScreenEnum.EXAMPLE)

	Statics.analytics.tutorialBegin()
}

actual fun load(): Boolean {
	return false
}