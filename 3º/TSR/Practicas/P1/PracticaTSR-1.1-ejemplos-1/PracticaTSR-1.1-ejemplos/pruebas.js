"use strict";
const fs = require('node:fs/promises');
/*function fibo(n) {
    return (n<2) ? 1 : fibo(n-2) + fibo(n-1)
    }
    function showMessage(m, u) {
    console.log(m + ": The result is: " + u)
    }
    console.log("Starting the process...")
    // Wait for 10 ms in order to show the message...
    setTimeout( function() {
    console.log("M1: My first message...")
    }, 10)
    // Several seconds are needed in order to
    // complete this call: fibo(40)
    let j = fibo(40)
    // M2 is written before M1 is shown. Why?
    showMessage("M2", j)
    // M3 is written after M1. Why?
    setTimeout( function() {
    showMessage("M3", j)
    }, 1)*/

    /*function fuera(x, y) {
        return (z) => {return x[y](z+0)}
        }
        var v = [(a)=>{return a+1}, (a)=>{return a+3},(a)=>{return a+2}]
        let w = fuera(v, 1)
        console.log (w(v[2]("cero")))
        console.log (w(v[0](1)))
    */
        /*function g (a) {
            a = a + 1
            return (b) => {return b + a }
            }
        let f = g(1)
        console.log ( f(1) ) 
*/
    //  Leer de manera sincrona 2 archivos utilizando await
   /*      async function init(){
            const text = await fs.readFile('./texto.txt', 'utf-8') 
            console.log(text)

            console.log("Leyendo segundo texto...")

            const text2 = await fs.readFile('texto2.txt','utf-8')
            console.log(text2)
        }

        init() */

    //Manera de leer archivo utilizando promesa
   // fs.readFile('./texto.txt', 'utf8',) .then((text)=>console.log(text))

   /*     EJERCICIO 8 EXAMEN 2023
  function f(x){
     return function y(y){
        let z = x+y
        return 20
    }
  }
  console.log(f(10)(10))

*/
/*const ev = require('events')
const emitter = new ev.EventEmitter()
const t = 1000, e1 = "uno"
var handler = function () {
console.log("Evento "+e1+" tratado")
}
emitter.on(e1, handler)
function etapa() {
emitter.emit(e1)
setInterval(etapa, t)
}
etapa()
*/
/*let MAX=1000
console.log ("uno")
setTimeout ( () => console.log ("dos"), 100)// Hacer trabajo
for (let i=0; i<MAX; i++) {}
setTimeout ( () => console.log ("tres"), 100)
setTimeout ( () => console.log ("cuatro"), 100)
console.log ("cinco")*/

for(i=0; i<3;i++){
    console.log("prueba")
}
console.log(i)