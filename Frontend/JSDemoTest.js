function callback() {
    console.log('Done');
}
console.log('before setTimeout()');
setTimeout(callback, 5000); // 5 second pause.
console.log('after setTimeout()');