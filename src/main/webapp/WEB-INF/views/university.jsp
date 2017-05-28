<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>University List</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
</head>
<body onload="load();">
 
        <table id="table" border=1>
            <tr> <th> University Id </th> <th> University Name </th> <th> University Country </th> </tr>
         
        </table>
             
     
    <script type="text/javascript">
    data = "";
    load = function(){ 
        $.ajax({
            url:'list',
            type:'POST',
            success: function(response){
                    data = response.data;
                    $('.tr').remove();
                    for(i=0; i<response.data.length; i++){                  
                        $("#table").append("<tr class='tr'> <td> "+response.data[i].univeristy_id+" </td> <td> "+response.data[i].university_name+" </td> <td> "+response.data[i].university_country+" </td> </tr>");
                    }          
            }              
        });
         
    }
         
    </script>
     
</body>
</html>