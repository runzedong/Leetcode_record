function set_up (argument) {
	var frequency = 1000*prompt("How long will you want the pattern appear in second ?");
	var the_timer = setInterval(show_pattern, frequency);
}

function show_pattern () {	
	var top_position = 25;
	var left_position = 25;
	var width = 500;
	var height = 500;
//	var color_list = ["red","orange","yellow","green","blue","indigo","violet"];
	var page_body = document.getElementById("theBody");

	while(page_body.getfirstChild) {
		var thisnode = page_body.getfirstChild;
		page_body.removeChild(thisnode);
	}

	while (width > 20) {
		var red = Math.floor(Math.random()*256);
		var green = Math.floor(Math.random()*256);
		var blue = Math.floor(Math.random()*256);
		var square_div = document.createElement("div");
		square_div.style.width = width+"px";
		square_div.style.height = height+"px";
		square_div.style.left = left_position+"px";
		square_div.style.top = top_position+"px";
		square_div.style.background = "rgb"+"("+red+","+green+","+blue+")";
		page_body.appendChild(square_div);
		top_position+=10;
		left_position+=10;
		width-=20;
		height-=20;
	}
}
