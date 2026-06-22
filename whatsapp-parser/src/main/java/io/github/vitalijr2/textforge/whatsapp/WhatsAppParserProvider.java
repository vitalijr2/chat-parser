package io.github.vitalijr2.textforge.whatsapp;

import io.github.vitalijr2.textforge.chat.parser.ChatParser;
import io.github.vitalijr2.textforge.chat.parser.ChatParserProvider;
import io.github.vitalijr2.textforge.chat.parser.ChatSource;

public class WhatsAppParserProvider implements ChatParserProvider {

  @Override
  public ChatParser createParser() {
    return null;
  }

  @Override
  public boolean supports(ChatSource chatSource) {
    return false;
  }

}
