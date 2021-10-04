package com.lyeeedar.Util


actual class XmlDataClassLoader
{
	companion object
	{
		fun loadAbstractActionSequenceAction(classID: String): com.lyeeedar.ActionSequence.Actions.AbstractActionSequenceAction
		{
			return when (classID)
			{
				"Permute" -> com.lyeeedar.ActionSequence.Actions.PermuteAction()
				"Repeat" -> com.lyeeedar.ActionSequence.Actions.RepeatAction()
				"ScreenShake" -> com.lyeeedar.ActionSequence.Actions.ScreenShakeAction()
				"SelectTiles" -> com.lyeeedar.ActionSequence.Actions.SelectTilesAction()
				"SetSourcePoint" -> com.lyeeedar.ActionSequence.Actions.SetSourcePointAction()
				"SpawnOneShotParticle" -> com.lyeeedar.ActionSequence.Actions.SpawnOneShotParticleAction()
				"StoreTargets" -> com.lyeeedar.ActionSequence.Actions.StoreTargetsAction()
				"Animation" -> com.lyeeedar.ActionSequence.Actions.AnimationAction()
				"SelectSelf" -> com.lyeeedar.ActionSequence.Actions.SelectSelfAction()
				"BlockTurn" -> com.lyeeedar.ActionSequence.Actions.BlockTurnAction()
				"SpawnTrackedParticle" -> com.lyeeedar.ActionSequence.Actions.SpawnTrackedParticleAction()
				"ReplaceSourceRenderable" -> com.lyeeedar.ActionSequence.Actions.ReplaceSourceRenderableAction()
				"RestoreTargets" -> com.lyeeedar.ActionSequence.Actions.RestoreTargetsAction()
				"LockEntityTargets" -> com.lyeeedar.ActionSequence.Actions.LockEntityTargetsAction()
				"FlightParticle" -> com.lyeeedar.ActionSequence.Actions.FlightParticleAction()
				"AttachParticle" -> com.lyeeedar.ActionSequence.Actions.AttachParticleAction()
				else -> throw RuntimeException("Unknown classID '$classID' for AbstractActionSequenceAction!")
			}
		}
		fun loadAbstractOneShotActionSequenceAction(classID: String): com.lyeeedar.ActionSequence.Actions.AbstractOneShotActionSequenceAction
		{
			return when (classID)
			{
				"Permute" -> com.lyeeedar.ActionSequence.Actions.PermuteAction()
				"SelectSelf" -> com.lyeeedar.ActionSequence.Actions.SelectSelfAction()
				"SelectTiles" -> com.lyeeedar.ActionSequence.Actions.SelectTilesAction()
				"SetSourcePoint" -> com.lyeeedar.ActionSequence.Actions.SetSourcePointAction()
				"SpawnOneShotParticle" -> com.lyeeedar.ActionSequence.Actions.SpawnOneShotParticleAction()
				"StoreTargets" -> com.lyeeedar.ActionSequence.Actions.StoreTargetsAction()
				"BlockTurn" -> com.lyeeedar.ActionSequence.Actions.BlockTurnAction()
				"RestoreTargets" -> com.lyeeedar.ActionSequence.Actions.RestoreTargetsAction()
				"LockEntityTargets" -> com.lyeeedar.ActionSequence.Actions.LockEntityTargetsAction()
				else -> throw RuntimeException("Unknown classID '$classID' for AbstractOneShotActionSequenceAction!")
			}
		}
		fun loadAbstractDurationActionSequenceAction(classID: String): com.lyeeedar.ActionSequence.Actions.AbstractDurationActionSequenceAction
		{
			return when (classID)
			{
				"Animation" -> com.lyeeedar.ActionSequence.Actions.AnimationAction()
				"Repeat" -> com.lyeeedar.ActionSequence.Actions.RepeatAction()
				"ScreenShake" -> com.lyeeedar.ActionSequence.Actions.ScreenShakeAction()
				"SpawnTrackedParticle" -> com.lyeeedar.ActionSequence.Actions.SpawnTrackedParticleAction()
				"ReplaceSourceRenderable" -> com.lyeeedar.ActionSequence.Actions.ReplaceSourceRenderableAction()
				"FlightParticle" -> com.lyeeedar.ActionSequence.Actions.FlightParticleAction()
				"AttachParticle" -> com.lyeeedar.ActionSequence.Actions.AttachParticleAction()
				else -> throw RuntimeException("Unknown classID '$classID' for AbstractDurationActionSequenceAction!")
			}
		}
		fun loadAbstractBehaviourTreeItem(classID: String): com.lyeeedar.AI.BehaviourTree.AbstractBehaviourTreeItem
		{
			return when (classID)
			{
				"Import" -> com.lyeeedar.AI.BehaviourTree.Actions.ImportBehaviourAction()
				"Node" -> com.lyeeedar.AI.BehaviourTree.Actions.NodeBehaviourAction()
				"RunUntilNotFailed" -> com.lyeeedar.AI.BehaviourTree.Nodes.RunUntilNotFailedBehaviourNode()
				"ClearValue" -> com.lyeeedar.AI.BehaviourTree.Actions.ClearValueBehaviourAction()
				"RunOneRandomly" -> com.lyeeedar.AI.BehaviourTree.Nodes.RunOneRandomlyBehaviourNode()
				"Datascope" -> com.lyeeedar.AI.BehaviourTree.Actions.DatascopeBehaviourAction()
				"RunUntilState" -> com.lyeeedar.AI.BehaviourTree.Nodes.RunUntilStateBehaviourNode()
				"SetState" -> com.lyeeedar.AI.BehaviourTree.Actions.SetStateBehaviourAction()
				"SetValue" -> com.lyeeedar.AI.BehaviourTree.Actions.SetValueBehaviourAction()
				"Branch" -> com.lyeeedar.AI.BehaviourTree.Actions.BranchBehaviourAction()
				"Breakpoint" -> com.lyeeedar.AI.BehaviourTree.Actions.BreakpointBehaviourAction()
				"Kill" -> com.lyeeedar.AI.BehaviourTree.Actions.KillBehaviourAction()
				"RunAll" -> com.lyeeedar.AI.BehaviourTree.Nodes.RunAllBehaviourNode()
				"ConvertToPosition" -> com.lyeeedar.AI.BehaviourTree.Actions.ConvertToPositionBehaviourAction()
				"RunUntilNotCompleted" -> com.lyeeedar.AI.BehaviourTree.Nodes.RunUntilNotCompletedBehaviourNode()
				else -> throw RuntimeException("Unknown classID '$classID' for AbstractBehaviourTreeItem!")
			}
		}
		fun loadAbstractBehaviourAction(classID: String): com.lyeeedar.AI.BehaviourTree.Actions.AbstractBehaviourAction
		{
			return when (classID)
			{
				"ClearValue" -> com.lyeeedar.AI.BehaviourTree.Actions.ClearValueBehaviourAction()
				"Import" -> com.lyeeedar.AI.BehaviourTree.Actions.ImportBehaviourAction()
				"Node" -> com.lyeeedar.AI.BehaviourTree.Actions.NodeBehaviourAction()
				"Datascope" -> com.lyeeedar.AI.BehaviourTree.Actions.DatascopeBehaviourAction()
				"SetState" -> com.lyeeedar.AI.BehaviourTree.Actions.SetStateBehaviourAction()
				"SetValue" -> com.lyeeedar.AI.BehaviourTree.Actions.SetValueBehaviourAction()
				"Branch" -> com.lyeeedar.AI.BehaviourTree.Actions.BranchBehaviourAction()
				"Breakpoint" -> com.lyeeedar.AI.BehaviourTree.Actions.BreakpointBehaviourAction()
				"Kill" -> com.lyeeedar.AI.BehaviourTree.Actions.KillBehaviourAction()
				"ConvertToPosition" -> com.lyeeedar.AI.BehaviourTree.Actions.ConvertToPositionBehaviourAction()
				else -> throw RuntimeException("Unknown classID '$classID' for AbstractBehaviourAction!")
			}
		}
		fun loadAbstractBehaviourNode(classID: String): com.lyeeedar.AI.BehaviourTree.Nodes.AbstractBehaviourNode
		{
			return when (classID)
			{
				"RunOneRandomly" -> com.lyeeedar.AI.BehaviourTree.Nodes.RunOneRandomlyBehaviourNode()
				"RunUntilNotFailed" -> com.lyeeedar.AI.BehaviourTree.Nodes.RunUntilNotFailedBehaviourNode()
				"RunUntilState" -> com.lyeeedar.AI.BehaviourTree.Nodes.RunUntilStateBehaviourNode()
				"RunAll" -> com.lyeeedar.AI.BehaviourTree.Nodes.RunAllBehaviourNode()
				"RunUntilNotCompleted" -> com.lyeeedar.AI.BehaviourTree.Nodes.RunUntilNotCompletedBehaviourNode()
				else -> throw RuntimeException("Unknown classID '$classID' for AbstractBehaviourNode!")
			}
		}
		fun loadAbstractComponentData(classID: String): com.lyeeedar.Components.AbstractComponentData
		{
			return when (classID)
			{
				"AdditionalRenderable" -> com.lyeeedar.Components.AdditionalRenderableComponentData()
				"DirectionalSprite" -> com.lyeeedar.Components.DirectionalSpriteComponentData()
				"Renderable" -> com.lyeeedar.Components.RenderableComponentData()
				"BakedLight" -> com.lyeeedar.Components.BakedLightComponentData()
				"Name" -> com.lyeeedar.Components.NameComponentData()
				"Dialogue" -> com.lyeeedar.Components.DialogueComponentData()
				"Position" -> com.lyeeedar.Components.PositionComponentData()
				"Light" -> com.lyeeedar.Components.LightComponentData()
				"MetaRegion" -> com.lyeeedar.Components.MetaRegionComponentData()
				else -> throw RuntimeException("Unknown classID '$classID' for AbstractComponentData!")
			}
		}
		fun loadAbstractMapGenerationAction(classID: String): com.lyeeedar.MapGeneration.Nodes.AbstractMapGenerationAction
		{
			return when (classID)
			{
				"ChambersGenerator" -> com.lyeeedar.MapGeneration.Nodes.ChambersGeneratorAction()
				"Condition" -> com.lyeeedar.MapGeneration.Nodes.ConditionAction()
				"DefineVariable" -> com.lyeeedar.MapGeneration.Nodes.DefineVariableAction()
				"Fill" -> com.lyeeedar.MapGeneration.Nodes.FillAction()
				"Filter" -> com.lyeeedar.MapGeneration.Nodes.FilterAction()
				"FindRooms" -> com.lyeeedar.MapGeneration.Nodes.FindRoomsAction()
				"Flip" -> com.lyeeedar.MapGeneration.Nodes.FlipAction()
				"PerPoint" -> com.lyeeedar.MapGeneration.Nodes.PerPointAction()
				"Repeat" -> com.lyeeedar.MapGeneration.Nodes.RepeatAction()
				"Scale" -> com.lyeeedar.MapGeneration.Nodes.ScaleAction()
				"SelectNamedArea" -> com.lyeeedar.MapGeneration.Nodes.SelectNamedAreaAction()
				"Split" -> com.lyeeedar.MapGeneration.Nodes.SplitAction()
				"SquidlibDungeonGenerator" -> com.lyeeedar.MapGeneration.Nodes.SquidlibDungeonGeneratorAction()
				"SquidlibLanesMapGenerator" -> com.lyeeedar.MapGeneration.Nodes.SquidlibLanesMapGeneratorAction()
				"SquidlibOrganicMapGenerator" -> com.lyeeedar.MapGeneration.Nodes.SquidlibOrganicMapGeneratorAction()
				"SquidlibSerpentMapGenerator" -> com.lyeeedar.MapGeneration.Nodes.SquidlibSerpentMapGeneratorAction()
				"SquidlibSymmetryGenerator" -> com.lyeeedar.MapGeneration.Nodes.SquidlibSymmetryGeneratorAction()
				"Translate" -> com.lyeeedar.MapGeneration.Nodes.TranslateAction()
				"SquidlibDenseRoomGenerator" -> com.lyeeedar.MapGeneration.Nodes.SquidlibDenseRoomGeneratorAction()
				"Node" -> com.lyeeedar.MapGeneration.Nodes.NodeAction()
				"Divide" -> com.lyeeedar.MapGeneration.Nodes.DivideAction()
				"Defer" -> com.lyeeedar.MapGeneration.Nodes.DeferAction()
				"SquidlibFlowingCaveGenerator" -> com.lyeeedar.MapGeneration.Nodes.SquidlibFlowingCaveGeneratorAction()
				"Take" -> com.lyeeedar.MapGeneration.Nodes.TakeAction()
				"Datascope" -> com.lyeeedar.MapGeneration.Nodes.DatascopeAction()
				"Rotate" -> com.lyeeedar.MapGeneration.Nodes.RotateAction()
				"SetNamedArea" -> com.lyeeedar.MapGeneration.Nodes.SetNamedAreaAction()
				"SquidlibSectionGenerator" -> com.lyeeedar.MapGeneration.Nodes.SquidlibSectionGeneratorAction()
				else -> throw RuntimeException("Unknown classID '$classID' for AbstractMapGenerationAction!")
			}
		}

	}
}
