function signin(event) {
  event.preventDefault();
  const username = document.getElementById('username').value;
  const password = document.getElementById('password').value;

  if (username === null || password === null || username === '' || password === '') {
    openModal();
  } else {
    closeModal();
  }
}

function openModal() {
  document.getElementById('modalOverlay').style.display = 'flex';
}

function closeModal() {
  document.getElementById('modalOverlay').style.display = 'none';
}

window.onclick = function(event) {
  const modal = document.getElementById('modalOverlay');
  if (event.target === modal) {
      closeModal();
  }
};
