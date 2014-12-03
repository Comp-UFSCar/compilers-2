define([
	'jquery',
	'bootstrap',
	'd3',
	'app/data.js',
	'app/interface.js',
],
function ($, Boot, D3, Data, Interface) {

	function Start() {
		console.log("Application initiated.");

		setTimeout(function () {
			console.log(Data);
		}, 1000);

		$('#loading-sign').fadeOut();
		$('#main').fadeIn();
	}

	return {
		Start: Start
	};
});
