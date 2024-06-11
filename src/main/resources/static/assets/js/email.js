document.addEventListener('DOMContentLoaded', function () {
    document.getElementById('emailForm').addEventListener('submit', function (event) {
        event.preventDefault();
        var form = event.target;
        var formData = new FormData(form);
        
        var xhr = new XMLHttpRequest();
        xhr.open('POST', form.getAttribute('action'), true);
        
        xhr.onreadystatechange = function () {
            if (xhr.readyState === 4) {
                if (xhr.status === 200) {
                    document.getElementById('message').innerHTML = '<div class="alert alert-success">' + xhr.responseText + '</div>';
                } else {
                    document.getElementById('message').innerHTML = '<div class="alert alert-danger">Error al enviar el email</div>';
                }
            }
        };
        
        xhr.send(formData);
    });
});
