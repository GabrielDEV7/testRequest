const formulario = document.querySelector("form");
const firtsname = document.querySelector(".nameId");
const lastname = document.querySelector(".lastnameId");
const contact = document.querySelector(".contactId");
const cep = document.querySelector("#cepId");
const city = document.querySelector("#cityId");
const state = document.querySelector("#stateId");
const email = document.querySelector(".emailId");

function cadastrar() {
  fetch("http/localhost:8080/cadastrar", {
    headers: {
      Accept: "application/json",
      "content-type": "application/json",
    },
    method: "POST",
    body: JSON.stringify({
      name: firtsname.value,
      Lastname: lastname.value,
      contact: contact.value,
      cep: cep.value,
      city: city.value,
      state: state.value,
      email: email.value,
    }),
  })
    .then(function (res) {
      console.log(res);
    })
    .catch(function (res) {
      console.log(res);
    });
};

function clear() {
  firtsname.value = "";
  lastname.value = "";
  contact.value = "";
  cep.value = "";
  city.value = "";
  state.value = "";
  email.value = "";
};

formulario.addEventListener("submit", function (event) {
  event.preventDefault();

  cadastrar();
  clear();
});

//https://viacep.com.br/
