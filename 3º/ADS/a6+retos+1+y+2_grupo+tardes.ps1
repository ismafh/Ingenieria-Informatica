########
# RETO 1
########


$carpeta = "c:\Temp-Diseños"

$res = Test-Path -Path $carpeta -PathType Container

if ($res) {

  Remove-Item -Path $carpeta -Recurse -confirm:$false
}

New-Item -Path $carpeta -ItemType "Directory"


$nombre_unidad = "Temp-UO"
$dn_contenedor  = "dc=admon,dc=lab"
$dn_unidad = "ou=Temp-UO,dc=admon,dc=lab"

# crea la UO $nombre_unidad en el contenedor $dn_contenedor,
# sin protección ante borrado accidental
# eliminándola previamente en caso de que exista


$unidad = Get-ADOrganizationalUnit -Filter {Name -eq $nombre_unidad} -SearchBase $dn_contenedor -SearchScope OneLevel

if ($unidad -ne $null) {
   Remove-ADOrganizationalUnit -Identity $dn_unidad -Recursive -confirm:$false
}

New-ADOrganizationalUnit -Name $nombre_unidad -Path $dn_contenedor -ProtectedFromAccidentalDeletion $false

$nombre_unidad = "Diseño"
$dn_contenedor  = "ou=Temp-UO,dc=admon,dc=lab"
New-ADOrganizationalUnit -Name $nombre_unidad -Path $dn_contenedor -ProtectedFromAccidentalDeletion $false

$nombre_unidad = "Usuarios"
$dn_contenedor  = "ou=Diseño,ou=Temp-UO,dc=admon,dc=lab"
New-ADOrganizationalUnit -Name $nombre_unidad -Path $dn_contenedor -ProtectedFromAccidentalDeletion $false

$nombre_unidad = "Roles"
New-ADOrganizationalUnit -Name $nombre_unidad -Path $dn_contenedor -ProtectedFromAccidentalDeletion $false

$nombre_unidad = "Recursos"
New-ADOrganizationalUnit -Name $nombre_unidad -Path $dn_contenedor -ProtectedFromAccidentalDeletion $false


########
# RETO 2
########

$CSV = ".\plantilla.csv"

$dn_contenedor = "ou=Usuarios,ou=Diseño,ou=Temp-UO,dc=admon,dc=lab"

import-csv -path $CSV  | ForEach-Object { 
    [string]$persona = $_.persona

    Write-Host "Procesando la fila persona = $persona"

    $linea_correcta = $true
    $usuario = Get-ADUser -Filter {Name -eq $persona}

    if ($usuario -ne $null) {
        Write-Host "El usuario $persona ya existe" -ForegroundColor Magenta
        $linea_correcta = $false
    }

    if ($linea_correcta) {

        $contraseña = "Admon.lab.1"
        $hash = Convertto-SecureString -AsPlainText $contraseña -Force

        New-ADUser -Name $persona -AccountPassword $hash -ChangePasswordAtLogon $false -Enabled $true -Path $dn_contenedor
    }          

}
