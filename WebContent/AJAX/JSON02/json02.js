/**
 * 
 */

var xhr = null;
var arr = new Array();

function toServer(){
	if(window.XMLHttpRequest){
		xhr = new XMLHttpRequest;
	}else{
		xhr= new ActiveXObject("Microsoft.XMLHTTP");
	}
	
	arr.push(xhr);
	//alert(arr.join("\n"));
	
	xhr.open("GET","json02.txt",true);
	xhr.send();
	xhr.onreadystatechange = resultProcess;
}
function resultProcess(){
	if(xhr.readyState==4 && xhr.status==200){
	//arr.push(xhr.responseText);
	//alert(arr.join("\n"));
	var obj = JSON.parse(xhr.responseText);
	//arr.push(obj.name +" , "+obj.age+" , "+obj.cars.length+" , "+obj.cars[0].name+" , "+obj.cars[0].model.length);
	
	var disp = document.getElementById("disp");
	
	
	var divName = document.createElement("div");
	divName.innerHTML = obj.name;
	
	var divAge = document.createElement("div");
	divAge.innerNTML = obj.age;
	
	disp.appendChild(divName);
	disp.appendChild(divAge);
	
	
	for(var i=0;i<obj.cars.length;i++){
		var ul = document.createElement("ul");
		var li = document.createElement("li");
		li.innerHTML = obj.cars[i].name;
		ul.appendChild(li);
		
		for(var j=0;j<obj.cars[i].model.length;j++){
			var liList = document.createElement("li");
			liList.innerHTML = obj.cars[i].model[j];
			ul.appendChild(liList);
			
		}
		disp.appendChild(ul);
		
	}
		alert(arr.join("\n"));
}


}











