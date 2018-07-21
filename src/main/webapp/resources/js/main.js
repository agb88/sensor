$(document).ready(function(){
    const header = $(".header");

    $(document).scroll(function() {
        if($(this).scrollTop() > 30) {
            header.addClass("header__scrolled");
        } else {
            header.removeClass("header__scrolled");
        }
    });
});