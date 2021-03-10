from django.shortcuts import render ,HttpResponse, redirect
from .models import Order, Product

def index(request):
    context = {
        "all_products": Product.objects.all()
    }
    return render(request, "store/index.html", context)

def checkout(request):
    # if request.method == "POST":
        quantity_from_form = int(request.POST["quantity"])
        id_form_form = request.POST["price"] 
        price_from_form = float(Product.objects.get(id=id_form_form).price)
        
        total_charge = quantity_from_form * price_from_form
        
        current = Order.objects.create(quantity_ordered=quantity_from_form, total_price=total_charge)
        
        return redirect ('/recheack')
    
def recheack(request):
    current = Order.objects.last()
    total_quantity = 0
    total_charged = 0
    for order in Order.objects.all():
        total_quantity += order.quantity_ordered
        total_charged += order.total_price
    print("Charging credit card...")
    context ={
        "order" : current,
        "all_quantity": total_quantity,
        "total_charged":total_charged
    }

    return render (request, "store/checkout.html", context)
    