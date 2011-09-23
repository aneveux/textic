package org.textic.core.data;

import java.util.LinkedHashSet;

import org.textic.core.util.StringCreator;

@SuppressWarnings("serial")
public class ItemCollection<T extends Item> extends LinkedHashSet<T> {

	@Override
	public String toString() {
		StringCreator sc = new StringCreator();
		for (Item i : this)
			sc.println(i.toString());
		return sc.toString();
	}

	public String look() {
		StringCreator sc = new StringCreator();
		for (Item i : this)
			sc.println(i.look());
		return sc.toString();
	}

}
