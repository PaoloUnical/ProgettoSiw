<!Doctype html>
<html>
<head>
<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="css/css_register+login+reset.css" />
<script src="js/jquery.1.11.1.js"></script>
<script src="js/global.js"></script>
<link rel='icon' href='img/favicon.ico' type='image/x-icon'/ >
<meta charset="UTF-8">
<title>Flamingo Beach Club</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	<div class="container">
		<header class="heading"> Reimposta la password </header>
		<p id = "conferma"></p>
		<form method="post" action="RegistrationServlet">
			<div class="col-sm-12">
				<div class="row">
					<div class="col-xs-4">
						<label class="mail">E-mail :</label>
					</div>
					<div class="col-xs-6">
						<input type="email" name="input_email" id="input_email"
							placeholder="Entrez vous e-mail" class="form-control">
					</div>
				</div>
			</div>
			<div class="col-sm-12">
				<div class="row">

					<div class="col-xs-4">
						<p id="link_login">
							<a href="Login_FR.jsp">Avez-vous d�j� un compte? Se connecter!</a>
						</p>
					</div>
					<div class="col-xs-6 da_alzare">
						<input type="button" id="submit" value="Soumettre" onclick="cambioPassword()">
					</div>
				</div>
			</div>
		</form>
	</div>
	<script src="js/global.js"></script>
</body>
</html>