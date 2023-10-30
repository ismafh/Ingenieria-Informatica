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

    function fuera(x, y) {
        return (z) => {return x[y](z+0)}
        }
        var v = [(a)=>{return a+1}, (a)=>{return a+3},(a)=>{return a+2}]
        let w = fuera(v, 1)
        console.log (w(v[2]("cero")))
        console.log (w(v[0](1)))
    