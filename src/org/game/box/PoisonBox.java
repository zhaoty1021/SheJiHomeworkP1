package org.game.box;

import org.game.role.Role;

public class PoisonBox extends Box{
	public PoisonBox() {
		super();
	}

	public void boxOpen(Role role) {
		this.isExist=false;
	}
}
