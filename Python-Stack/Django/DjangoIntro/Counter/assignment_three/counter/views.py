from django.shortcuts import render, HttpResponse,redirect
def index(request):
    if 'count' in request.session:
        request.session['count']+=1
    else:
        request.session['count']=0
    if 'visited_count' in request.session:
        request.session['visited_count']+=1
    else:
        request.session['visited_count']=0
    return render(request,"index.html")

def destroy(request):
    del request.session['count']
    return redirect("/")

def increment(request):
    if 'count' in request.session:
        request.session['count']+=2
    else:
        request.session['count']=2
    return render(request,"index.html")

def incrementByInserted(request):
    if request.method == "POST":
        inserted_value = request.POST["value"]
    if 'count' in request.session:
        request.session['count']+=int(inserted_value)
    else:
        request.session['count']=int(inserted_value)
    return render(request,"index.html")




        
