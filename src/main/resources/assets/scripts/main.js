var showHideMenu;

$( document ).ready(function() {
    showHideMenu = function(){
        if($("#menu").hasClass("active")){
            $("#menu").removeClass("active");
        } else {
            $("#menu").addClass("active");
        }
    }
});