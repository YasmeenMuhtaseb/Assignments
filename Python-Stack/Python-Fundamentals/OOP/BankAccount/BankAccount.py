class BankAccount:
    def __init__(self, int_rate , balance):
        self.int_rate = int_rate
        self.balance = balance
        
    def deposit(self, amount):	# increases the account balance by the given amount
        self.balance += amount
        return self
        
    def withdraw(self, amount):  # decreases the account balance by the given amount if there are sufficient funds; if there is not enough money, print a message "Insufficient funds: Charging a $5 fee" and deduct $5
        if self.balance > amount:
            self.balance -= amount
        else:
            print("Insufficient funds: Charging a $5 fee")
            self.balance -= 5
        return self
        
    def display_account_info(self):  #print to the console: eg. "Balance: $100"
        print("Balance: $",self.balance)
        return self
        
    def yield_interest(self): #increases the account balance by the current balance * the interest rate (as long as the balance is positive)
        if self.balance > 0:
            self.balance += (self.balance * self.int_rate)
        return self
		
yasmeen = BankAccount(0.01,100)
shaimaa = BankAccount(0.02,200)
yasmeen.deposit(100).deposit(50).deposit(200).withdraw(450).yield_interest().display_account_info
shaimaa.deposit(200).deposit(100).withdraw(50).withdraw(100).withdraw(20).withdraw(100).yield_interest().display_account_info()