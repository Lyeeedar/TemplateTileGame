package com.lyeeedar.Components

actual enum class ComponentType private constructor(val constructor: ()->AbstractComponent)
{
	ActionSequence({ ActionSequenceComponent() }),
	AdditionalRenderable({ AdditionalRenderableComponent() }),
	ArchetypeBuilder({ ArchetypeBuilderComponent() }),
	BakedLight({ BakedLightComponent() }),
	Blood({ BloodComponent() }),
	Dialogue({ DialogueComponent() }),
	DirectionalSprite({ DirectionalSpriteComponent() }),
	Event({ EventComponent() }),
	Light({ LightComponent() }),
	LoadData({ LoadDataComponent() }),
	MarkedForDeletion({ MarkedForDeletionComponent() }),
	MetaRegion({ MetaRegionComponent() }),
	Name({ NameComponent() }),
	Position({ PositionComponent() }),
	Renderable({ RenderableComponent() }),
	Task({ TaskComponent() }),
	Transient({ TransientComponent() });

	companion object
	{
		val Values = ComponentType.values()
		val Temporary = arrayOf( MarkedForDeletion, Transient )
	}
}

inline fun Entity.actionSequence(): ActionSequenceComponent? = this.components[ComponentType.ActionSequence.ordinal] as ActionSequenceComponent?
inline fun Entity.additionalRenderable(): AdditionalRenderableComponent? = this.components[ComponentType.AdditionalRenderable.ordinal] as AdditionalRenderableComponent?
inline fun Entity.archetypeBuilder(): ArchetypeBuilderComponent? = this.components[ComponentType.ArchetypeBuilder.ordinal] as ArchetypeBuilderComponent?
inline fun Entity.bakedLight(): BakedLightComponent? = this.components[ComponentType.BakedLight.ordinal] as BakedLightComponent?
inline fun Entity.blood(): BloodComponent? = this.components[ComponentType.Blood.ordinal] as BloodComponent?
inline fun Entity.dialogue(): DialogueComponent? = this.components[ComponentType.Dialogue.ordinal] as DialogueComponent?
inline fun Entity.directionalSprite(): DirectionalSpriteComponent? = this.components[ComponentType.DirectionalSprite.ordinal] as DirectionalSpriteComponent?
inline fun Entity.event(): EventComponent? = this.components[ComponentType.Event.ordinal] as EventComponent?
inline fun Entity.light(): LightComponent? = this.components[ComponentType.Light.ordinal] as LightComponent?
inline fun Entity.loadData(): LoadDataComponent? = this.components[ComponentType.LoadData.ordinal] as LoadDataComponent?
inline fun Entity.markedForDeletion(): MarkedForDeletionComponent? = this.components[ComponentType.MarkedForDeletion.ordinal] as MarkedForDeletionComponent?
inline fun Entity.metaRegion(): MetaRegionComponent? = this.components[ComponentType.MetaRegion.ordinal] as MetaRegionComponent?
inline fun Entity.name(): NameComponent? = this.components[ComponentType.Name.ordinal] as NameComponent?
inline fun Entity.position(): PositionComponent? = this.components[ComponentType.Position.ordinal] as PositionComponent?
inline fun Entity.renderable(): RenderableComponent? = this.components[ComponentType.Renderable.ordinal] as RenderableComponent?
inline fun Entity.task(): TaskComponent? = this.components[ComponentType.Task.ordinal] as TaskComponent?
inline fun Entity.transient(): TransientComponent? = this.components[ComponentType.Transient.ordinal] as TransientComponent?

