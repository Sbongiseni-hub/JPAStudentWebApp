<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.entity.Worker"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Added Workers</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        /* General Reset */
        body, h1, table, th, td, a {
            margin: 0;
            padding: 0;
            font-family: 'Arial', sans-serif;
        }

        body {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            min-height: 100vh;
            background: linear-gradient(to right, #FF7E5F, #FEB47B);
            color: white;
            text-align: center;
        }

        .container {
            background: rgba(0, 0, 0, 0.6);
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
            width: 95%;
            max-width: 1000px;
            margin-top: 30px;
            overflow-x: auto;
        }

        h1 {
            font-size: 2em;
            margin-bottom: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 12px 15px;
            border: 1px solid white;
            color: white;
        }

        th {
            background-color: #FF5733;
        }

        tr:nth-child(even) {
            background-color: rgba(255, 255, 255, 0.1);
        }

        .btn {
            box-sizing: border-box;
            width: 100%;
            max-width: 300px;
            padding: 15px 0;
            background-color: #FF5733;
            color: white;
            font-size: 1.1em;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-decoration: none;
            transition: background-color 0.3s ease;
            display: block;
            text-align: center;
            font-weight: 600;
            margin: 30px auto 0;
        }

        .btn:hover {
            background-color: #C0392B;
        }

        .btn:focus {
            outline: none;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Added Workers</h1>
        <%
            List<Worker> worker = (List<Worker>) request.getAttribute("worker");
        %>
        <table>
            <tr>
                <th>ID Number</th>
                <th>Name(s)</th>
                <th>Surname</th>
                <th>Date of Birth</th>
                <th>Physical Address</th>
                <th>Email Address</th>
                <th>Contact Number</th>
            </tr>
            <%
                if (worker != null && !worker.isEmpty()) {
                    for (Worker w : worker) {
            %>
            <tr>
                <td><%= w.getId() %></td>
                <td><%= w.getNames() %></td>
                <td><%= w.getSurname() %></td>
                <td><%= w.getBirthDate() %></td>
                <td><%= w.getAddress() %></td>
                <td><%= w.getEmail() %></td>
                <td><%= w.getPhoneNumber() %></td>
            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="7">No workers found.</td>
            </tr>
            <%
                }
            %>
        </table>

        <a href="menu.html" class="btn">Go Back</a>
    </div>
</body>
</html>
