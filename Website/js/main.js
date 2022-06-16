function togglePopup() {
    const popup = document.getElementById("popupToggle");
    popup.classList.toggle("show");
}

function submitTodo() {
    const name = document.getElementById("popout inp name");
    const content = document.getElementById("popout inp content");

    const todo = `<section><h2>${name.value}</h2><p>${content.value}</p></section>`;

    document.getElementById("todods").innerHTML += todo;

}
