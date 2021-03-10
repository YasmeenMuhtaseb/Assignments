from django.shortcuts import render, HttpResponse
from .models import Users
def index(request):
    context = {
    "all_the_users": Users.objects.all()
    }
    return render(request,"index.html", context)

def add_user(request):
    if request.method == "POST":
        user_first_name = request.POST['first_name']
        user_last_name = request.POST['last_name']
        user_email = request.POST['email']
        user_age = request.POST['age']
        Users.objects.create(first_name= user_first_name, last_name= user_last_name, email_address= user_email, age = user_age) 
        context = {
            "all_the_users": Users.objects.all()
        }
    return render(request,"index.html",context)

