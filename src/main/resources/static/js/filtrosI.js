document.addEventListener("DOMContentLoaded", function () {
    const buttons = document.querySelectorAll("button1"); // Selecciona todos los botones de filtro
    const cards = document.querySelectorAll(".c5, .c7, .c9, .c10, .c11, .c12, .c13, .c14, .c15, .c16, .c17"); // Selecciona todas las tarjetas
    buttons.forEach(button => {
        button.addEventListener("click", function () {
            const precioRange = this.textContent.trim(); // Obtiene el texto del botón (por ejemplo, "Precio: $1,00 - $20,00")
            const [minPrecio, maxPrecio] = precioRange
                .replace("Precio:", "")
                .trim()
                .split("-")
                .map(precio => parseFloat(precio.replace("$", "").replace(",", "").trim()));

            cards.forEach(card => {
                const cardPrecio = parseFloat(card.querySelector(".precio").textContent.replace("$", "").trim());
                if (cardPrecio >= minPrecio && cardPrecio <= maxPrecio) {
                    card.style.display = "block"; // Muestra la tarjeta si está dentro del rango
                } else {
                    card.style.display = "none"; // Oculta la tarjeta si no está dentro del rango
                }
            });
        });
    });
});
document.addEventListener("DOMContentLoaded", function () {
    const buttons = document.querySelectorAll("button2"); // Selecciona todos los botones de filtro
    const cards = document.querySelectorAll(".c3, .c5, .c7, .c9, .c10, .c12, .c14, .c15"); // Selecciona todas las tarjetas
    buttons.forEach(button => {
        button.addEventListener("click", function () {
            const precioRange = this.textContent.trim(); // Obtiene el texto del botón (por ejemplo, "Precio: $1,00 - $20,00")
            const [minPrecio, maxPrecio] = precioRange
                .replace("Precio:", "")
                .trim()
                .split("-")
                .map(precio => parseFloat(precio.replace("$", "").replace(",", "").trim()));

            cards.forEach(card => {
                const cardPrecio = parseFloat(card.querySelector(".precio").textContent.replace("$", "").trim());
                if (cardPrecio >= minPrecio && cardPrecio <= maxPrecio) {
                    card.style.display = "block"; // Muestra la tarjeta si está dentro del rango
                } else {
                    card.style.display = "none"; // Oculta la tarjeta si no está dentro del rango
                }
            });
        });
    });
});
document.addEventListener("DOMContentLoaded", function () {
    const buttons = document.querySelectorAll("button3"); // Selecciona todos los botones de filtro
    const cards = document.querySelectorAll(".c3, .c4, .c6, .c7, .c8, .c9, .c11, .c13, .c15, .c16, .c17"); // Selecciona todas las tarjetas
    buttons.forEach(button => {
        button.addEventListener("click", function () {
            const precioRange = this.textContent.trim(); // Obtiene el texto del botón (por ejemplo, "Precio: $1,00 - $20,00")
            const [minPrecio, maxPrecio] = precioRange
                .replace("Precio:", "")
                .trim()
                .split("-")
                .map(precio => parseFloat(precio.replace("$", "").replace(",", "").trim()));

            cards.forEach(card => {
                const cardPrecio = parseFloat(card.querySelector(".precio").textContent.replace("$", "").trim());
                if (cardPrecio >= minPrecio && cardPrecio <= maxPrecio) {
                    card.style.display = "block"; // Muestra la tarjeta si está dentro del rango
                } else {
                    card.style.display = "none"; // Oculta la tarjeta si no está dentro del rango
                }
            });
        });
    });
});
document.addEventListener("DOMContentLoaded", function () {
    const buttons = document.querySelectorAll("button4"); // Selecciona todos los botones de filtro
    const cards = document.querySelectorAll(".c3, .c4, .c5, .c6, .c8, .c10, .c11, .c12, .c13, .c14, .c16, .c17"); // Selecciona todas las tarjetas
    buttons.forEach(button => {
        button.addEventListener("click", function () {
            const precioRange = this.textContent.trim(); // Obtiene el texto del botón (por ejemplo, "Precio: $1,00 - $20,00")
            const [minPrecio, maxPrecio] = precioRange
                .replace("Precio:", "")
                .trim()
                .split("-")
                .map(precio => parseFloat(precio.replace("$", "").replace(",", "").trim()));

            cards.forEach(card => {
                const cardPrecio = parseFloat(card.querySelector(".precio").textContent.replace("$", "").trim());
                if (cardPrecio >= minPrecio && cardPrecio <= maxPrecio) {
                    card.style.display = "block"; // Muestra la tarjeta si está dentro del rango
                } else {
                    card.style.display = "none"; // Oculta la tarjeta si no está dentro del rango
                }
            });
        });
    });
});


