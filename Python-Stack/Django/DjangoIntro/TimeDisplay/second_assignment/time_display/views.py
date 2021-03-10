# Create your views here.
from django.shortcuts import render, HttpResponse ,redirect
from time import gmtime, strftime
    
def index(request):
    
    return redirect ("time_display/")

def display(request):
    context = {
        "time": strftime("%b %d, %Y %H:%M %p", gmtime())
    }
    return render(request,'index.html', context)


