package org.game.role;

import org.game.box.MoneyBox;
import org.game.box.PoisonBox;

public class Role {
	double hp;
	double money;
	public Role(double hp, double money) {
		this.hp = hp;
		this.money = money;
	}
	public double getHp() {
		return hp;
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public void openBox(PoisonBox box) {}
	public void openBox(MoneyBox box) {
		this.money=box.getMoney();
		box.setMoney(0);
	}
}
