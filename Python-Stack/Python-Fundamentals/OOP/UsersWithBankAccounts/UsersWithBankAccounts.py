class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account = BankAccount(int_rate=0.02, balance=0)

    def make_deposit(self, amount):	# takes an argument that is the amount of the deposit
        self.account.deposit(amount)
        return self

    def make_withdrawal(self, amount): #have this method decrease the user's balance by the amount specified
        self.account.withdraw(amount)
        return self

    def display_user_balance(self): #have this method print the user's name and account balance to the terminal\eg. "User: Guido van Rossum, Balance: $150"
        print("User:",self.name,", ","Balance: $",self.account.balance)
        return self

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

    