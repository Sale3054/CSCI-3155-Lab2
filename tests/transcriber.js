var lineWriter = require('fs').createWriteStream('master_tester.ansx')

var lineReader = require('readline').createInterface({
  input: require('fs').createReadStream('master_tester.jsyx')
});

lineReader.on('line', function (line) {
	let foo = eval(line)
	if (typeof foo === 'string'){
		lineWriter.write("\'" + foo + "\'" + "\n")
	}
	else {
		lineWriter.write(foo + "\n")
	}
});