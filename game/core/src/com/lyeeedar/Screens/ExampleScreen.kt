package com.lyeeedar.Screens

import com.badlogic.gdx.scenes.scene2d.ui.Label
import com.lyeeedar.UI.SpriteWidget
import com.lyeeedar.Util.AssetManager
import com.lyeeedar.Util.Localisation
import com.lyeeedar.Util.Statics

class ExampleScreen : AbstractScreen()
{
	override fun create()
	{
		mainTable.add(Label(Localisation.getText("title", "UI"), Statics.skin))
		mainTable.row()
		mainTable.add(SpriteWidget(AssetManager.loadSprite("player"))).grow()
	}

	override fun doRender(delta: Float)
	{

	}
}