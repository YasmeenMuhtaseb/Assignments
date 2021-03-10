from flask import Flask, render_template,request # added request        
app=Flask(__name__) 

@app.route('/')
def dojo_survey():
    return render_template("index.html")

@app.route('/result', methods=['POST'])
def dojo_survey_output():
    name= request.form['your_name']
    location=request.form['location']
    favorite_language=request.form['favorite_language']
    comment=request.form['text_area']
    return render_template("output.html",name=name,location=location,favorite_language=favorite_language,comment=comment)

@app.route('/back',methods=['POST']) 
def back():
    return render_template("index.html")

if __name__=="__main__":
	app.run(debug=True)