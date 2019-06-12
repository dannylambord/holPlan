function deleteDest() {
    var id = document.getElementById("user").value;
let userId = JSON.stringify(id);
fetchData("DELETE", "/destination/" + id, userId)
}

