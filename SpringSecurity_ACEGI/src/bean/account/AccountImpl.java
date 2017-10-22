package bean.account;

public class AccountImpl implements Account {

	private double balance = 0;

	@Override
	public double withdrow(double amount) throws Exception {

		if (balance < amount)
			throw new Exception("Balance is not enough for this transaction.");
		balance = balance - amount;
		return balance;
	}

	@Override
	public double depposit(double amount) {
		balance = balance + amount;
		return balance;
	}
}
