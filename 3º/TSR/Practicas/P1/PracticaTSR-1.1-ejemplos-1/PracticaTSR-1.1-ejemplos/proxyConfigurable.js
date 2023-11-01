const net = require('net');

// Lee los argumentos de la línea de comandos
const args = process.argv.slice(2); // Ignoramos los dos primeros argumentos (node y nombre del archivo)

if (args.length !== 4) {
  console.log("Uso: node proxy.js <LOCAL_PORT> <LOCAL_IP> <REMOTE_PORT> <REMOTE_IP>");
  process.exit(1);
}

const LOCAL_PORT = parseInt(args[0]);
const LOCAL_IP = args[1];
const REMOTE_PORT = parseInt(args[2]);
const REMOTE_IP = args[3];

const server = net.createServer(function (socket) {
  const serviceSocket = new net.Socket();
  serviceSocket.connect(REMOTE_PORT, REMOTE_IP, function () {
    socket.on('data', function (msg) {
      serviceSocket.write(msg);
    });
    serviceSocket.on('data', function (data) {
      socket.write(data);
    });
  });
}).listen(LOCAL_PORT, LOCAL_IP);

console.log("TCP server accepting connection on port: " + LOCAL_PORT);