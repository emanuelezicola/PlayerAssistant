$(document).ready(function () {

    var typingTimer;                //timer identifier
    var doneTypingInterval = 500;  //time in ms (1 second)

    $('#inputUsername').keyup(function(){
        clearTimeout(typingTimer);
        if ($('#inputUsername').val()) {
            typingTimer = setTimeout(check, doneTypingInterval);
        }
    });

    $('#inputUsername').focusout(function () {
        check();
    });

    function check(){
        if (!validateEmail($('#inputUsername').val())) {
            $('#alertEmail').attr("hidden", false);
            $('#submitButton').attr("disabled", true);
        } else {
            $('#alertEmail').attr("hidden", true);
            $('#submitButton').attr("disabled", false);
        }
    }

});

