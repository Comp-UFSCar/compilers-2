define(
['jquery', 'd3'],
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
			.append('<tr><td>' + receipt.id
				+ '</td><td>' + receipt.seller.entity.name
				+ '</td><td>' + receipt.buyer.entity.name
				+ '</td><td>' + receipt.date
				+ '</td><td>' + receipt.tax
				+ '</td><td>' + receipt.total + '</td></tr>');

		// <th>Id</th>
		// <th>Seller</th>
		// <th>Buyer</th>
		// <th>Date</th>
		// <th>Tax</th>
		// <th>Total</th>
	}

	Interface.RemoveReceiptFromList = function ( index ) {
		$(Interface.elements.receipts)
			.children()
			.eq(index)
			.remove();
	}

	Interface.DrawChart = function ( receipts ) {

		// sort by date
		receipts.sort(function(a, b) { return new Date(a.date) - new Date(b.date); });

        var width    = 940,
            height   = 500,
            barWidth = width / receipts.length;

        var y = d3.scale.linear()
            .domain([0, d3.max(receipts, function(d) { return +d.total.substring(1, d.total.length); })])
            .range([height, 0]);

        var chart = d3.select(".chart")
            .attr("width", width)
            .attr("height", height);

        var bar = chart.selectAll("g")
            .data(receipts)
          .enter().append("g")
            .attr("transform", function(d, i) { return "translate(" + i * barWidth + ", 0)"; });

        bar.append("rect")
            .attr("y", 		function(d) { return y(+d.total.substring(1, d.total.length)); })
            .attr("height", function(d) { return height - y(+d.total.substring(1, d.total.length)); })
            .attr("width", barWidth - 1);

        bar.append("text")
            .attr("x", 300)
            .attr("y", function(d) { return 0; })
            .attr("dy", "-1.1em")
            .attr("transform", function(d, i) { return "rotate(90)"; })
            .text(function(d) {
            	return d.seller.entity.name + " - " + d.date + ": " + d.total;
        	})
            ;
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
		RemoveReceiptFromList : Interface.RemoveReceiptFromList,

		DrawChart : Interface.DrawChart
	};
});