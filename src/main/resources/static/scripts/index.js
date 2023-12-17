document.addEventListener("DOMContentLoaded", function() {
    document.getElementById("scard").addEventListener("click", function() {
        window.location.href = "login.html";
    });
    document.getElementById("ecard").addEventListener("click", function() {
        window.location.href = "worker_login.html";
    });
});
