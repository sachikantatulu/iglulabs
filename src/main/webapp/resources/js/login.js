function enableBtn() {
    document.getElementById("sub").disabled = false;
}
/*

function saveData() {
    console.log("data in ajax");
    var mobile = document.getElementById("num").value;
    var pass1 = document.getElementById("password").value;


    if (pass1.length == 0 || mobile.length == 0) {
        document.getElementById("num").value = "";
        document.getElementById("password").value = "";
        alert("Please enter the details");
    } else {
        var senddata = '{\"mob\":\"' + mobile + '\", \"password\":\"' + pass1 + '\"}';
        console.log(senddata);

        $.ajax({
            type: "POST",
            url: "/api/mob_authentication",
            contentType: "application/json",
            dataType: "json",
            data: senddata,
            success: function (res) {

                // console.log(JSON.parse(res.code));
                if (res.code == 200) {

                    // hitData();

                    console.log("Data Sent to server");
                    window.location= "/";

                }
                if (res.code == 204) {
                  document.getElementById("num").value = "";
                  document.getElementById("password").value = "";
                  alert("Incorrect phone number or password");
                }

            },

            error: function () {
                console.log('failure');
            }
        });

    }

}

*/


// function hitData() {
//   console.log("inside hitdata");
//   location.reload();
// }
