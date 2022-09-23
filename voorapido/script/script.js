
function clicar() {
let login = document.getElementById("email");
let senha = document.getElementById("password");

    if (login.value == "" && senha.value == "") {
        alert("Digite seu Email e Senha!");
    }else{
        window.open('home.html');
        
    }
}


