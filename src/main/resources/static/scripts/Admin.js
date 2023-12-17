document.addEventListener('DOMContentLoaded', function () {
  var empNameInput = document.getElementById('ename');
  var phoneNumberInput = document.getElementById('number');
  var employeeIdInput = document.getElementById('eid');

  // Allow only letters for Employee Name, up to 20 characters
  empNameInput.addEventListener('input', function () {
      this.value = this.value.replace(/[^A-Za-z\s]/g, '').substring(0, 20);
  });

  // Allow only numbers for Phone Number, exactly 10 digits
  phoneNumberInput.addEventListener('input', function () {
      this.value = this.value.replace(/[^0-9]/g, '').substring(0, 10);
  });

  // Allow only numbers for Employee ID, exactly 5 digits
  employeeIdInput.addEventListener('input', function () {
      this.value = this.value.replace(/[^0-9]/g, '').substring(0, 5);
  });

  var addBtn = document.querySelector('button[type="submit"]');
  addBtn.addEventListener('click', function () {
      // Perform additional validation or submit the form if needed
  });
});
