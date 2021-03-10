from django.db import models
class TvManager(models.Manager):
    def basic_validator(self,postData):
        errors ={}
        if len (postData['title'])< 2:
            errors['title'] ="TITLE NEED AT LEAST 3 CHARACTERS"
        if len (postData['network'])< 3:
            errors['network'] ="NETWORK NEED AT LEAST 3 CHARACTERS"
        if len (postData['release_date'])< 8:
            errors['release_date'] ="Release Date NEED AT LEAST 8 CHARACTERS"
        if len (postData['description'])< 10:
            errors['description'] ="DESCRIOTION NEED AT LEAST 3 CHARACTERS"
        return errors

class Tv(models.Model):
    title = models.CharField(max_length=255)
    network = models.CharField(max_length=255)
    description = models.TextField()
    release_date = models.DateField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = TvManager()

def display_shows():
    context={
        'all_shows':Tv.objects.all()
    }
    return context

def add_new(info_to_add):
    Tv.objects.create(title=info_to_add['title'],network=info_to_add['network'],release_date=info_to_add['release_date'],description=info_to_add['description'])
    id = Tv.objects.last().id
    return id
def show_by_id(id):
    context={
        'show_info':Tv.objects.get(id=id)
    }
    return context
def update_show(info_to_edit,id):
    edit=Tv.objects.get(id=id)
    edit.title=info_to_edit['title']
    edit.network=info_to_edit['network']
    edit.release_date=info_to_edit['release_date']
    edit.description=info_to_edit['description']
    edit.save()
    return edit.id

def destroy_model(id):
    delete_value = Tv.objects.get(id =id)
    delete_value.delete()

def errors(check_info):
    errors = Tv.objects.basic_validator(check_info)
    return errors