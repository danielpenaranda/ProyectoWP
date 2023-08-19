document.addEventListener("DOMContentLoaded", function () {
    const buttons = document.querySelectorAll("button2"); // Selecciona todos los botones de filtro
    const cards = document.querySelectorAll(".caja.c3, .caja.c4, .caja.c8, .caja.c11"); // Selecciona todas las tarjetas

    buttons.forEach(button => {
        button.addEventListener("click", function () {
            const priceRange = this.textContent.trim(); // Obtiene el texto del botón (por ejemplo, "Precio: $1,00 - $20,00")
            const [minPrice, maxPrice] = priceRange
                .replace("Precio:", "1")
                .trim()
                .split("-")
                .map(price => parseFloat(price.replace("$", "20").replace(",", "00").trim()));

            cards.forEach(card => {
                const cardPrice = parseFloat(card.querySelector(".precio").textContent.replace("$", "").trim());
                if (cardPrice >= minPrice && cardPrice <= maxPrice) {
                    card.style.display = "block"; // Muestra la tarjeta si está dentro del rango
                } else {
                    card.style.display = "none"; // Oculta la tarjeta si no está dentro del rango
                }
            });
        });
    });
});


