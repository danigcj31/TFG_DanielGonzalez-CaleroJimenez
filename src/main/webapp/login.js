var url = "ws://" + window.location.host + "/HPDA";

let login = function() {
	const info = {
		type: 'login',
		username: $('#username').val(),
		pwd: $('#pwd').val()
	};
	sessionStorage.username = $('#username').val();
	sessionStorage.pwd = $('#pwd').val();
	const data = {
		data: JSON.stringify(info),
		url: 'login',
		type: 'post',
		contentType: 'application/json',
		success: function() {
			sessionStorage.username = $('#username').val();
			sessionStorage.pwd = $('#pwd').val();
		}
	};
	$.ajax(data);
};