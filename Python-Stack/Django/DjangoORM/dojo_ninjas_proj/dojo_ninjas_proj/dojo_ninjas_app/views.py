from django.shortcuts import render, HttpResponse,redirect
from .models import Ninjas,Dojos
def index(request):
    context = {
    "dojos": Dojos.objects.all()
    # "ninjas_template":Ninjas.objects.all()
    }
    return render(request,"index.html",context)

def add_dojo(request):
    if request.method == "POST":
        dojo_name = request.POST['name']
        dojo_city= request.POST['city']
        dojo_state = request.POST['state']
        Dojos.objects.create(name= dojo_name, city= dojo_city, state= dojo_state) 
    return redirect('/')

def add_ninja(request):
    if request.method == "POST":
        ninja_first_name = request.POST['first_name']
        ninja_last_name= request.POST['last_name']
        ninja_dojo = request.POST['dojos']
        Ninjas.objects.create(first_name= ninja_first_name, last_name= ninja_last_name, dojo= Dojos.objects.get(id =ninja_dojo)) 
    return redirect('/')