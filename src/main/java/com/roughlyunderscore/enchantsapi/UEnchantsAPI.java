package com.roughlyunderscore.enchantsapi;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

public interface UEnchantsAPI {

	/**
	 * Enchants an ItemStack with an enchantment of this name
	 * @param item the item to enchant
	 * @param name the name of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found or if the level exceeds the maximum or is lower than 1.
	 */
	void enchant(ItemStack item, String name, int level) throws IllegalArgumentException;

	/**
	 * Enchants an ItemStack with an enchantment, found by this namespaced key
	 * @param item the item to enchant
	 * @param key the namespaced key of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found or if the level exceeds the maximum or is lower than 1.
	 */
	void enchant(ItemStack item, NamespacedKey key, int level) throws IllegalArgumentException;

	/**
	 * Enchants an ItemStack with a given enchantment
	 * @param item the item to enchant
	 * @param ench the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the level exceeds the maximum or is lower than 1.
	 */
	void enchant(ItemStack item, Enchantment ench, int level) throws IllegalArgumentException;

	/**
	 * Enchants a player's item with an enchantment of this name
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param name the name of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found or if the level exceeds the maximum or is lower than 1.
	 */
	void enchant(Player player, EquipmentSlot slot, String name, int level) throws IllegalArgumentException;

	/**
	 * Enchants a player's item with an enchantment, found by this namespaced key
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param key the namespaced key of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found or if the level exceeds the maximum or is lower than 1.
	 */
	void enchant(Player player, EquipmentSlot slot, NamespacedKey key, int level) throws IllegalArgumentException;

	/**
	 * Enchants a player's item with a given enchantment
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param ench the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the level exceeds the maximum or is lower than 1.
	 */
	void enchant(Player player, EquipmentSlot slot, Enchantment ench, int level) throws IllegalArgumentException;



	/**
	 * Enchants an ItemStack with an enchantment of this name with no level restrictions
	 * @param item the item to enchant
	 * @param name the name of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found
	 */
	void enchantUnrestricted(ItemStack item, String name, int level) throws IllegalArgumentException;

	/**
	 * Enchants an ItemStack with an enchantment, found by this namespaced key with no level restrictions
	 * @param item the item to enchant
	 * @param key the namespaced key of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found
	 */
	void enchantUnrestricted(ItemStack item, NamespacedKey key, int level) throws IllegalArgumentException;

	/**
	 * Enchants an ItemStack with a given enchantment with no level restrictions
	 * @param item the item to enchant
	 * @param ench the enchantment
	 * @param level the level of the enchantment
	 */
	void enchantUnrestricted(ItemStack item, Enchantment ench, int level);

	/**
	 * Enchants a player's item with an enchantment of this name with no level restrictions
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param name the name of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found
	 */
	void enchantUnrestricted(Player player, EquipmentSlot slot, String name, int level) throws IllegalArgumentException;

	/**
	 * Enchants a player's item with an enchantment, found by this namespaced key with no level restrictions
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param key the namespaced key of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found
	 */
	void enchantUnrestricted(Player player, EquipmentSlot slot, NamespacedKey key, int level) throws IllegalArgumentException;

	/**
	 * Enchants a player's item with a given enchantment with no level restrictions
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param ench the enchantment
	 * @param level the level of the enchantment
	 */
	void enchantUnrestricted(Player player, EquipmentSlot slot, Enchantment ench, int level);
}
