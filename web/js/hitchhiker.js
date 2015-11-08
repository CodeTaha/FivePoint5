$( document ).ready(function() {
	fill_info(0);
	$("#h_left").on("mousedown", function( event ) {
		index++;
		if (index>hikers.length-1) {
			index=0;
		};
		fill_info(index);
	});

    $("#h_right").on("mousedown", function( event ) {
		index--;
		if (index<0) {
			index=hikers.length-1;
		};
		fill_info(index);
    });
    $("#pick").on("mousedown", function(event){
    	window.location.href = "profile.html";
    });
});

function fill_info(hiker_index) {
	$("#h_name").text(hikers[hiker_index].name);
	$("#h_messages").text(" "+hikers[hiker_index].messages);
	$("#h_videos").text(" "+hikers[hiker_index].videos);
	$("#h_audios").text(" "+hikers[hiker_index].audios);
	$("#h_image").attr( "src", hikers[hiker_index].image );
	$("#h_destination").text("destination: "+hikers[hiker_index].destination );
	$("#h_time").text("Time remaining: "+hikers[hiker_index].time);
}

