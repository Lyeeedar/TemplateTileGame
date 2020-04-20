package com.lyeeedar.Screens

import com.lyeeedar.Util.AbstractGameLoopTest
import kotlinx.coroutines.delay

class GameLoopTest(completionCallback: ()->Unit) : AbstractGameLoopTest(completionCallback) {
	override suspend fun doRun()
	{
		delay(5000)
	}
}