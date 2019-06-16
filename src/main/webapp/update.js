class Destination{
    constructor(city, country){
        this.city = city;
        this.country = country;
    }
}

function update(){
    let ci = document.getElementById("city").value;
    let co= document.getElementById("country").value;
    let y = new Destination(ci,co);
    y = JSON.stringify(y);
    let i = document.getElementById("id").value;
   fetchData("PUT","/destination/" + i, y).then((req)=>{
    console.log(req.responseText);
    if(req.responseText = "connected"){
        var element = document.getElementById("para");
        element.innerHTML = "successful";
    }else{
        document.getElementById("para").innerHTML = "Destination not updated please try again";
    }
})};


