define(
['jquery'],
function($) {

	var Interface = {
		elements : {
			main 	   : '#main',
			receipts   : '#receipts-table',
			appLoading : '#app-loading',
			dataLoading: '#data-loading'
		}
	};

	Interface.HideAll = function () {
		for (var i in Interface.elements) {
			$(Interface.elements[i]).hide();
		}
	}

	Interface.ShowAll = function () {
		for (var i in Interface.elements) {
			$(Interface.elements[i]).show();
		}
	}

	Interface.FadeOutAll = function () {
		for (var i in Interface.elements) {
			$(Interface.elements[i]).fadeOut();
		}
	}

	Interface.FadeInAll = function () {
		for (var i in Interface.elements) {
			$(Interface.elements[i]).fadeIn();
		}
	}

	Interface.ShowAppLoading = function () {
		$(Interface.elements.appLoading).fadeIn();
	}

	Interface.HideAppLoading = function () {
		$(Interface.elements.appLoading).fadeOut();
	}

	Interface.ShowDataLoading = function () {
		$(Interface.elements.dataLoading).fadeIn();
	}

	Interface.HideDataLoading = function () {
		$(Interface.elements.dataLoading).fadeOut();
	}

	Interface.ShowMain = function () {
		$(Interface.elements.main).fadeIn();
	}

	Interface.HideMain = function () {
		$(Interface.elements.main).fadeOut();
	}

	Interface.ApplicationStart = function () {
		Interface.HideAppLoading();
		setTimeout(function() { Interface.ShowMain(); }, 500);
	}

	Interface.AddReceiptToList = function ( receipt ) {
		$(Interface.elements.receipts)
			.append('<tr><td>' + receipt.id + '</td><td>' + receipt.total + '</td><td>' + receipt.date + '</td></tr>');
	}

	Interface.RemoveReceiptFromList = function ( index ) {
		$(Interface.elements.receipts)
			.children()
			.eq(index)
			.remove();
	}

	return {
		HideAll	  : Interface.HideAll,
		ShowAll	  : Interface.ShowAll,
		FadeOutAll: Interface.FadeOutAll,
		FadeInAll : Interface.FadeInAll,
		
		ShowAppLoading : Interface.ShowAppLoading,
		HideAppLoading : Interface.HideAppLoading,
		
		ShowDataLoading : Interface.ShowDataLoading,
		HideDataLoading : Interface.HideDataLoading,

		ShowMain : Interface.ShowMain,
		HideMain : Interface.HideMain,

		ApplicationStart : Interface.ApplicationStart,

		AddReceiptToList 	  : Interface.AddReceiptToList,
		RemoveReceiptFromList : Interface.RemoveReceiptFromList
	};
});