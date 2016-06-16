var level = 1;
var num_face = 5;
var thebody = document.getElementById("theBody");
var leftdiv = document.getElementById("leftside");
var rightdiv = document.getElementById("rightside");

function generate_Face() {
	var num_face_temp = num_face;
	while (num_face_temp) {
		var left_position = Math.random()*400;
		var top_position = Math.random()*400;
		var image = document.createElement("img");
		image.src = "smile.png"
		image.style.left = left_position+"px";
		image.style.top = top_position+"px";
		leftdiv.appendChild(image);
		num_face_temp-=1;
	}

	var copyOfLeft = leftdiv.cloneNode(true);
	copyOfLeft.removeChild(copyOfLeft.lastChild);
	rightdiv.appendChild(copyOfLeft);

	leftdiv.lastChild.onclick=
    function nextLevel(event){
        event.stopPropagation();
        num_face += 5;
        level += 1;
        delete_Face();
        generate_Face();
	};

	thebody.onclick=
	function game_over(event){
		alert("GAME OVER AT LEVEL " + level);
		thebody.onclick = null;
    	leftdiv.lastChild.onclick = null;
	};
}

function delete_Face() {
	while (leftdiv.hasChildNodes()) {
		leftdiv.removeChild(leftdiv.childNodes[0]);
	}

	while(rightdiv.hasChildNodes()) {
		rightdiv.removeChild(rightdiv.childNodes[0]);
	}
}