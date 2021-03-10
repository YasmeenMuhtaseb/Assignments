from django.shortcuts import render, HttpResponse,redirect
import random               # import the random module
from time import gmtime, strftime
def index(request):
    if 'random_gold' not in request.session:
        request.session['random_gold']=0
    if 'messages' not in request.session:
        request.session['messages'] = ''
    return render(request,"index.html")

def process(request):
    if request.method == 'POST':
        if request.POST['which_form'] == 'farm':
            request.session['farm_gold']= random.randint(10, 20) 
            request.session['random_gold'] += request.session['farm_gold']
            request.session['messages']+=f"Earned {request.session['farm_gold']} golds from the farm! (" + strftime("%b %d, %Y %H:%M %p", gmtime())+")\n"
        elif request.POST['which_form'] == 'gave':
            request.session['gave_gold']= random.randint(5, 10)
            request.session['random_gold'] += request.session['gave_gold'] 
            request.session['messages']+= f"Earned {request.session['gave_gold']} golds from the gave! (" + strftime("%b %d, %Y %H:%M %p", gmtime())+")\n"
        elif request.POST['which_form'] == 'house':
            request.session['house_gold']= random.randint(2, 5) 
            request.session['random_gold'] += request.session['house_gold']
            request.session['messages']+= f"Earned {request.session['house_gold']} golds from the house! (" + strftime("%b %d, %Y %H:%M %p", gmtime())+")\n"
        elif request.POST['which_form'] == 'casino':
            request.session['casino_gold']= random.randint(-50, 50) 
            request.session['random_gold'] += request.session['casino_gold']
            if request.session['casino_gold'] > 0:
                request.session['messages']+=f"Earned {request.session['casino_gold']} golds from the casino! (" + strftime("%b %d, %Y %H:%M %p", gmtime())+")\n"
            else:
                request.session['messages']+=f"Entered a casino and lost {-1*request.session['casino_gold']} .. Ouch.. (" + strftime("%b %d, %Y %H:%M %p", gmtime())+")\n"
    return redirect('/')

def destroy(request):
    del request.session['random_gold']
    del request.session['messages']
    return redirect('/')


