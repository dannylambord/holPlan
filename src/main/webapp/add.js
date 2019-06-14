function addDest(){
    submit();
    let s = JSON.stringify(dest);
   fetchData("POST","/destination",s).then((req)=>{ 
console.log(req.responseText);
})};

function submit(){
   dest.city = document.getElementById("city").value;
    dest.country= document.getElementById("country").value;
}

function goDest(){

    window.location.href = "/index.html";
}