  // import { initializeApp } from "https://www.gstatic.com/firebasejs/10.7.1/firebase-app.js";
  // import { getAnalytics } from "https://www.gstatic.com/firebasejs/10.7.1/firebase-analytics.js";
  // const firebaseConfig = {
  //   apiKey: "AIzaSyBRWtFEC4zWMAH28cJK1CZKTckGSt16RfY",
  //   authDomain: "dormcare.firebaseapp.com",
  //   projectId: "dormcare",
  //   storageBucket: "dormcare.appspot.com",
  //   messagingSenderId: "971014157081",
  //   appId: "1:971014157081:web:61d2b3d0c6553130360b88",
  //   measurementId: "G-NRDP9T5ZX5"
  // };
  // const app = initializeApp(firebaseConfig);
  // const analytics = getAnalytics(app);


function signin(){
  const email = document.getElementById('email').value;
  if(validate_email(email)){
    console.log("valid");
    fetch('http://localhost:8080/receive-data', {
      method: 'POST',
      headers: {
          'Content-Type': 'application/json',
      },
      credentials: 'include', // Add this line
      body: JSON.stringify({ email }),
  })
  .then(response => response.json())
  .then(responseData => {
      alert(responseData.message); // Display the response from the server
  })
  .catch(error => {
      console.error('Error sending data:', error);
  });
  
  }
  else{
    openModal();
  }
}

function validate_email(email){
  const emailRegex = /^[a-zA-Z0-9._-]+@(vitstudent\.ac\.in|vit\.ac\.in)$/;
  return emailRegex.test(email);
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

// const email = document.getElementById('email').value;


      


























// function showOtpInput() {
//     document.getElementById("otp").style.display = "block";
//     document.getElementById("getotp").style.display = "none";
//     document.getElementById("signin-button").style.display = "block";



//     //otp 


// }