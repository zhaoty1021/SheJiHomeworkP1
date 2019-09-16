package org.game.box;

import org.game.role.Role;

public class MoneyBox extends Box{
	double money;
	public MoneyBox(double money) {
		this.isExist=true;
		this.money=money;
	}
	public void boxOpen(Role role) {
		this.isExist=false;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
}
