package io.github.vitalijr2.textforge.whatsapp;

import io.github.vitalijr2.textforge.chat.ChatMessage;
import io.github.vitalijr2.textforge.chat.parser.ChatParser;
import io.github.vitalijr2.textforge.chat.parser.ChatSource;
import java.util.stream.Stream;

public class WhatsAppParser implements ChatParser {

  @Override
  public Stream<ChatMessage> parse(ChatSource chatSource) {
    return Stream.empty();
  }

}
