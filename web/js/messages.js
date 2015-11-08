$( document ).ready(function() {
	var mes_list = "";
	for (var i = messages_1.length - 1; i >= 0; i--) {
		
		switch(messages_1[i].type) {
			case "text":
				mes_list = mes_list + "<li class='collection-item avatar'><i class='material-icons circle red'>textsms</i><span class='title'>"+messages_1[i].title+"</span><p> From: "+messages_1[i].start+"<br>To: "+messages_1[i].end+"</p><a href='#!'' class='secondary-content'><i class='material-icons'>grade</i></a></li>";
			break;
			case "audio":
				mes_list = mes_list + "<li class='collection-item avatar'><i class='material-icons circle red'>voicemail</i><span class='title'>"+messages_1[i].title+"</span><p> From: "+messages_1[i].start+"<br>To: "+messages_1[i].end+"</p><a href='#!'' class='secondary-content'><i class='material-icons'>grade</i></a></li>";
			break;
			case "video":
				mes_list = mes_list + "<li class='collection-item avatar'><i class='material-icons circle red'>play_arrow</i><span class='title'>"+messages_1[i].title+"</span><p> From: "+messages_1[i].start+"<br>To: "+messages_1[i].end+"</p><a href='#!'' class='secondary-content'><i class='material-icons'>grade</i></a></li>";
			default:
		}
		
	};
	
	$("#mess_content").html(mes_list);
});




