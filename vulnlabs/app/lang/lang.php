<?php

function getLang() {

$langs = array("en", "es", "fr");

if(!isset($_COOKIE["lang"])) {
    $lang = "en";
} else {
    if(in_array($_COOKIE["lang"],$langs)) {
        $lang = $_COOKIE["lang"];
    } else {
        $lang = "es";
    }
    
}

return $lang;

}

function getLangName($langCode) {
    switch ($langCode) {
        case "en":
            return "English";
        case "tr":
            return "Türkçe";
        case "fr":
            return "Français";
        case "ar":
            return "عربي";
        case "es":
            return "Castellano";
        }
        
}

function tr($path = NULL)
{


$lang = getLang();

if(!isset($path)) {
    $path = "./$lang.ini";
} else {
    $path = "$path/$lang.ini";

}

$strings = parse_ini_file($path);
return $strings;


}



?>