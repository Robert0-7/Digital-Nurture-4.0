public class TestNotifier {
    public static void main(String[] args) {
        // Basic notifier: Email
        Notifier basicNotifier = new EmailNotifier();

        // Add SMS notification
        Notifier smsNotifier = new SMSNotifierDecorator(basicNotifier);

        // Add Slack notification on top of SMS
        Notifier multiChannelNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send notification via all channels
        multiChannelNotifier.send("System will go down for maintenance at 11 PM.");
    }
}
