<%-- 
    Document   : add_worker_output
    Created on : May 19, 2025, 10:27:51 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Worker Added</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #FF7E5F, #FEB47B);
            color: white;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        .result-container {
            background: rgba(0, 0, 0, 0.6);
            padding: 40px;
            border-radius: 10px;
            max-width: 600px;
            text-align: center;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
        }

        h1 {
            font-size: 2.5em;
            margin-bottom: 20px;
        }

        p {
            font-size: 1.5em;
            margin: 0;
        }

        .back-button {
            margin-top: 30px;
            padding: 12px 24px;
            background-color: #FF5733;
            color: white;
            font-size: 1em;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-decoration: none;
            transition: background-color 0.3s ease;
        }

        .back-button:hover {
            background-color: #C0392B;
        }
    </style>
</head>
<body>
    <div class="result-container">
        <h1>View Results</h1>

        <%
            Long id = (Long) request.getAttribute("id");
            String names = (String) request.getAttribute("names");
            String surname = (String) request.getAttribute("surname");
        %>

        <p><%= id %> <%= names %> <%= surname %> has been added!</p>
        <br>

        <a href="add-worker.html" class="back-button">Add Another Worker</a>
    </div>
</body>
</html>
