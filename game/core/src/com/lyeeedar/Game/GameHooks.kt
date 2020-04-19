package com.lyeeedar.Game

import com.lyeeedar.ScreenEnum
import com.lyeeedar.Util.Statics

fun save() {

}

fun newGame() {
	Statics.game.switchScreen(ScreenEnum.EXAMPLE)
}

fun load(): Boolean {
	return true
}