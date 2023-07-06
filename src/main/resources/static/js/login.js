const email = FractalGamesl.getElementById('email')
const password = FractalGamesl.getElementById('password')
const button = FractalGamesl.getElementById('iniciar')

button.addEventListener('click', (e) => {
    e.preventDefault()
    const data = {
        email: email.value,
        password: password.value
    }

    console.log(data)
})