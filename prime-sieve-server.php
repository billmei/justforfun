<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Sieve of Eratosthenes</title>
</head>
<body>

<?php
$n = $_GET["upper"]; //Upper bound
$m = sqrt($n); //Algorithm stops at sqrt($n)
$j = 0; //Counter
//New array with list of integers from 2 to $n.
for ($a=2; $a<=$n; $a++)
{
	$index[$a] = $a;
}
//Mark all multiples of 2, then 3, then 5, etc. as non-prime (using the string "0"). Stop at sqrt($n).
for ($i=2; $i<=$m; $i++)
{
	for ($k=2; $k<=$n; $k++)
	{
		$index[$k*$i] = "null";
	}
}
//Returns a list of ONLY primes.
for ($q=2; $q<=$n; $q++)
{
	if ($index[$q] == $q)
	{
		echo $index[$q] . "<br />";
		$j++;
	}
	else
	{
		continue;
	}
}
echo "<br /><br />There are a total of " . $j . " primes between 0 and " . $n
?>

</body>
</html>