<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Dynamic Table with Select Options</title>
    <style>
        table {
            width: 60%;
            border-collapse: collapse;
            margin: 20px auto;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: center;
        }
        th {
            background-color: #f4f4f4;
        }
        select {
            padding: 5px;
        }
        .button-container {
            position: fixed;
            bottom: 20px;
            right: 20px;
        }
        .button-container button {
            padding: 10px 15px;
            margin: 5px;
            font-size: 16px;
            cursor: pointer;
        }
    </style>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>

<h2 style="text-align:center;">Dynamic Table with Select Options</h2>

<form id="data-form">
    <table>
        <thead>
            <tr>
                <th>col_name</th>
                <th>uptdwith_entry1</th>
                <th>update with entry2</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><input type="text" name="colName[]" value="id" readonly></td>
                <td><input type="text" name="entry1[]" value="A11"></td>
                <td><input type="text" name="entry2[]" value="A22"></td>
                <td>
                    <select class="action-select" name="action[]">
                        <option value="none">-- Select --</option>
                        <option value="edit">Edit</option>
                        <option value="delete">Delete</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td><input type="text" name="colName[]" value="name" readonly></td>
                <td><input type="text" name="entry1[]" value="Sam"></td>
                <td><input type="text" name="entry2[]" value="John"></td>
                <td>
                    <select class="action-select" name="action[]">
                        <option value="none">-- Select --</option>
                        <option value="edit">Edit</option>
                        <option value="delete">Delete</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td><input type="text" name="colName[]" value="id" readonly></td>
                <td><input type="text" name="entry1[]" value="B11"></td>
                <td><input type="text" name="entry2[]" value="B22"></td>
                <td>
                    <select class="action-select" name="action[]">
                        <option value="none">-- Select --</option>
                        <option value="edit">Edit</option>
                        <option value="delete">Delete</option>
                    </select>
                </td>
            </tr>
        </tbody>
    </table>

    <div class="button-container">
        <button type="button" id="save-button">Save</button>
        <button type="button" id="cancel-button">Cancel</button>
    </div>
</form>

<script>
    $(document).ready(function () {
        $('#save-button').on('click', function () {
            let formData = $('#data-form').serialize();
            
            let data = [];
            $('#data-form tbody tr').each(function () {
                /* let row = [
                	$(this).find('td:nth-child(1) input').val(),
                	 $(this).find('td:nth-child(2) input').val(),
                     $(this).find('td:nth-child(3) input').val(),
                ]; */
                let randomNumber = Math.floor(Math.random() * 1000);
               data.push([
            	   $(this).find('td:nth-child(1) input').val(),
              	 $(this).find('td:nth-child(2) input').val(),
              	randomNumber
               ]);
                
               data.push([
            	   $(this).find('td:nth-child(1) input').val(),
              	 $(this).find('td:nth-child(3) input').val(),
              	randomNumber
               ]);
               //alert(data)
            });
            
            console.log(data);
            
            $.ajax({
                url: 'saveData',
                method: 'POST',
                data: JSON.stringify(data),
                contentType: 'application/json',
                success: function (response) {
                    alert('Data saved successfully!');
                },
                error: function () {
                    alert('Error saving data!');
                }
            });
        });

        $('#cancel-button').on('click', function () {
            alert('Cancel button clicked!');
        });
    });
</script>

</body>
</html>
