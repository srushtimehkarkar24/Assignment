var form = document.getElementById("loginForm");
var errorMsg = document.getElementById("errorMsg");

form.addEventListener("submit", function(event) {
    event.preventDefault(); // Stop form from submitting

    var username = document.getElementById("username").value.trim();
    var password = document.getElementById("password").value.trim();

    if (username === "" && password === "") {
        errorMsg.innerText = "Username and Password cannot be empty.";
    } else if (username === "") {
        errorMsg.innerText = "Username cannot be empty.";
    } else if (password === "") {
        errorMsg.innerText = "Password cannot be empty.";
    } else if (password.length < 6) {
        errorMsg.innerText = "Password must be at least 6 characters.";
    } else {
        errorMsg.style.color = "green";
        errorMsg.innerText = "Login Successful!";
    }
});
