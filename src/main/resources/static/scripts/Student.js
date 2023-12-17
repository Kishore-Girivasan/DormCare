const boxes = document.querySelectorAll(".Boxes");
let selectedBox = null; // Track the currently selected box

boxes.forEach(box => {
  box.addEventListener("click", function() {
    if (selectedBox) { // If another box is already selected
      selectedBox.classList.remove("green"); // Revert its border to black
    }
    selectedBox = this; // Update the currently selected box
    this.classList.toggle("green"); // Toggle this box's border
  });
});
function showSuggestionBox() {
  const suggestionBox = document.getElementById("Review-box");
  const suggestionText = document.getElementById("Suggestion");
  suggestionBox.style.display = "block"; // Show the suggestion box
  suggestionText.style.display = "block";
}
