define([
	'jquery',
	'bootstrap',
	'd3',
	'app/data.js',
	'app/interface.js',
],
function ($, Boot, D3, Data, Interface) {

	function spin() {
		if (!Data.ready)
			setTimeout(spin, 200);
		else
			Continue();
	}

	function Continue() {
		Interface.ApplicationStart();

		for (var receipt in Data.receipts ) {
			Interface.AddReceiptToList(Data.receipts[receipt]);
		}
	}

	function Start() {
		console.log("Application initiated.");

		// wait until Data is filled
		spin();
	}

	return {
		Start: Start
	};
});
