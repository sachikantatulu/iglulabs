/*
window.oncontextmenu = function () {
    return false;
}
$(document).keydown(function (event) {
    if (event.keyCode == 123) {
        return false;
    }
    else if ((event.ctrlKey && event.shiftKey && event.keyCode == 73) || (event.ctrlKey && event.shiftKey && event.keyCode == 74)) {
        return false;
    }
});
*/

var outlet=[
 {
     "Serial": 1,
     "Outlet_name":"Mcdee",
     "Location":"Whitefield",
     "State" : "Karnataka",
     "Pin" : 1234,
     "Franchisee" : "Abhinav"
 },
 {
     "Serial": 2,
     "Outlet_name":"Mcdee",
     "Location":"Kormangla",
     "State" : "Karnataka",
     "Pin" : 123456,
     "Franchisee" : "Akash"
 },

 {
     "Serial": 3,
     "Outlet_name":"Mcdee",
     "Location":"Frazer Town",
     "State" : "Karnataka",
     "Pin" : 5678,
     "Franchisee" : "Avinash"
 }
]

// $(document).ready(function() {
//  $("#mytable tbody tr td").on('load', function() {
     
//         //get <td> element values here!!??
//     });
// });

var tdata='';
function displayOutletDetails()
{
    tdata='';
for(i=0;i<outlet.length;i++)
{
   var Serial=outlet[i].Serial;
   var Outlet_name=outlet[i].Outlet_name;
   var Location=outlet[i].Location;
   var State=outlet[i].State;
   var Pin=outlet[i].Pin;
   var Franchisee=outlet[i].Franchisee;
   console.log("outside load data");
  
  
   tdata += '<tr>';
   tdata += '<td>' + Serial + '</td>';
   tdata += '<td>' + Outlet_name + '</td>';
   tdata += '<td>' + Location + '</td>';
   tdata += '<td>' + State + '</td>';
   tdata += '<td>' + Pin + '</td>';
   tdata += '<td>' + Franchisee + '</td>';
   tdata += '</tr>';

  // $("#mydata").append("<tr><td class=\"tab\">"+Serial+"</td><td class=\"tab\">"+Outlet_name+"</td><td class=\"tab\">"+Location+"</td><td class=\"tab\">"+State+"</td><td class=\"tab\">"+Pin+"</td><td class=\"tab\">"+Franchisee+"</td></tr>");
  
}
console.log(tdata);
console.log("before modal show");
$('#ModalOutlets').modal('show');
console.log("after modal show");
loadData();

}

function loadData() {
    console.log("inside loaddata");
    $("#myoutlet").DataTable().destroy();
    document.getElementById("mydata").innerHTML=tdata;
  $('#myoutlet').DataTable({
   //scrollX: true,
    "paging": true,
    "lengthChange": false,
    "searching": false,
    "ordering": false,
    "info": true,
    "autoWidth": false
  });

}


// ======================================PRODUCT========================================================
var products=[
    {
        "Serial": 1,
        "product_name":"Rice",
        "Barcode": "#111333444",
        "Amount_Paid" : 1000,
        "Tax_Paid" : 340
    },
    {
        "Serial": 2,
        "product_name":"Pulse",
        "Barcode": "#1113334555",
        "Amount_Paid" : 4000,
        "Tax_Paid" : 440
    },

    {
        "Serial": 3,
        "product_name":"Sugar",
        "Barcode": "#111556444",
        "Amount_Paid" : 2000,
        "Tax_Paid" : 640
    }
]


var productdata='';
function displayProductDetails()
{
    productdata=''
for(i=0;i<products.length;i++)
{
    var Serial=products[i].Serial;
    var Product_name=products[i].product_name;
    var Barcode=products[i].Barcode;
    var Amount_Paid=products[i].Amount_Paid;
    var Tax_Paid=products[i].Tax_Paid;

   productdata += '<tr>';
   productdata += '<td>' + Serial + '</td>';
   productdata += '<td>' + Product_name + '</td>';
   productdata += '<td>' + Barcode + '</td>';
   productdata += '<td>' + Amount_Paid + '</td>';
   productdata += '<td>' + Tax_Paid + '</td>';
   productdata += '</tr>';

  // $("#mydata").append("<tr><td class=\"tab\">"+Serial+"</td><td class=\"tab\">"+Outlet_name+"</td><td class=\"tab\">"+Location+"</td><td class=\"tab\">"+State+"</td><td class=\"tab\">"+Pin+"</td><td class=\"tab\">"+Franchisee+"</td></tr>");

}
console.log(productdata);
console.log("before modal show");
$('#ModalProducts').modal('show');
console.log("after modal show");

loadProductData();

}

function loadProductData() {
    console.log("inside loaddata");
    $("#myproduct").DataTable().destroy();
    document.getElementById("myproducts").innerHTML=productdata;
 $('#myproduct').DataTable({
    //scrollX: true,
    "paging": true,
    "lengthChange": false,
    "searching": false,
    "ordering": false,
    "info": true,
    "autoWidth": false
  });

}


// ===================================Transaction===============================================================

var transaction=[
    {
        "Serial": 1,
        "Item":"Rice",
        "Barcode": "#111333444",
        "Amount_Paid_per_unit":400,
        "Tax_on_cost_price": 200,
        "Tax_on_selling_price": 200,
        "Tax_liability" : 100
    },
    {
        "Serial": 2,
        "Item":"Pulse",
        "Barcode": "#1113334555",
        "Amount_Paid_per_unit":400,
        "Tax_on_cost_price": 300,
        "Tax_on_selling_price": 100,
        "Tax_liability" : 300
    },

    {
        "Serial": 3,
        "Item":"Sugar",
        "Barcode": "#111556444",
        "Amount_Paid_per_unit":400,
        "Tax_on_cost_price": 200,
        "Tax_on_selling_price": 200,
        "Tax_liability" : 400
    }
]


var trndata='';
function displayTransactionDetails()
{
    trndata='';
for(i=0;i<transaction.length;i++)
{
    var Serial=transaction[i].Serial;
    var Item=transaction[i].Item;
    var Barcode=transaction[i].Barcode;
    var Amount_Paid_Per_Unit=transaction[i].Amount_Paid_per_unit;
    var Tax_on_Cost_Price=transaction[i].Tax_on_cost_price;
    var Tax_on_Selling_Price=transaction[i].Tax_on_selling_price;
    var Tax_liability=transaction[i].Tax_liability;

  
  
    trndata += '<tr>';
    trndata += '<td>' + Serial + '</td>';
    trndata += '<td>' + Item + '</td>';
    trndata += '<td>' + Barcode + '</td>';
    trndata += '<td>' + Amount_Paid_Per_Unit + '</td>';
    trndata += '<td>' + Tax_on_Cost_Price + '</td>';
    trndata += '<td>' + Tax_on_Selling_Price + '</td>';
    trndata += '<td>' + Tax_liability + '</td>';
    trndata += '</tr>';

  // $("#mydata").append("<tr><td class=\"tab\">"+Serial+"</td><td class=\"tab\">"+Outlet_name+"</td><td class=\"tab\">"+Location+"</td><td class=\"tab\">"+State+"</td><td class=\"tab\">"+Pin+"</td><td class=\"tab\">"+Franchisee+"</td></tr>");

}
console.log(trndata);
console.log("before modal show");
$('#ModalTransaction').modal('show');
console.log("after modal show");

loadTransactionData();
}

function loadTransactionData() {
    console.log("inside loaddata");
    $("#mytrn").DataTable().destroy();
    document.getElementById("mytransaction").innerHTML=trndata;
  $('#mytrn').DataTable({
    scrollX: true,
    "paging": true,
    "lengthChange": false,
    "searching": false,
    "ordering": false,
    "info": true,
    "autoWidth": false
  });

}


var totaloutlet=outlet.length;
var totalproducts=products.length;
var totaltransaction=transaction.length;

console.log(totaloutlet);
console.log(totalproducts);
console.log(totaltransaction);

function totalsum()
{
document.getElementById("totalstores").innerHTML="<span>"+totaloutlet+"</span>";
document.getElementById("totalprod").innerHTML="<span>"+totaloutlet+"</span>";
document.getElementById("totaltrn").innerHTML="<span>"+totaloutlet+"</span>";
}
