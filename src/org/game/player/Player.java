package org.game.player;

import org.game.box.Box;
import org.game.box.PoisonBox;
import org.game.role.Mage;
import org.game.role.Role;
import org.game.role.Solider;

public class Player {
	private Role role;
	public Player(Role role) {
		this.role=role;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public static void main(String[] args) {
		Role role1=new Solider(100, 100);
		Role role2=new Mage(100, 100);
		Player p=new Player(role1);
		PoisonBox box1=new PoisonBox();
		p.getRole().openBox(box1);
		System.out.println(p.getRole().getHp()+" "+p.getRole().getMoney());
		Player p1=new Player(role2);
		PoisonBox box2=new PoisonBox();
		p1.getRole().openBox(box2);
		System.out.println(p1.getRole().getHp()+" "+p1.getRole().getMoney());
	}
}
