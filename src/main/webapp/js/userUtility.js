function validateEmail(email) {
    if(email == null || email == undefined) {
        return false;
    }
    var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(String(email).toLowerCase());
}



function validatePassword(password) {
    return password.length >= 4 && !/^\s*$/.test(password);
}


function validateNome(nome) {
    return nome.length >= 0 && !/^\s*$/.test(nome);
}