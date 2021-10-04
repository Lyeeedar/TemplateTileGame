package com.lyeeedar.Screens

import com.lyeeedar.Screens.*
import com.lyeeedar.Util.Statics
import java.util.*

actual enum class ScreenEnum
{
	EXAMPLE,
	PARTICLEEDITOR,
	INVALID
}

actual fun registerDebugScreens(): HashMap<ScreenEnum, AbstractScreen>
{
	val screens = HashMap<ScreenEnum, AbstractScreen>()

	if (!Statics.android)
	{
		screens[ScreenEnum.PARTICLEEDITOR] = ParticleEditorScreen()
	}

	return screens
}

actual fun registerGameScreens(): HashMap<ScreenEnum, AbstractScreen>
{
	val screens = HashMap<ScreenEnum, AbstractScreen>()

	screens[ScreenEnum.EXAMPLE] = ExampleScreen()

	return screens
}