<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
$(document).ready(function() {
$("form").submit(function(event) {
event.preventDefault(); // Предотвращаем отправку формы по умолчанию

var formData = {
name: $("#name").val(),
email: $("#email").val()
};

$.ajax({
type: "POST",
url: "hello", // Замените "hello" на URL, по которому вы хотите отправить запрос
data: formData,
success: function(response) {
// Обновляем содержимое элементов div
$("#nameResult").text("Name: " + formData.name);
$("#emailResult").text("Email: " + formData.email);
},
error: function(error) {
console.log(error); // Обработка ошибки
}
});
});
});
</script>
</head>
<body>
<h2>Hello World!</h2>
<form>
<label for="name">Name:</label>
<input type="text" name="name" id="name" required>


<label for="email">Email:</label>
<input type="email" name="email" id="email" required>


<input type="submit" value="Submit">
</form>

<div id="nameResult"></div> <!— Отображение результата имени —>
<div id="emailResult"></div> <!— Отображение результата email —>
</body>
</html>