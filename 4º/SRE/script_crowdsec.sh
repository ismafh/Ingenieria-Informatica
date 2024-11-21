#!/bin/bash

# URL de la API de CrowdSec, hay que mirar cual tenemos
API_URL="http://localhost:8080/v1/decisions"

# Número mínimo de bloqueos para generar una alerta, se pueden cambiar por los que queramos por lo que hay que definir a partir de cuando alertar
MIN_BLOCKS=5

# Consultar la API de CrowdSec y contar los bloqueos
BLOCK_COUNT=$(curl -s $API_URL | jq '.data | length')

if [ "$BLOCK_COUNT" -ge "$MIN_BLOCKS" ]; then
  echo "CRITICAL: $BLOCK_COUNT bloqueos detectados por CrowdSec"
  exit 2
else
  echo "OK: $BLOCK_COUNT bloqueos detectados"
  exit 0
fi