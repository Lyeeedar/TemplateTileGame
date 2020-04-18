package com.lyeeedar

import com.lyeeedar.Screens.*
import com.lyeeedar.Util.Statics
import java.util.*

val DEBUG_SCREEN_OVERRIDE: ScreenEnum? = null

enum class ScreenEnum
{
	NEWUSER,
	GRID,
	QUEST,
	CARD,
	DECK,
	QUESTSELECTION,
	PARTICLEEDITOR,
	TESTCARDLOOK,
	INVALID
}

fun registerDebugScreens(): HashMap<ScreenEnum, AbstractScreen>
{
	val screens = HashMap<ScreenEnum, AbstractScreen>()

	if (!Statics.android)
	{
		screens[ScreenEnum.PARTICLEEDITOR] = ParticleEditorScreen()
	}

	return screens
}

fun registerGameScreens(): HashMap<ScreenEnum, AbstractScreen>
{
	val screens = HashMap<ScreenEnum, AbstractScreen>()

	return screens
}