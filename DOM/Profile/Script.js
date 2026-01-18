function toggleSkills() {
    var skillsDiv = document.getElementById("skills");
    var btn = document.querySelector("button");

    if (skillsDiv.style.display === "none") {
        skillsDiv.style.display = "block";
        btn.innerText = "Hide Skills";
    } else {
        skillsDiv.style.display = "none";
        btn.innerText = "Show Skills";
    }
}
