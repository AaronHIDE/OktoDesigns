function selectImage(imgElement) {
    var profileImage = document.getElementById('profileImage');
    profileImage.src = imgElement.src;
}

function updateProfile() {
    var usernameInput = document.getElementById('usernameInput');
    var profileName = document.getElementById('profileName');

    if (usernameInput.value.trim() !== "") {
        profileName.textContent = usernameInput.value.trim();
    }
}
