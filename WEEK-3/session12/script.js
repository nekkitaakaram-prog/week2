document.getElementById("tantrazForm").addEventListener("submit", function (event) {

    const name = document.getElementById("fullname").value.trim();
    const email = document.getElementById("email").value.trim();
    const category = document.getElementById("category").value;

    if (name === "" || email === "" || category === "") {
        alert("Please fill all mandatory fields!");
        event.preventDefault();
    }
});