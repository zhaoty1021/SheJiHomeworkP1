package org.game.role;

import org.game.box.PoisonBox;

public class Mage extends Role{
	public Mage(double hp, double money) {
		super(hp, money);
	}
	public void openBox(PoisonBox box) {
		this.hp=0.7*this.hp;
		this.money=1.4*this.money;
	}
}