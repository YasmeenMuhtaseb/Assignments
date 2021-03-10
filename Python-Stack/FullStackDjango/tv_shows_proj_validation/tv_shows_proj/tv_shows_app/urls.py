from django.urls import path
from . import views

urlpatterns = [
    path('',views.root),
    path('shows',views.shows),
    path('shows/new',views.add_new),
    path('add_new',views.add_show),
    path('shows/<int:id>',views.show_tv),
    path('shows/<int:id>/edit',views.edit_by_id),
    path('shows/<int:id>/update',views.show_update),
    path('shows/<int:id>/destroy',views.destroy),
]

