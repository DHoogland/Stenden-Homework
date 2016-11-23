<?php
	function getWeatherStringHoogeveen()
	{
		$weatherLink = 'http://weather.yahooapis.com/forecastrss?p=NLXX0031&u=c';
		$reader = new XMLReader();
		$tempLocation = 0;
		$tempText = '';
		$tempCode = '';
		$loction = '';
		
		if(!$reader -> open($weatherLink))
		{
			print "can't read link";
		}
		
		while ($reader->read())
        {
            if($reader->nodeType == XMLReader::ELEMENT )
            {
                    $name = $reader->name;                   
                    
                    if($name == 'yweather:location')
                    {
						$location = $reader->getAttribute('city');                    	
                    }
                    
                    if($name == 'yweather:condition')
                    {
                    	$tempText = $reader->getAttribute('text');
						$tempCode = $reader->getAttribute('code');
						$tempLocation = $reader->getAttribute('temp');
                    }
            }

            if (in_array($reader->nodeType, array(XMLReader::TEXT, XMLReader::CDATA, XMLReader::WHITESPACE, XMLReader::SIGNIFICANT_WHITESPACE)) && $name!='')
            {
                    $value= $reader->value;
            }
		}  
		

		return $location . " " . $tempLocation . " " . $tempCode . " " . $tempText;
		
	}
	
?>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Untitled 1</title>
	<link rel="stylesheet" type="text/css" href="style.css" />

	
</head>

<body>
	<?php
		echo getWeatherStringHoogeveen();	
	?>
</body>

</html>
