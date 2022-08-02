var checkAdult = $('#checkRoom-adults');
var checkChildren = $('#checkRoom-children');
$(document).ready(function() {
	checkAdult.val(checkAdult.data('value'));
	checkChildren.val(checkChildren.data('value'));
})


$('#check-room-form').on('submit', function(evC) {
	evC.preventDefault();
	var dateRange = $('#check-room-form #check-room-date').val();
	var accommodationId = $('#accommodation_id').val();
	var dateRanges = dateRange.split(" to ");
	if (dateRange != "") {
		$.ajax({
			type: 'GET',
			data: {
				accommodation_id: accommodationId,
				dateRange: dateRange,
				adult: checkAdult.val(),
				children: checkChildren.val()
			},
			url: '/ajax/accommodation/checkroom',
			
			success: function(objs) {
				
				if(objs.rooms.length > 0){

				var results = '';
				for(var i = 0; i < objs.rooms.length; i++){
				results += '<tr class="room-found">';
				results += '<td class="w-25">';
				results += '<div class="">';
				results += '<a href="" class="text-blue h5 fw-bold">'+objs.rooms[i].nameRoom+'</a>';
				results += '<div class="d-flex flex-wrap my-3">';
				for(var j = 0; j < objs.services.length; j++){
					results += '<span class="fs-12 mb-0 me-3"> <i class="fa-solid fa-check text-success"></i>&nbsp;'+objs.services[j].name+'</span>';
				}
				results += '</div>';
				results += '</td>';
				results += '<td class="b-l-hotel">';
				results += '<div>';
				results += '<div class="mb-2">';
				results += '<i class="fa-solid fa-user"></i>&nbsp; <span class="mx-2">x</span>'+objs.rooms[i].capacity;
				results += '</div>';
				results += '<div class="mb-2">';
				results += '<i class="fa-solid fa-person"></i>&nbsp; <span class="mx-2">x</span>'+objs.rooms[i].quantityAdult;
				results += '</div>';
				results += '<div class="mb-2">';
				results += '<i class="fa-solid fa-child fs-12"></i>&nbsp; <span class="mx-2">x</span>'+objs.rooms[i].quantityChildren;
				results += '</div>';
				results += '</div>';
				results += '</td>';
				results += '<td class="b-l-hotel">';
				results += '<p class="fw-bold mb-1">VND '+objs.rooms[i].price+'</p>';
				results += '<p class="fs-12 text-secondary">Đã bao gồm thuế và phí</p>';
				results += '</td>';
				results += '<td class="b-l-hotel">';
				results += '<ul class="ps-3">';
				results += '<li class="fs-14 fw-bold">Không hoàn tiền</li>';
				results += '</ul>';
				results += '</td>';
				results += '<td class="b-l-hotel bg-book-room">';
				results += '<form id="checkRoomEmpty" action="/customer/booking/form" method="get" class="h-100 d-flex justify-content-center text-center align-items-center">';
				results += '<input type="hidden" name="checkIn" value="'+dateRanges[0]+'">';
				results += '<input type="hidden" name="checkOut" value="'+dateRanges[1]+'">';
				results += '<input type="hidden" name="id" value="'+objs.rooms[i].id+'">';
				results += '<button class="text-blue bg-white text-bg-transparent border-0 text-decoration-underline" type="submit">Booking now!</button>';
				results += '</form>';
				results += '</td>';
				results += '</tr>';
				}
				$('#room-null').css("display","none");
				$('#table-hotel tbody').html(results);
				}
				else{
					$('#room-null').css("display","block");
					$('#room-null').text('*Room not found');
					$('#table-hotel tbody').html('');
				}
			}
		})
	}
	else {
		$(document.body).css("padding-right", "0px !important");
		Swal.fire({
			icon: 'error',
			title: 'It will take a little bit of time...',
			confirmButtonColor: '#0071c2',
			text: 'Please fill the Check in - Check out input!'
		})
		/*.then((value) => {
			if(value.isConfirmed){	
				$('#check-room-date').click();
			}
		})*/
	}

})