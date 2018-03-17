 google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart1);
      function drawChart1() {

        var data = google.visualization.arrayToDataTable([
          ['Task','Attandance'],
          ['Present',     11],
          ['Absent',      2]
        ]);

        var options = {
          title: 'STUDENT',
		  colors: ['#4da6ff', '#ff4d4d']
        };
		
        var chart1 = new google.visualization.PieChart(document.getElementById('piechart1'));
			chart1.draw(data, options);
      }
	  
	  
	  google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart2);
      function drawChart2() {

        var data = google.visualization.arrayToDataTable([
          ['Task', 'Attandance'],
          ['Present',     11],
          ['Absent',      2]
        ]);

        var options = {
          title: 'STAFF',
		  colors: ['#009999', '#ff5c33']
        };
		
        var chart2 = new google.visualization.PieChart(document.getElementById('piechart2'));
			chart2.draw(data, options);
      }
	  
	  
	   google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart11);
      function drawChart11() {

        var data = google.visualization.arrayToDataTable([
          ['Task','Attandance'],
          ['Present',     11],
          ['Absent',      2]
        ]);

        var options = {
          title: 'STUDENT',
		  colors: ['#4da6ff', '#ff4d4d']
        };
		
        var chart11 = new google.visualization.PieChart(document.getElementById('piechart11'));
			chart11.draw(data, options);
      }
	  
	  
	  google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart22);
      function drawChart22() {

        var data = google.visualization.arrayToDataTable([
          ['Task', 'Attandance'],
          ['Present',     11],
          ['Absent',      2]
        ]);

        var options = {
          title: 'STAFF',
		  colors: ['#009999', '#ff5c33']
        };
		
        var chart22 = new google.visualization.PieChart(document.getElementById('piechart22'));
			chart22.draw(data, options);
      }
	  
	  
	  $(window).resize(function(){
		drawChart1()
		drawChart2()
		drawChart11()
		drawChart22()
	});
	