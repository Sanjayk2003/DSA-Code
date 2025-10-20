// script.js

// Function to filter books based on search input
document.querySelector('.search-bar button').addEventListener('click', function() {
    const searchQuery = document.querySelector('.search-bar input').value.toLowerCase();
    const bookItems = document.querySelectorAll('.book-item');

    bookItems.forEach(item => {
        const title = item.querySelector('h3').textContent.toLowerCase();
        const author = item.querySelector('p').textContent.toLowerCase();

        if (title.includes(searchQuery) || author.includes(searchQuery)) {
            item.style.display = 'block';
        } else {
            item.style.display = 'none';
        }
    });
});

// Function to add items to the cart
let cartItemCount = 0;
const cartButton = document.querySelectorAll('.add-to-cart');

cartButton.forEach(button => {
    button.addEventListener('click', function() {
        cartItemCount++;
        updateCartCount();
    });
});

function updateCartCount() {
    const cartCount = document.querySelector('.cart-count');
    if (cartCount) {
        cartCount.textContent = `Cart (${cartItemCount})`;
    } else {
        const nav = document.querySelector('nav');
        const cartCountElement = document.createElement('span');
        cartCountElement.className = 'cart-count';
        cartCountElement.textContent = `Cart (${cartItemCount})`;
        nav.appendChild(cartCountElement);
    }
}

// Function to toggle cart visibility
document.querySelector('.cart-count')?.addEventListener('click', function() {
    const cartSummary = document.querySelector('.cart-summary');
    if (cartSummary) {
        cartSummary.style.display = cartSummary.style.display === 'none' ? 'block' : 'none';
    }
});
