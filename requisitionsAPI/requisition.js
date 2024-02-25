const formulario = document.querySelector("form");
const firtsname = document.querySelector(".nameId");
const lastname = document.querySelector(".lastnameId");
const contact = document.querySelector(".contactId");
const cep = document.querySelector("#cepId");
const city  = document.querySelector("#cityId");
const state = document.querySelector("#stateId");
const email = document.querySelector(".emailId");


formulario.addEventListener('submit', function (event){
    event.preventDefault();

    const dados = {
        name: firtsname.value,
        Lastname: lastname.value,
        contact: contact.value,
        cep: cep.value,
        city: city.value,
        state: state.value,
        email: email.value
    };
    console.log(dados)
}
);




//https://viacep.com.br/