package org.mdolidon.hamster.core;

import java.util.List;
import java.util.ArrayList;

/**
 * This class lets you store an sequential list of IMatcher complying objects together, and
 * select the proper one for a given link.
 *
 * @param <E> The type of objects that you store. Has to implement IMatcher.
 */
public class MatcherDrivenList<E extends IMatcher> {

	private List<E> elements = new ArrayList<>(10);
	private E defaultElement = null;

	/** 
	 * Add an element to the list.
	 * @param element
	 */
	public void add(E element) {
		if (element == null) {
			throw new NullPointerException();
		}
		elements.add(element);
	}

	/** 
	 * Set the default element. This element does not need to be added with the add method.
	 * @param element
	 */
	public void setDefault(E element) {
		defaultElement = element;
	}

	/**
	 * Give the first element that matches the link. Elements are checked in the order
	 * in which they were added. If none matches, give the default element.
	 * This method throws if no default element was set.
	 * @param link
	 * @return
	 */
	public E getFirstMatch(Link link) {
		if (defaultElement == null) {
			throw new NullPointerException(
					"getFirstMatchingElement can only be called if a default element has been defined");
		}
		for (E element : elements) {
			if (element.matches(link)) {
				return element;
			}
		}
		return defaultElement;
	}

	/**
	 * Give all elements that match a given link. The default element
	 * is not looked up, and will never be part of the result.
	 * If no added elements match, the list is empty.
	 * @param link
	 * @return
	 */
	public List<E> getAllMatches(Link link) {
		ArrayList<E> matchingElements = new ArrayList<>(10);
		for (E element : elements) {
			if (element.matches(link)) {
				matchingElements.add(element);
			}
		}
		return matchingElements;
	}

}
