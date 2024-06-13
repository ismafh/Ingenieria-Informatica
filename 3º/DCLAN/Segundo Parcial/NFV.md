# NFV

## Concepto de NFV

***NFV*** es una tecnología que virtualiza y despliega funciones de red en software, permitiendo una mayor flexibilidad, eficiencia y automatización en la gestión de redes. Al separar las funciones de red del hardware físico, se obtienen beneficios en términos de costos, escalabilidad y agilidad en la implementación de servicios de red
Requiere mover aplicaciones de red desde hardware dedicado a máquinas/contenedores virtuales que se ejecutan en hardware estándar.

- NFV y SDN son complementarios, uno no depende del otro (se puede usar solo NFV, solo SDN o ambos).

## Porque usar NFV

Son las mismas razones por las que necesitamos SDN:

1. Virtualización: usar recursos de la red sin preocuparse por su localización, organización, espacio…
2. Orquestación: administrar miles de dispositivos.
3. Programabilidad: cambiar el comportamiento mientras la red está funcionando.
4. Escalado dinámico: poder cambiar el tamaño o cantidad de elementos.
5. Automatización.
6. Visibilidad: monitorización.
7. Rendimiento: optimizar la utilización de dispositivos de red.
8. Soporte a múltiples clientes.
9. Integración de servicios.
10. Apertura: elección completa de complementos modulares

Ventajas:
- Más barato (menos hardware).
- Evita atarse a proveedores.
- Flexibilidad en el diseño.
- Mayor innovación.
Casos de uso: balanceadores de carga, cortafuegos, aceleradores WAN, dispositivos detectores de intrusos….


## Beneficios de una arquitectura NFV estándar.
Queremos ser completamente independientes de cualquier tipo de manufactura, por lo que es necesario que existan estándares que limiten como los manufactores producen su software y hardware para que podamos quitar uno y poner otro sin problemas.

El objetivo final es que los operadores tengan una infraestructura de virtualización unificada y genérica, compatible con la función de red virtual (VNF) de cualquier proveedor, lo que hace que la estandarización sea imprescindible.


## ETSI NFV GROUP
ETSI NFV ISG (European Telecommunications Standards Institute Network Functions Virtualization Industry Specification Group) es un grupo de trabajo dentro del Instituto Europeo de Estándares de Telecomunicaciones (ETSI) que se centra en el desarrollo y estandarización de la tecnología de Network Functions Virtualization (NFV).
Están trabajando en definir los requisitos de estandarización de NFV, y para ello han creado 4 grupos de trabajo:
- INF: Arquitectura para la infraestructura de visrtualización.
- MANO: Gestión y orquestación.
- SWA: Arquitectura de software.
- REL: Confiabilidad y Disponibilidad, Resiliencia y Tolerancia a fallos.
Además cuentan con dos grupos de expertos:
- Seguridad.
- Rendimiento y portabilidad.