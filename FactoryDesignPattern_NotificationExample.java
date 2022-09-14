interface Notification
{
    public void pushNotification();
}

class EmailNotification implements Notification
{
    public void pushNotification()
    {
        System.out.println("Email Notification Sent");
    }
}

class SMSNotification implements Notification
{
    public void pushNotification()
    {
        System.out.println("SMS Notification Sent");
    }
}

class IOTNotification implements Notification
{
    public void pushNotification()
    {
        System.out.println("IOT Notification Sent");
    }
}

class NotificationFactory
{
    public Notification sendNotification(String notf)
    {
        if(notf.equalsIgnoreCase("Email")) return new EmailNotification();
        else if(notf.equalsIgnoreCase("SMS")) return new SMSNotification();
        else return new IOTNotification();
    }
}
public class Main
{
	public static void main(String[] args) {
		
		NotificationFactory notf = new NotificationFactory();
		Notification notfSend = notf.sendNotification("Em");
		notfSend.pushNotification();
	}
}
