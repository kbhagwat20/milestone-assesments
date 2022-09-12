const myForm= document.getElementById('myForm');
myForm.addEventListener('submit', (event) =>{
    event.preventDefault();
    let name = myForm['name'].value;
    if(name.length<4 || name.length>16){
        alert('Error: Name should contain between 4 to 16 character')
        return
    } else if(name[0] !== name[0].toUpperCase()){
        alert('Error: First letter of name should be uppercase')
        return
    }
    let gender = myForm['gender'].value;
    if(!gender){
        alert('Select at least one gender')
        return
    }
    let hobbyCount=0;
    if(myForm['dancing'].checked){
        hobbyCount++;
    }
    if(myForm['singing'].checked){
        hobbyCount++;
    }
    if(myForm['painting'].checked){
        hobbyCount++;
    }
    if(myForm['sports'].checked){
        hobbyCount++;
    }
    if(hobbyCount<2){
        alert("Select at least 2 hobbies")
        return
    }
    const message = document.getElementById("message");
    message.innerHTML = "Form submitted successfully"
})