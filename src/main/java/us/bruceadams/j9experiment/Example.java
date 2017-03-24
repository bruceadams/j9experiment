package us.bruceadams.j9experiment;

import java.util.List;
import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

public class Example {

  public static void main(String[] args) {
    String username = "xxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxx";
    String password = "xxxxxxxxxxxx";
    if ( args.length < 2 ) {
      System.out.println("Using fake username and password.");
    } else {
      username = args[0];
      password = args[1];
    }

    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint("https://stream.watsonplatform.net/text-to-speech/api");

    List<Voice> voices = service.getVoices().execute();
    System.out.println(voices);
  }
}
