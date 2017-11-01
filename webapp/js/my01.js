Object.prototype.each = function(fn) {
	var len = this.length;
	for (var i = 0; i < len; i++) {
		fn.call(this[i]);
	}

};

function $(selector) {
	return document.querySelector(selector);
};

function $$(selector) {
	return document.querySelectorAll(selector);
};

function goUrl(url){
	document.mainframe.location=url;
}