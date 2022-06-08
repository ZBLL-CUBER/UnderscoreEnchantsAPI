package com.roughlyunderscore.enchantsapi.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player combines two items in an anvil, could be books.
 */
public class EnchantmentsCombineEvent extends Event implements Cancellable {
	private boolean cancelled = false;
	private final @NotNull Player player;

	private final @NotNull ItemStack firstItem, secondItem;
	private static final HandlerList HANDLERS = new HandlerList();

	public EnchantmentsCombineEvent(@NotNull Player player, @NotNull ItemStack firstItem, @NotNull ItemStack secondItem) {
		this.player = player;
		this.firstItem = firstItem;
		this.secondItem = secondItem;
	}

	/**
	 * @return The player involved in the event.
	 */
	@NotNull
	public Player getPlayer() {
		return this.player;
	}

	/**
	 * @return The first item involved in the event.
	 */
	public @NotNull ItemStack getFirstItem() {
		return firstItem;
	}

	/**
	 * @return The second item involved in the event.
	 */
	public @NotNull ItemStack getSecondItem() {
		return secondItem;
	}

	@Override
	public @NotNull HandlerList getHandlers() {
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
