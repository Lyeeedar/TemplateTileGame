package com.lyeeedar.Screens

import com.lyeeedar.UI.SpriteWidget
import com.lyeeedar.Util.AssetManager

class ExampleScreen : AbstractScreen()
{
	override fun create()
	{
		mainTable.add(SpriteWidget(AssetManager.loadSprite("player"))).grow()
	}

	override fun doRender(delta: Float)
	{

	}
}