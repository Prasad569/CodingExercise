<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course List</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
</head>
<body onload="load();">
 
        <input type="hidden" id="course_id">
        Course Name: <input type="text" id="courseName" required="required" name="courseName"><br>
        University Name: <input type="email" id="universityName" required="required" name="universityName"><br>
        <button onclick="submit();">Submit</button>
     
     
 
        <table id="table" border=1>
            <tr> <th> Course Name </th> <th> University Name </th> <th> Edit </th> <th> Delete </th> </tr>
         
        </table>
             
     
    <script type="text/javascript">
    data = "";
    submit = function(){
          
            $.ajax({
                url:'course/saveOrUpdate',
                type:'POST',
                data:{course_name:$("#courseName").val(),universityName:$('#universityName').val()},
                success: function(response){
                        alert(response.message);
                        load();    
                }              
            });        
    }
     
    delete_ = function(id){     
         $.ajax({
            url:'course/delete',
            type:'POST',
            data:{course_id:id},
            success: function(response){
                    alert(response.message);
                    load();
            }              
        });
}
     
 
    edit = function (index){
        $("#course_id").val(data[index].course_id);
        $("#courseName").val(data[index].course_name);
        $("#universityName").val(data[index].university_name);
         
    }
     
     
    load = function(){ 
        $.ajax({
            url:'course/list',
            type:'POST',
            success: function(response){
                    data = response.data;
                    $('.tr').remove();
                    for(i=0; i<response.data.length; i++){                  
                        $("#table").append("<tr class='tr'> <td> "+response.data[i].course_name+" </td> <td> "+response.data[i].university_name+" </td> <td> <a href='#' onclick= edit("+i+");> Edit </a>  </td> </td> <td> <a href='#' onclick='delete_("+response.data[i].course_id+");'> Delete </a>  </td> </tr>");
                    }          
            }              
        });
         
    }
         
    </script>
     
</body>
</html>