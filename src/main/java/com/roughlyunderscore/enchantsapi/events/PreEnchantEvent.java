package com.roughlyunderscore.enchantsapi.events;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player uses /ue enchant or an enchantment table.
 */
public class PreEnchantEvent extends Event implements Cancellable {
	private boolean cancelled = false;
	private final @NotNull Player player;
	private final @NotNull Enchantment enchantment;
	private final @NotNull ItemStack item;
	private int level;

	private static final HandlerList HANDLERS = new HandlerList();

	public PreEnchantEvent(@NotNull Player player, @NotNull Enchantment enchantment, int level, @NotNull ItemStack item) {
		this.player = player;
		this.enchantment = enchantment;
		this.level = level;
		this.item = item;
	}

	/**
	 * @return The item involved in the event.
	 */
	public @NotNull ItemStack getItem() {
		return item;
	}

	/**
	 * @return The player involved in the event.
	 */
	@NotNull
	public Player getPlayer() {
		return this.player;
	}

	/**
	 * @return The applied enchantment.
	 */
	@NotNull
	public Enchantment getEnchantment() {
		return this.enchantment;
	}

	/**
	 * @return The enchantment level.
	 */
	public int getLevel() {
		return this.level;
	}

	/**
	 * Sets the enchantment level to a new one.
	 * @param level the new level
	 */
	public void setLevel(int level) {
		this.level = level;
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
