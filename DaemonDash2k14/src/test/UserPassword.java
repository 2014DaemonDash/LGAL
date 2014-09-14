package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.Item.Type;

/**
 * Servlet implementation class UserPassword
 */
@WebServlet("/UserPassword")
public class UserPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        // read form fields
        String username = request.getParameter("username");
        String password = request.getParameter("password");
         
        //System.out.println("username: " + username);
        //System.out.println("password: " + password);
 
        // do some processing here...
         
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // load player information
        Player player = new Player("Ananth");
        Item bottle = new Item(Item.Type.BOTTLE);
        //player.rInventory.add(bottle);
        player.recycle(bottle);
        
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<p align =\"right\"><b>Player Name:</b> &nbsp" + player.getName() + 
        		"&nbsp &nbsp <b>Level:</b> &nbsp" + player.stats.getLevel() +"&nbsp <br> &nbsp"
        		+ "<b>Points:</b> &nbsp " + player.points.getEquip() + "&nbsp &nbsp &nbsp &nbsp &nbsp "
        	    + "<b>Exp:</b> &nbsp" + player.points.getExp() + "</br></br>" 
        		+ "<p align = \"center\"><b>STATS</b></br> </p><p align = \"left\"><b>Personal</b></br></br>Attack:&nbsp"
        	    + player.stats.getAttack() + "&nbsp &nbsp &nbsp Defense:&nbsp" + player.stats.getDefense() + "&nbsp&nbsp&nbsp Win/Loss:&nbsp1/2"
        	    + "</br><p align = \"left\">Speed:&nbsp" + player.stats.getSpeed() + "&nbsp &nbsp &nbsp"
        	    + "Hp:&nbsp" + player.stats.getHp() + "</br>";
        //htmlRespone += "<h2>Welcome " + player.getName() + "!<br/>";      
        //htmlRespone += "Your password is: " + password + "</h2>";    
        htmlRespone += "</br><b>Leaderboard</b></br><table><TABLE BORDER=\"5\"><TR>"
        + "</TH></TR><TH>Rank</TH><TH>Username</TH><TH>Level</TH><TH>Win/Loss</TH><TR><TD>1</TD>" 
        + "<TD>andrew</TD><TD>12</TD><TD>50/30</TD></TR>"
        + "<TR><TD>2</TD><TD>lgal</TD><TD>8</TD><TD>20/24</TD></TR>"
        + "<TR><TD>3</TD><TD>ana</TD><TD>6</TD><TD>15/26</TD></TR>"
        + "<TR><TD>4</TD><TD>" + player.getName() + "</TD><TD>" + player.stats.getLevel() + "</TD><TD>1/2</TD></TR></table>"
        + "<p align = \"center\"><b>EQUIPMENT</b></br></p><p align = \"left\">Attack Item: &nbsp"
        + "<img src = \"http://fc07.deviantart.net/fs70/i/2011/090/a/e/simple_sword_base_by_unmagnaomnimon-d3cxcb8.jpg\" height = 10% width = 10%>"
        + "Defense Item: &nbsp<img src = \"http://images.clipartpanda.com/shield-clipart-RcGKpKXcL.jpeg\" height = 10% width = 5%>"
        + "Speed Item: &nbsp<img src = \"http://4.bp.blogspot.com/_VYJh9oxhMSw/TM7xLQTCtxI/AAAAAAAAABo/YqVdG9jA0ds/s1600/Shoe-1.jpg\" height = 10% width = 10%>"
        + "Hp Item: &nbsp<img src = \"http://ep.yimg.com/ty/cdn/yhst-13741349772687/EdiblePaper1.jpg\" height = 10% width = 10%></p>"
        + "<button>id=\"Upgrade\" onclick=img src = \"http://thumbs.media.smithsonianmag.com//filer/6d/20/6d207ae8-0c3c-455a-8ff2-8d3a7cf37ce0/smithsonian-photo-contest-winner-2012-crop.jpg__800x600_q85_crop.jpg\"</button></html>";
         
        // return response
        writer.println(htmlRespone);
         
    }

}
