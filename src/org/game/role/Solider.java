package org.game.role;

import org.game.box.PoisonBox;

public class Solider extends Role{
	public Solider(double hp, double money) {
		super(hp, money);
	}
	public void openBox(PoisonBox box) {
		this.hp=0.9*this.hp;
		this.money=1.2*this.money;
	}
}
