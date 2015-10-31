/**
* main.js
*
* main calling of require lib
*
* created at: 07/27/2014
*
*/

// loads predefined configuration
require.config({
    baseUrl: 'app/lib',
    paths: {
        jquery   : 'jquery',
        bootstrap: 'bootstrap',
        d3       : 'd3',
        app      : '../app',
    },

    // dependences over packages which aren't using require structure.
    shim: {
        'bootstrap': ['jquery'],
    }
});

// requires main module
require(['app/app.js'], function ( Application ) {
    // starting application
    console.log('Require initiated.');
    Application.Start();
});
