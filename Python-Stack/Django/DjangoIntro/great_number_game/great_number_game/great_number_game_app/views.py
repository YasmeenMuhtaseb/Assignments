from django.shortcuts import render, HttpResponse,redirect
import random 	                # import the random module
def index(request):
    if 'random_number' not in request.session:
        request.session['random_number'] = random.randint(1, 100) 		# random number between 1-100
    if 'attempts' not in request.session:
        request.session['attempts']=0
    return render(request,"index.html")

def check_method(request):
    if request.method == "POST":
        guess_number = request.POST['inserted_number']
        if int(guess_number) ==  request.session['random_number']:
            request.session['result'] = 'correct'
            request.session['attempts']+=1
        elif int(guess_number) >  request.session['random_number']:
            request.session['result'] = 'high'
            request.session['attempts']+=1
        else:
            request.session['result'] = 'low'
            request.session['attempts']+=1
    return redirect('/')

def play_again(request):
    del request.session['random_number']
    del request.session['result']
    del request.session['attempts']
    return redirect('/')

def try_again(request):
    del request.session['random_number']
    del request.session['result']
    del request.session['attempts']
    return redirect('/')


