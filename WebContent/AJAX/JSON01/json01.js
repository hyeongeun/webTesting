
var arr = new Array();
var xhr =null;
function toServer(){
	if(window.XMLHttpRequest){
		xhr = new XMLHttpRequest
	}else{
		xhr = new ActiveXObject("Microsoft.XMLHTTP");
	}
	xhr.open("GET","json01.txt",true);
	xhr.send();
	xhr.onreadystatechange = resultProcess;
}

function resultProcess(){
	if(xhr.readyState==4 && xhr.status==200){
		arr.push(xhr.responseText);
		//alert(arr);
		
		var obj = JSON.parse(xhr.responseText);
		
		var disp = document.getElementById("disp");
		var ul = document.createElement("ul");
		var liNode1 = document.createElement("li");
		liNode1.innerHTML = obj.name;
		var liNode2 = document.createElement("li");
		liNode2.innerHTML = obj.age;
		var liNode3 = document.createElement("li");
		liNode3.innerHTML = obj.ki;
		
		ul.appendChild(liNode1);
		ul.appendChild(liNode2);
		ul.appendChild(liNode3);
		disp.appendChild(ul);
		
	
	}
}