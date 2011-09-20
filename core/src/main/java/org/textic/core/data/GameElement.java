package org.textic.core.data;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import org.textic.core.util.Hasher;

public abstract class GameElement {

	protected String id;

	protected String name;

	protected String description;

	public GameElement(String name, String description) {
		this.name = name;
		this.description = description;
		try {
			this.id = Hasher.sha1(this.name + this.description);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public abstract String look();

	@Override
	public abstract String toString();

}
