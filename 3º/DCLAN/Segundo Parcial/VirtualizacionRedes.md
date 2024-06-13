## Virtualización de REDES

### Ventajas para los clientes

#### Formación de una red superpuesta:

- Capa de conectividad: Los clientes pueden definir y controlar su propia capa de conectividad sin preocuparse por la infraestructura física subyacente. Pueden crear conexiones virtuales entre sus dispositivos que operan como si estuvieran directamente conectados.

- Direcciones (IP y MAC): Los clientes tienen control total sobre las direcciones IP y MAC en su red virtual. Esto les permite administrar su espacio de direcciones independientemente del proveedor.

- Particiones de red (VLAN y subredes): Los clientes pueden crear y gestionar sus propias VLANs y subredes, lo que facilita la segmentación de la red para mejorar la seguridad y el rendimiento.

- Ubicación del nodo: Los clientes pueden mover sus nodos (dispositivos de red) libremente dentro de la red virtual sin preocuparse por los cambios en la infraestructura física. Esto es útil para la movilidad y la flexibilidad de la red.


## Ventajas para los proveedores

### Gestión simplificada

- Direcciones internas: Los proveedores no necesitan preocuparse por las direcciones IP y MAC utilizadas por los clientes dentro de sus redes virtuales. Cada red virtual está aislada, por lo que no hay conflictos de direcciones.

- Número de nodos: Los proveedores pueden soportar un gran número de clientes y sus respectivos nodos sin gestionar individualmente cada nodo. La infraestructura subyacente es capaz de manejar múltiples redes virtuales independientemente del número de dispositivos.

- Ubicación de los nodos: La ubicación física de los nodos de los clientes no es una preocupación para los proveedores. Los nodos pueden estar en cualquier lugar de la infraestructura física mientras pertenezcan a la red virtual del cliente.

- Particiones de clientes (VLAN y subredes): Los proveedores no tienen que gestionar las particiones de red específicas (como VLANs y subredes) de cada cliente. Cada cliente puede configurar y manejar sus particiones de manera independiente dentro de su red virtual.