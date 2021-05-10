<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form v2</title>
</head>
<body>
    <form action="processFormV2">
        <label for="firstName">First name</label><input type="text" id="firstName" name="firstName"><br>
        <label for="lastName">Last name</label><input type="text" name="lastName" id="lastName"><br>
        <input type="submit" value="Send"><br>
    </form>

    First name: ${firstName}<br>
    Last name: ${lastName}
</body>
</html>