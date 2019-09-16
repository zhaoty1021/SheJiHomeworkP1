package org.game.box;

import org.game.role.Role;

public abstract class Box {
	public Box() {
		this.isExist = true;
	}
	boolean isExist;
	public abstract void boxOpen(Role role);
}
