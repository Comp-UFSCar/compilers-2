define(
['jquery', 'd3', 'app/interface.js'],
function($, d3, Interface) {
	var info, data;

	console.log(Interface);

	data = [];

	$.getJSON('app/data/self.json', LoadReceipts);

	function LoadReceipts ( info ) {
		var count 		= info.receipts;
		var dateCreated = info.dateCreated;

		for (var i = count; i > 0; i--) {
			$.getJSON('app/data/' + i + '.json', PushReceipt);
		};
	}

	function PushReceipt ( Receipt ) {
		data.push(Receipt);
	}

	function Start() {

	}

	return {
		Start: Start,
		Info: info,
		Data: data
	};
});
