	// 字典对象
	function Dictionary() {
		this.data = new Array();
		this.put = function(key, value) {
			this.data[key] = value;
		};
		this.get = function(key) {
			return this.data[key];
		};
	}
	var d = new Dictionary();
	d.put('Beijing', '北京');
	d.put('Chongqing', '重庆');
	d.put('Shengzhen', '深圳');
	d.put('Guangdong', '重庆');
	d.put('Shanghai', '上海');