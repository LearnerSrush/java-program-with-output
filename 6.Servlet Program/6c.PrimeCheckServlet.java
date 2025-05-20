//6c. Build a servlet program to check the given number is prime number or not using HTML with step by step procedure.

//1. Create a new Dynamic Web Project in Eclipse:
//•	Follow the same steps as in the previous example to create a new Dynamic Web Project.
//•	Name it "PrimeCheckDemo".
//•	Choose your Apache Tomcat server as the target runtime.   
//2. Create the Servlet:
//•	Right-click on the "src" folder.
//•	Select "New" -> "Class".
//•	Name it "PrimeCheckServlet".
//•	Copy and paste the following Java code:
package PrimeNumber;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/primeCheck")
public class PrimeCheckServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Get the number from the form
            int number = Integer.parseInt(request.getParameter("number"));

            // Validate the input
            if (number <= 1) {
                throw new IllegalArgumentException("Number should be greater than 1");
            }

            // Check if the number is prime
            boolean isPrime = isPrime(number);

            // Generate the response
            out.println("<html><head><title>Prime Number Check Result</title>");
            out.println("<style>.container { margin: 20px; padding: 20px; border: 1px solid #ccc; border-radius: 5px; } </style>");
            out.println("</head><body><div class='container'>");
            out.println("<h2>Prime Number Check Result</h2>");
            out.println("<p>Number: " + number + "</p>");
            if (isPrime) {
                out.println("<p>" + number + " is a prime number.</p>");
            } else {
                out.println("<p>" + number + " is not a prime number.</p>");
            }
            out.println("<a href='index.html'>Check Another Number</a>");
            out.println("</div></body></html>");

        } catch (NumberFormatException e) {
            displayError(out, "Please enter a valid number");
        } catch (IllegalArgumentException e) {
            displayError(out, e.getMessage());
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void displayError(PrintWriter out, String message) {
        out.println("<html><head><title>Error</title></head><body>");
        out.println("<div style='margin: 20px; color: red;'><h2>Error</h2>");
        out.println("<p>" + message + "</p>");
        out.println("<a href='index.html'>Try Again</a></div></body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
//3. Create the HTML file:
//•	Right-click on the "WebContent" folder.
//•	Select "New" -> "HTML File".
//•	Name it "index.html".
//•	Copy and paste the following HTML code:
<!DOCTYPE html>
<html>
<head>
    <title>Prime Number Check</title>
    <style>
        .container {
            margin: 20px;
            padding: 20px;
            width: 300px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .form-group {
            margin: 10px 0;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Prime Number Check</h2>
        <form action="primeCheck" method="post">
            <div class="form-group">
                Enter a number:
                <input type="number" name="number" min="2" required>
            </div>
            <input type="submit" value="Check Prime">
        </form>
    </div>
</body>
</html>
