package com.lyeeedar.headless

fun addGameAssetTests(funcs: com.badlogic.gdx.utils.Array<Pair<String, ()->Any>>) {
	funcs.add(Pair("CodeTest", {
		MatchUpdateStep.test()
	}))
	funcs.add(Pair("CardContentValidator", { CardContentValidator() }))
	funcs.add(Pair("LevelSolve", { LevelSolver().attemptAllLevels(false) }))
}