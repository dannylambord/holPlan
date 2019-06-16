function addDest(){
    submit();
    let s = JSON.stringify(dest);
   fetchData("POST","/destination",s).then((req)=>{ 
console.log(req.responseText);
if(req.responseText = "connected"){
    document.getElementById("para").innerHTML("successful")
}else{
    document.getElementById("para").innerHTML("Destination not added please try again")
}
})};

function submit(){
   dest.city = document.getElementById("city").value;
    dest.country= document.getElementById("country").value;
}

function goDest(){

    window.location.href = "/index.html";
}