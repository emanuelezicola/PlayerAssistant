$(document).ready(function () {
    var disableByNome = false;
    var disableByCognome = false;
    var disableByEmail = false;
    var disableByPass = false;
    var disableByPassRip = false;


    var typingTimer;                //timer identifier
    var doneTypingInterval = 500;  //time in ms (1 second)



    $('#nome').focusout( function() {
        if (!validateNome($('#nome').val())) {
            $('#alertNome').attr("hidden", false);
            $('#registratiButton').attr("disabled", true);
            disableByNome = true;
        } else {
            $('#alertNome').attr("hidden", true);
            disableByNome = false;
            checkReableButton();
        }
    });



    $('#cognome').focusout( function() {
        if (!validateNome($('#cognome').val())) {
            $('#alertCognome').attr("hidden", false);
            $('#registratiButton').attr("disabled", true);
            disableByCognome = true;
        } else {
            $('#alertCognome').attr("hidden", true);
            disableByCognome = false;
            checkReableButton();
        }
    });




    $('#email').keyup(function(){
        clearTimeout(typingTimer);
        if ($('#email').val()) {
            typingTimer = setTimeout(checkEmail, doneTypingInterval);
        }
    });
    function checkEmail() {
        if (!validateEmail($('#email').val())) {
            $('#alertEmail').attr("hidden", false);
            $('#registratiButton').attr("disabled", true);
            disableByEmail = true;
        } else {
            $('#alertEmail').attr("hidden", true);
            disableByEmail = false;
            checkReableButton();
        }
    }


    $('#password').keyup(function(){
        clearTimeout(typingTimer);
        if ($('#password').val()) {
            typingTimer = setTimeout(checkPassword, doneTypingInterval);
        }
    });
    function checkPassword() {
        if (!validatePassword($('#password').val())) {
            $('#alertPassword').attr("hidden", false);
            $('#registratiButton').attr("disabled", true);
            disableByPass = true;
        } else {
            $('#alertPassword').attr("hidden", true);
            disableByPass = false;
            checkReableButton();
        }
    }



    $('#password_confirm').keyup(function(){
        clearTimeout(typingTimer);
        if ($('#password_confirm').val()) {
            typingTimer = setTimeout(passwordEq, doneTypingInterval);
        }
    });
    function passwordEq() {
        if (!checkPasswordEquals($('#password').val(), $('#password_confirm').val())) {
            $('#alertPasswordRip').attr("hidden", false);
            $('#registratiButton').attr("disabled", true);
            disableByPassRip = true;
        } else {
            $('#alertPasswordRip').attr("hidden", true);
            disableByPassRip = false;
            checkReableButton();
        }
    }


    function checkReableButton() {
        if (!disableByEmail && !disableByPass) {
            $('#registratiButton').attr("disabled", false);
        }
    }

    function checkPasswordEquals(password, confirmPassword) {
        return password === confirmPassword;
    }

});