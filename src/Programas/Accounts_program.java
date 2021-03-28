package Programas;

import classes.Account;
import classes.BussinesAccount;
import classes.SavingsAccount;

public class Accounts_program {

	public static void main(String[] args) {
		Account acc1 = new Account();
		BussinesAccount acc2 = new BussinesAccount();
		SavingsAccount acc3 = new SavingsAccount();
		acc1 = acc2; // upcasting
		acc2 = acc1; // downcasting feito errado
		acc2 = (BussinesAccount) acc1; // downcasting feito certo
		acc3 = (SavingsAccount) acc2; // tambem nao deixa realizar o cast de uma derivada para outra

		// validando se a varaivel do tipo savingaccount é pareavel com a classe
		// businessaccount
		if (acc3 instanceof BussinesAccount) {
			acc3 = (SavingsAccount) acc3;
		}

		Account acc4 = new Account(1, "lucas", 1500);
		acc4.withdraw(100);
		System.out.println(acc4.getBalance());

		BussinesAccount acc5 = new BussinesAccount(1, "lucas", 1500, 1800);
		acc5.withdraw(100);
		System.out.println(acc5.getBalance());

	}

}
