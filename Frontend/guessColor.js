var target;
//store targeted color
var guess_input;
//store user's input
var flag = false;
//check the guess result
var counter=0;
//count the times of guess
var color = ["red","orange","yellow","green","blue","indigo","violet"].sort();

function do_game () {
 	var index = Math.floor(Math.random()*color.length);
 	//alert(index), this statement is to check the correct.
 	target = color[index];
 	while (!flag) {
 		guess_input = prompt("I am thinking of a color from the following set\n\n"+
 			color+"\n\n"+"Can you guess which color it is ?");
 		counter++;
 		flag = checkresult();
 	}
 	alert("Refresh the page to play again!")
 } 

 function checkresult () {
 	if (!color.includes(guess_input)) {
 		alert("We can't reconginize your input  \n\n"+ "try it again\n\n"+color);
 		return false;
 	}

 	else if (guess_input > target) {
 		alert("Your guess is larger than targeted color. \n\n"+"try again!");
 		return false;
 	}

 	else if (guess_input < target) {
 		alert("Your guess is smaller than targeted color. \n\n"+"try again!");
 		return false;
 	}

 	else {
 		document.body.style.backgroundColor = guess_input;
 		alert("Congrants, you guess is correct.\n\n"+"the color is "+guess_input+".\n\n"+"you take "+counter+" times guess!");
 		return true;
 	}
 }