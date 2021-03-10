from flask import Flask, render_template # Import Flask to allow us to create our app
app = Flask(__name__)      # Create a new instance of the Flask class called "app"


@app.route('/')            # The "@" decorator associates this route with the function immediately following
def display_checkerboard():
    return render_template("index.html")  

@app.route('/<int:num>')            # The "@" decorator associates this route with the function immediately following
def display_checkerboard_num(num):
    return render_template("index1.html",num=num )  

@app.route('/<int:x>/<int:y>')            # The "@" decorator associates this route with the function immediately following
def display_checkerboard_xy(x,y):
    return render_template("index2.html",x=int(x/2),y=y ) 

@app.route('/<int:x>/<int:y>/<color1>/<color2>')            # The "@" decorator associates this route with the function immediately following
def display_checkerboard_xy_color(x,y,color1,color2):
    return render_template("index3.html",x=int(x/2),y=y,color1=color1,color2=color2 ) 



if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True)    # Run the app in debug mode.
