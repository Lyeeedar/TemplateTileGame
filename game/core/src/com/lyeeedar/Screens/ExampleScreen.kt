package com.lyeeedar.Screens

import com.badlogic.gdx.scenes.scene2d.ui.Image
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
import com.badlogic.gdx.utils.Scaling
import com.lyeeedar.Util.AssetManager

class ExampleScreen : AbstractScreen()
{
	override fun create()
	{
		val IMAGE = "libgdx.png"

		val drawable = TextureRegionDrawable(AssetManager.loadTexture(IMAGE)!!)

		val image = Image(drawable, Scaling.fit)
		mainTable.add(image).grow()
	}

	override fun doRender(delta: Float)
	{

	}
}