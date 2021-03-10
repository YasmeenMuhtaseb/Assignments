class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account_balance = 0
    def make_withdrawal(self, amount): #have this method decrease the user's balance by the amount specified
    	self.account_balance -= amount
    def display_user_balance(self): #have this method print the user's name and account balance to the terminal\eg. "User: Guido van Rossum, Balance: $150"
        print("User:",self.name,", ","Balance: $",self.account_balance)
    def make_deposit(self, amount):	# takes an argument that is the amount of the deposit
    	self.account_balance += amount
    def transfer_money(self, other_user, amount): #this method decrease the user's balance by the amount and add that amount to other other_user's balance.
        self.account_balance -=amount
        other_user.account_balance +=amount
x=User("Yasmeen","yasmeen@gmail.com")
y=User("Kamal","kamal@gmail.com")
z=User("Dalia","dalia@gmail.com")
x.make_deposit(100)
x.make_deposit(50)
x.make_deposit(300)
x.make_withdrawal(100)
x.display_user_balance()
y.make_deposit(150)
y.make_deposit(200)
y.make_withdrawal(100)
y.make_withdrawal(50)
y.display_user_balance()
z.make_deposit(400)
z.make_withdrawal(100)
z.make_withdrawal(50)
z.make_withdrawal(50)
z.display_user_balance()
x.transfer_money(y,100)
x.display_user_balance()
y.display_user_balance()