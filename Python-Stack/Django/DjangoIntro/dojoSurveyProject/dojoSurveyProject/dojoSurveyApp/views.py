from django.shortcuts import render, HttpResponse
def index(request):
    return render(request,"index.html")

def show_result(request):
    name_from_form = request.POST['your_name']
    location_from_form = request.POST['location']
    favorite_language_from_form = request.POST['favorite_language']
    comment_from_form = request.POST['text_area']
    context = {
    "name_on_template" : name_from_form,
    "location_on_template" : location_from_form,
    "favorite_language_on_template": favorite_language_from_form,
    "comment_on_template": comment_from_form

    }
    return render(request,"output.html",context)
