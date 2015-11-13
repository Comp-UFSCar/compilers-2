define(
['jquery', 'd3', 'app/interface.js'],
function($, d3, Interface) {

	var data = {
		receipts: [],
		total   : 0,
		ready   : false
	};

	Interface.ShowDataLoading();
	
	$.getJSON('app/data/self.json', LoadReceipts);

	function LoadReceipts ( info ) {
		data.total = info.receipts;
		
		for (var i = data.total; i > 0; i--) {
			$.getJSON('app/data/' + i + '.json', PushReceipt);
		};
	}

	function PushReceipt ( Receipt ) {
		data.receipts.push(Receipt);

		if (data.receipts.length == data.total) {
			data.ready = true;
			Interface.HideDataLoading();
		}
	}

	return data;
});
