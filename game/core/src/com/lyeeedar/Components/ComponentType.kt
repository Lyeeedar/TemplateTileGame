package com.lyeeedar.Components

enum class ComponentType private constructor(val constructor: ()->AbstractComponent)
{
	// Engine
	ArchetypeBuilder({ ArchetypeBuilderComponent() }),
	AdditionalRenderable({ AdditionalRenderableComponent() }),
	Dialogue({ DialogueComponent() }),
	DirectionalSprite({ DirectionalSpriteComponent() }),
	Event({ EventComponent() }),
	LoadData({ LoadDataComponent() }),
	MarkedForDeletion({ MarkedForDeletionComponent() }),
	MetaRegion({ MetaRegionComponent() }),
	Name({ NameComponent() }),
	Occludes({ OccludesComponent() }),
	Position({ PositionComponent() }),
	Renderable({ RenderableComponent() }),
	Transient({ TransientComponent() });

	companion object
	{
		val Values = ComponentType.values()
		val Temporary = arrayOf( MarkedForDeletion, Transient )
	}
}