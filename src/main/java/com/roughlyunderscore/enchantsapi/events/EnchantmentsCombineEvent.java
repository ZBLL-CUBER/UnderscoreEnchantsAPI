package com.roughlyunderscore.enchantsapi.events;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

/**
 * Called when a player combines two items in an anvil, could be books.
 */
@SuppressWarnings("unused")
public class EnchantmentsCombineEvent extends Event implements Cancellable {
	private boolean cancelled = false;
	private final @NotNull Player player;

	private final @NotNull Map<Enchantment, Integer> enchantments;
	private static final HandlerList HANDLERS = new HandlerList();

	public EnchantmentsCombineEvent(@NotNull Player player, @NotNull Map<Enchantment, Integer> enchantments) {
		this.player = player;
		this.enchantments = enchantments;
	}

	/**
	 * @return The player involved in the event.
	 */
	@NotNull
	public Player getPlayer() {
		return this.player;
	}

	/**
	 * @return A map of all the enchantments and their levels, involved in the event.
	 */
	public Map<Enchantment, Integer> getEnchantments() {
		return this.enchantments;
	}

	@Override
	public HandlerList getHandlers() {
		return HANDLERS;
	}

	public static HandlerList getHandlerList() {
		return HANDLERS;
	}

	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancelled = cancel;
	}
}
