// Fixed price of one item
const pricePerItem = 250;

// Get HTML elements
const quantityInput = document.getElementById("quantity");
const totalPrice = document.getElementById("totalPrice");

// Event listener for real-time update
quantityInput.addEventListener("input", calculateTotal);

// Function to calculate total price
function calculateTotal() {
  const quantity = Number(quantityInput.value);
  const total = quantity * pricePerItem;
  totalPrice.textContent = total.toFixed(2);
}

// Initial calculation
calculateTotal();