$( document ).ready(function() {
	fill_info(index);
	//$("body").fitText();
	$("#message_tab").hide();
	$("#journey_tab").hide();
	$("#textsms").click(function(){
		$("#h_profile").hide();
		$("#message_tab").show();
		$("#journey_tab").hide();

	});
	$("#star").click(function(){
		$("#h_profile").show();
		$("#message_tab").hide();
		$("#journey_tab").hide();

	});
	$("#journey").click(function(){
		$("#h_profile").hide();
		$("#message_tab").hide();
		$("#journey_tab").show();

	});
	var mes_list = "";
	for (var i = messages_1.length - 1; i >= 0; i--) {
		
		switch(messages_1[i].type) {
			case "text":
				mes_list = mes_list + "<li class='collection-item avatar'><i class='material-icons circle indigo'>textsms</i><span class='title'>"+messages_1[i].title+"</span><p> From: "+messages_1[i].start+"<br>To: "+messages_1[i].end+"</p></li>";
			break;
			case "audio":
				mes_list = mes_list + "<li class='collection-item avatar'><i class='material-icons circle teal'>voicemail</i><span class='title'>"+messages_1[i].title+"</span><p> From: "+messages_1[i].start+"<br>To: "+messages_1[i].end+"</p></li>";
			break;
			case "video":
				mes_list = mes_list + "<li class='collection-item avatar'><i class='material-icons circle red'>play_arrow</i><span class='title'>"+messages_1[i].title+"</span><p> From: "+messages_1[i].start+"<br>To: "+messages_1[i].end+"</p></li>";
			default:
		}
		
	};
	
	$("#mess_content").html(mes_list);
	
});

function fill_info(hiker_index) {
	$("#h_name").text("I'm "+hikers[hiker_index].name);
	$("#h_description").text(" "+hikers[hiker_index].description);
	$("#h_image").attr( "src", hikers[hiker_index].image );
	$("#h_destination").text("destination: "+hikers[hiker_index].destination );
	$("#h_time").text("Time remaining: "+hikers[hiker_index].time);
}




