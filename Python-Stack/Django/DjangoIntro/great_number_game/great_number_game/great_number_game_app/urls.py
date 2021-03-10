from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    path('check',views.check_method),
    path('play_again',views.play_again),
    path('try_again',views.try_again),

] 