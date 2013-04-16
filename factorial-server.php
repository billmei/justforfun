<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Simple Factorials</title>
</head>
<body>

<?php
$n = $_GET["n"];
function factorial($n)
{
if ($n == 0)
	return 1;
else
	return factorial($n - 1) * $n;
}
echo factorial($n);
?>

</body>
</html>