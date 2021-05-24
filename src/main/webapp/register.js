var url = "ws://" + window.location.host + "/hpda";
var sws = new WebSocket(url);

sws.onopen = function(event) {
	var msg = {
		type: "infoUsuarios"
	};
	sws.send(JSON.stringify(msg));
};
sws.onmessage = function(event) {
	var data = event.data;
	data = JSON.parse(data);
	var users = [];

	for (var j = 0; j < data.usuarios.length; j++) {
		users[j] = data.usuarios[j].name;
	}

	sessionStorage.users = JSON.stringify(users);
};

let register = function() {
	document.getElementById("username").style.backgroundColor = "transparent";
	document.getElementById("email").style.backgroundColor = "transparent";
	document.getElementById("pwd1").style.backgroundColor = "transparent";
	document.getElementById("pwd2").style.backgroundColor = "transparent";
	document.getElementById("name").style.backgroundColor = "transparent";
	document.getElementById("apellidos").style.backgroundColor = "transparent";
	var username = injectionSQL($('#username').val());
	
	if (contrasenaValida($('#pwd1').val())) {
		const info = {
			type: 'register',
			username: username,
			email: $('#email').val(),
			pwd1: $('#pwd1').val(),
			pwd2: $('#pwd2').val(),
			name: $('#name').val(),
			apellidos: $('#apellidos').val(),
			imagen: $('#img').val()
		};
		const data = {
			data: JSON.stringify(info),
			url: 'register',
			type: 'post',
			contentType: 'application/json',
			success: function() {
				window.location.href = 'index.html';
			},
			error: function(response) {
				alert('NO SE PUDO REGISTRAR');
			}
		};
		$.ajax(data);		
	} else {
		document.getElementById("username").style.backgroundColor = "red";
	}
};

function usernameValido(userName) {
	if(userName === ''){
		return false;
	}
	return true;
}

function contrasenaValida(pwd) {
	if (pwd.length > 4 && tiene_numeros(pwd) && tiene_minuscula_y_mayuscula(pwd)) {
		return true;
	} else {
		document.getElementById("pwd1").style.backgroundColor = "red";
		document.getElementById("pwd2").style.backgroundColor = "red";
		return false;
	}
}

function tiene_numeros(texto) {
	let numeros = "0123456789";
	for (i = 0; i < texto.length; i++) {
		if (numeros.indexOf(texto.charAt(i), 0) !== -1) {
			return true;
		}
	}
	return false;
}

function tiene_minuscula_y_mayuscula(pwd) {
	let m = false;
	let M = false;
	for (i = 0; i < pwd.length; i++) {
		if (!esNumero(pwd.charAt(i)) && pwd.charAt(i) === pwd.charAt(i).toUpperCase()) {
			M = true;
		}
		if (!esNumero(pwd.charAt(i)) && pwd.charAt(i) === pwd.charAt(i).toLowerCase()) {
			m = true;
		}
	}
	return M && m;
}

function esNumero(digito) {
	let numeros = "0123456789";
	if (numeros.indexOf(digito, 0) !== -1) {
		return true;
	}
	return false;
}

$(document).ready(function (){
	const fileInput = document.querySelector("#imagen");

  	fileInput.addEventListener("change", (e) => {
    	const file = e.target.files[0];
    	const reader = new FileReader();
	    reader.onloadend = () => {
			$("#img").val(reader.result)
		};
		reader.readAsDataURL(file);
	});
});


function injectionSQL(text) {
	var map = {
	'&': '&amp;',
	'<': '&lt;',
	'>': '&gt;',
	'"': '&quot;',
	"'": '&#039;',
	'"\"': '&#92;'
	};
	return text.replace(/[&<>"']/g, function(m) { return map[m]; });
}