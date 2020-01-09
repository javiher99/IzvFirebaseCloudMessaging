package com.example.izvfirebasecloudmessaging.service;

        import android.util.Log;

        import com.google.firebase.messaging.FirebaseMessagingService;
        import com.google.firebase.messaging.RemoteMessage;

        import static androidx.constraintlayout.widget.Constraints.TAG;

public class HandleMessagesService extends FirebaseMessagingService {
    public HandleMessagesService() {
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "From: " + remoteMessage.getFrom());
        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data payload: " + remoteMessage.getData());

            if (true) {
                scheduleJob();
            } else {
                handleNow();
            }

        }

        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body: "
                    + remoteMessage.getNotification().getBody()
                    + remoteMessage.getNotification().getTitle());
        }
    }

    @Override
    public void onNewToken(String token) {
        // token + email, token + numTel
        // shared preferences se guarda el token + id (email, telefono, etc)
        // retrofit -> envio el token + id + (nombre del dispositivo)
        // segunda y sucesivas: token + id + token anterior + (nombre dispositivo)
        // retrofit -> mandas: new token + old token
        //
        //
        Log.d(TAG, "Refreshed token: " + token);
        sendRegistrationToServer(token);
        // Token: dms7KBdYrjM:APA91bHGUFPLMXf5yQgEfp9yD3vb_20QYCfVqUx_ZbVSAXCe2TpdCIR5KNMNkfSGHLozrLO_BACwJBhuOiu_g-ojTVstWnyb6mMVtLq3WBAFbVv7exk4Ra4-JOBXQz35T-5LubtrxDzI
    }

    private void sendRegistrationToServer(String token) {
    }

    private void handleNow() {

    }

    private void scheduleJob() {

    }
}