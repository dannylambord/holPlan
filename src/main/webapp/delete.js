function deleteDest() {
    var id = document.getElementById("id").value;
let userId = JSON.stringify(id);
fetchData("DELETE", "/destination/" + id, userId).then((req) => 
{
    console.log(req.responseText);
    if(req.responseText = "connected"){
        var element = document.getElementById("para");
        element.innerHTML = "successful";
    }else{
        document.getElementById("para").innerHTML = "Destination not deleted please try again";
    }
}
)
}

