function deleteDest() {
    var id = document.getElementById("id").value;
let userId = JSON.stringify(id);
fetchData("DELETE", "/destination/" + id, userId).then((req) => 
{
    console.log(req.responseText);
}
)
}

