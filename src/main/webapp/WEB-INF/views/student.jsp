<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student List</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
</head>
<body onload="load();">
 
        
        Name: <input type="text" id="name" required="required" name="student_name"><br>
        Course: <input type="text" id="course" required="required" name="course_name"><br>
        <button onclick="submit();">Submit</button>
     
     
 
        <table id="table" border=1>
            <tr> <th> Student Name </th> <th> Student Course </th> <th> Edit </th> <th> DeRegister </th> </tr>
         
        </table>
             
     
    <script type="text/javascript">
    data = "";
    submit = function(){
          
            $.ajax({
                url:'student/saveOrUpdate',
                type:'POST',
                data:{student_name:$("#student_name").val(),course_name:$('#course_name').val()},
                success: function(response){
                        alert(response.message);
                        load();    
                }              
            });        
    }
     
    dereister_ = function(name){     
         $.ajax({
            url:'student/deregister',
            type:'POST',
            data:{user_name:name},
            success: function(response){
                    alert(response.message);
                    load();
            }              
        });
}
     
 
    edit = function (index){
        $("#student_name").val(data[index].student_name);
        $("#course_name").val(data[index].course_name);
         
    }
     
     
    load = function(){ 
        $.ajax({
            url:'student/enrolled',
            type:'POST',
            success: function(response){
                    data = response.data;
                    $('.tr').remove();
                    for(i=0; i<response.data.length; i++){                  
                        $("#table").append("<tr class='tr'> <td> "+response.data[i].student_name+" </td> <td> "+response.data[i].course_name+" </td> <td> <a href='#' onclick= edit("+i+");> Edit </a>  </td> </td> <td> <a href='#' onclick='deregister_("+response.data[i].student_name+");'> DeRegister </a>  </td> </tr>");
                    }          
            }              
        });
         
    }
         
    </script>
     
</body>
</html>